$(document).ready(function(){

  var turn = -1;
  var moves = [
    // {token: 1, location: 3, dice: 3},
    // {token: 2, location: 4, dice: 4},
    // {token: 1, location: 8, dice: 5},
    // {token: 2, location: 6, dice: 2}
    [1,3,3],
    [2,4,4],
    [1,8,5],
    [2,6,2],
    [1,105,97]
    // // {token: 1, location: 3, dice: 3},
    // // {token: 2, location: 4, dice: 4},
    // // {token: 1, location: 8, dice: 5},
    // // {token: 2, location: 6, dice: 2}
    // [1,3,3],
    // [2,4,4],
    // [1,8,5],
    // [2,6,2],
    // [1,105,92]
      [[${oneGame}]]
  ];

  $('#roll').click(function(){
    turn = turn + 1;

    var cellNumber = "#n" + moves[turn][1];
    var playerNumber = ".player" + moves[turn][0];
    var diceNumber = moves[turn][2];
    $(cellNumber + " " + playerNumber).css("display", "block");

    document.querySelector('#current-dice-roll p').innerHTML = "PLAYER " + moves[turn][0] + " rolled:";
    document.querySelector('#current-dice-roll h1').innerHTML = diceNumber;

    var lastTurn = turn - 2;
    var lastCellNumber = "#n" + moves[lastTurn][1];
    var lastPlayerNumber = ".player" + moves[lastTurn][0];
    var lastDiceNumber = moves[lastTurn][2];
    $(lastCellNumber + " " + lastPlayerNumber).css("display", "none");

    if (cellNumber == "#n100" || cellNumber == "#n101" || cellNumber == "#n102" || cellNumber == "#n103" || cellNumber == "#n104" || cellNumber == "#n105") {
      console.log("test");
      $("#n100" + " " + playerNumber).css("display", "block");
      setTimeout(function(){
        window.location.href = "winner" + moves[turn][0] + ".html";
      }, 2000);
    };

  });



});


$(document).ready(function(){
  $('.modal-trigger, .modal-alignment').click(function(){
    $('.modal-trigger .fa-plus, .modal-trigger .fa-minus').toggle();
    $('.modal-alignment').toggleClass('flex-me');
  });
});
