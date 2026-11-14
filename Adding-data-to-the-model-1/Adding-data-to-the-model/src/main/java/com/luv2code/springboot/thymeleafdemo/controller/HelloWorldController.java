package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm() {
        return "redirect:/Movie";
    }

    @GetMapping("/Movie")
    public String showMovieForm() {
        return "helloworld-form";
    }

    @GetMapping("/MovieName")
    public String movieName(@RequestParam("movieName") String movieName, Model model) {
        model.addAttribute("movieName", movieName);
        return "helloworld";
    }
}