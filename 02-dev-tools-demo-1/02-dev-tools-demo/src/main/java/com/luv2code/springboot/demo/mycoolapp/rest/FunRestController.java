package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Thomas Liftinger";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/movie")
    public String getDailyWorkout() {
        return "Interstellar";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/music")
    public String getDailyFortune() {
        return "Country or Pop";
    }

}






