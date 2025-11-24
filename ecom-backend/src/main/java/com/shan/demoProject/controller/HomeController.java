package com.shan.demoProject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "welcome to home page";
    }
    @RequestMapping("/about")
    public String about(){
        return "we are in about section";
    }
}
