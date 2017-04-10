package com.theironyard;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rickiecashwell on 4/9/17.
 */
@RestController
public class Api {
    //@RequestParam("id") String id,
    @PostMapping("/GetInfo")
    public String getDataToSend(){
        //should print “getting data” to ide console
        Tester test = new Tester();

        //return json string
        return test.getJson();
    }
}