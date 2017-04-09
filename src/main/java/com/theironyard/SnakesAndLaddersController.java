package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JamesHartanto on 4/6/17.
 */

// How to make it work? PLAN A
    // 1) Create the arraylist of array of ints that resemble the whole game
    // 2) send the game to javascript, moves
// Things to be aware of
    // 1) Do NOT want to reference the oneGame method while the game is playing - do not want to create another set of
        // array of ints...

@Controller
public class SnakesAndLaddersController {

    @Autowired
    SnakesAndLaddersService service;

    // Web root mapping
    @RequestMapping("/")
    public String oneGame(Model model){
        model.addAttribute("oneGame",service.wholeGame());

        return "index";

    }


}
