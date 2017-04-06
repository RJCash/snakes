package com.theironyard;

import java.util.ArrayList;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class Main {

    public static void main(String[] args) {
        SnakesAndLaddersService snakesAndLaddersService = new SnakesAndLaddersService();
        SnakesAndLaddersRepository repo = new SnakesAndLaddersRepository();

        // players
        SnakesAndLaddersPlayer player1 = new SnakesAndLaddersPlayer(1,"Player1",0);
        SnakesAndLaddersPlayer player2 = new SnakesAndLaddersPlayer(2,"Player2",0);
//        // moves
//        ArrayList<Integer> player1moves = new ArrayList<>();
//        ArrayList<Integer> player2moves = new ArrayList<>();

        while(true){
            // store integers
            int player1position = snakesAndLaddersService.rollDice(player1.getPosition());
            int player2position = snakesAndLaddersService.rollDice(player2.getPosition());
//            // adding integers to array
//            player1moves.add(player1position);
//            player2moves.add(player2position);
            // updating their position
            player1.setPosition(player1position);
            player2.setPosition(player2position);
            // condition to end game
            if (snakesAndLaddersService.winner(player1, player2)){
                // sending array to database
                repo.updateDatabase(1,player1position);
                repo.updateDatabase(2,player2position);
                break;
            }
        }
    }
}
