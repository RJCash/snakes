package com.theironyard;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class Player {
    private int id;
    private int position;
    private int dice;


    public Player(int id, int position, int dice) {
        this.id = id;
        this.position = position;
        this.dice = dice;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
}
