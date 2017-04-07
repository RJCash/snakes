package com.theironyard;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class SnakesAndLaddersServiceTest {

    @Test
    /**
     * Given a player at position 0
     * When the roll method is invoked
     * Then a number between 1 -6 is generated
     */
    public void rollMethod1To6(){
        // Arrange
        Player player = new Player(1,0,0);

        // Act
        SnakesAndLaddersService snakesAndLaddersService = new SnakesAndLaddersService();
        Player answer = snakesAndLaddersService.rollDice(player);
        // Assert
        if (answer.getDice()==3){
            assertThat(answer.getPosition(),equalTo(21));
        }else{
            assertThat(answer.getDice(),lessThan(7));
        }
    }

    @Test
    /**
     * Given a player and their current position 5
     * When the roll method is invoked
     * Then their current position is updated
     */
    public void rollMethodCurrentPosition(){
        // Arrange
        Player player = new Player(1,5,5);

        // Act
        SnakesAndLaddersService snakesAndLaddersService = new SnakesAndLaddersService();
        Player answer = snakesAndLaddersService.rollDice(player);

        // Assert
        if (answer.getDice()==3){
            assertThat(answer.getPosition(),equalTo(30));
        } else {
            assertThat(answer.getPosition(),lessThan(12));
        }
    }

    @Test
    /**
     * Given a player and their current position
     * When the player lands in a position with a snake
     * Then their current position falls to a particular value
     */
    public void playerLandsOnSnake(){
        // Arrange
        Player player = new Player(1,13,0);

        // Act
        SnakesAndLaddersService snakesAndLaddersService = new SnakesAndLaddersService();
        Player answer = snakesAndLaddersService.rollDice(player);

        // Assert
        if (answer.getDice()==4){
            assertThat(answer.getPosition(),equalTo(13));
        } else {
            assertThat(answer.getPosition(),greaterThan(13));
        }
    }

    @Test
    /**
     * Given a player and their current position
     * When the player lands in a position with a snake
     * Then their current position increases to a particular value
     */
    public void playerLandsOnLadder(){
        // Arrange
        Player player = new Player(1,2,0);

        // Act
        SnakesAndLaddersService snakesAndLaddersService = new SnakesAndLaddersService();
        Player answer = snakesAndLaddersService.rollDice(player);

        // Assert
        if (answer.getDice()==1){
            assertThat(answer.getPosition(),equalTo(21));
        } else {
            assertThat(answer.getPosition(),greaterThan(2));
        }
    }
}
