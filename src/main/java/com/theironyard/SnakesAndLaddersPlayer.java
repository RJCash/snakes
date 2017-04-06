package com.theironyard;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class SnakesAndLaddersPlayer {
    private int id;
    private String name;
    private int position;

    public SnakesAndLaddersPlayer(int id, String name, int position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
