package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JamesHartanto on 4/6/17.
 */

@Controller
public class SnakesAndLaddersController {

    @Autowired
    SnakesAndLaddersService service;

    // Web root mapping
    @RequestMapping(value = "oneGame")
    public String oneGame(Model model) {
        model.addAttribute("oneGame", service.wholeGame());

        return "index";
    }
}
