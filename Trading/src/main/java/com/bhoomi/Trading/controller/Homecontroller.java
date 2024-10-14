package com.bhoomi.Trading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @GetMapping("/")
    public String home(){
        return "welcome to trading platform";
    }
}
