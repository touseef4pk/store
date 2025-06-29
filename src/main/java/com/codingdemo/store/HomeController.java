package com.codingdemo.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/contact")
    public String index(){

        System.out.println("Hello world");
        return "feature change for PR";
    }

    @RequestMapping("/contact")
    public String getContact(){

        return "stash contact";
    }
}
