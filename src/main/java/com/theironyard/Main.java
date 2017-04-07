package com.theironyard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class Main {

    public static void main(String[] args) {
        SnakesAndLaddersService snakesAndLaddersService = new SnakesAndLaddersService();

        // 2 Players
        Player player1 = new Player(1,0,0);
        Player player2 = new Player(2,0,0);

        // All the moves
        ArrayList<int[]> moves = new ArrayList<>();
//        // PLAN B
//        ArrayList<Player> moves = new ArrayList<>();

        while(true){
            // roll and store as variable
            Player player1roll = snakesAndLaddersService.rollDice(player1);
            Player player2roll = snakesAndLaddersService.rollDice(player2);

            // adding Players to array
            int[] player1data = new int[]{player1.getId(),player1roll.getPosition(),player1roll.getDice()};
            moves.add(player1data);
            int[] player2data = new int[]{player2.getId(),player2roll.getPosition(),player2roll.getDice()};
            moves.add(player2data);
//            // PLAN B
//            moves.add(player1roll);
//            moves.add(player2roll);

            // updating their position
            player1.setPosition(player1roll.getPosition());
            player2.setPosition(player2roll.getPosition());

            // condition to end game
            if (snakesAndLaddersService.winner(player1, player2)){
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(moves);
                break;
            }
        }
    }
}
