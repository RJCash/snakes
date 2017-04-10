package com.theironyard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class SnakesAndLaddersService {

    // The whole game !! stored as array of array of int
    public String wholeGame() {
        // 2 Players
        Player player1 = new Player(1, 0, 0);
        Player player2 = new Player(2, 0, 0);

        // All the moves using json String to store the moves, plan B is array of players
        String json;
        ArrayList<int[]> moves = new ArrayList<>();
//        // PLAN B
//        ArrayList<Player> moves = new ArrayList<>();

        while (true) {
            // roll and store as variable
            Player player1roll = rollDice(player1);
            Player player2roll = rollDice(player2);

            // adding Players to array
            int[] player1data = new int[]{player1.getId(), player1roll.getPosition(), player1roll.getDice()};
            moves.add(player1data);
            int[] player2data = new int[]{player2.getId(), player2roll.getPosition(), player2roll.getDice()};
            moves.add(player2data);
//            // PLAN B
//            moves.add(player1roll);
//            moves.add(player2roll);

            // updating their position
            player1.setPosition(player1roll.getPosition());
            player2.setPosition(player2roll.getPosition());

            // condition to end game
            if (winner(player1, player2)) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                json = gson.toJson(moves);
                break;
            }
        }
        return json;
//        return moves;
    }


    // The game method
    public Player rollDice(Player player) {
        // Roll dice
        Random random = new Random();
        int rand = random.nextInt(6) + 1;
        // updates position
        int x = player.getPosition() + rand;

        // SNAKES !!
        if (x == 17) {
            x = 13;
        }
        if (x == 52) {
            x = 29;
        }
        if (x == 57) {
            x = 40;
        }
        if (x == 62) {
            x = 22;
        }
        if (x == 88) {
            x = 18;
        }
        if (x == 95) {
            x = 51;
        }
        if (x == 97) {
            x = 79;
        }

        // LADDERS !!
        if (x == 3) {
            x = 21;
        }
        if (x == 8) {
            x = 30;
        }
        if (x == 28) {
            x = 84;
        }
        if (x == 58) {
            x = 77;
        }
        if (x == 75) {
            x = 86;
        }
        if (x == 80) {
            x = 100;
        }
        if (x == 90) {
            x = 91;
        }

        if (x >= 100) {
            x = 100;
        }

        Player updatePlayer = new Player(player.getId(), x, rand);
        return updatePlayer;
    }

    // winner condition
    public boolean winner(Player player1, Player player2){
        if (player1.getPosition() == 100){
            System.out.println(player1.getId() + " WON!");
            return true;
        } else if (player2.getPosition() == 100){
            System.out.println(player2.getId() + " WON!");
            return true;
        } return false;
    }
}
