package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

/**
 * Created by JamesHartanto on 4/6/17.
 */
public class SnakesAndLaddersRepository {

    @Autowired
    JdbcTemplate template;

    // Upload arraylist to database
    public void updateDatabase(Integer id, Integer playerMove) {
        template.update("INSERT INTO snakesandladders " +
                        "(id, postion) " +
                        "VALUES (?,?)",
                id, playerMove
        );
    }

    // Clear database table
    public void clearDatabase() {
        template.update("DELETE * FROM snakesandladders");
    }
}
