package com.theironyard;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class PlayerTest {
    @Test
    /**
     * Given a player
     * When the player information is requested
     * Then the information (id,name,position) is given back
     */
    public void playerInformation(){
        // Arrange
        Player player = new Player(1,0,0);

        // Act
        int id = player.getId();
        int position = player.getPosition();
        int dice = player.getDice();

        // Assert
        assertThat(id,equalTo(1));
        assertThat(position,equalTo(0));
        assertThat(dice,equalTo(0));
    }
}
