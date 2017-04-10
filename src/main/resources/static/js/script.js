$(document).ready(function() {

    $.post("/GetInfo",
        function (data) {
            var array = JSON.parse(data);
            var turn = -1;
            var moves = []
            for (var i in array) {
                moves.push(array[i])
                console.log(array[i])
            }
            console.log(moves);


            $('#roll').click(function () {
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
                    setTimeout(function () {
                        window.location.href = "winner" + moves[turn][0] + ".html";
                    }, 2000);
                }
                ;

            });


        });


    $(document).ready(function () {
        $('.modal-trigger, .modal-alignment').click(function () {
            $('.modal-trigger .fa-plus, .modal-trigger .fa-minus').toggle();
            $('.modal-alignment').toggleClass('flex-me');
        });
    });
});