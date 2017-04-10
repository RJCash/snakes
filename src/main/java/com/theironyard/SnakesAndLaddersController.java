package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JamesHartanto on 4/6/17.
 */

@Controller
public class SnakesAndLaddersController {


    // Web root mapping
    @RequestMapping("/")
    public String snakes(Model model) {

        return "index";
    }
}