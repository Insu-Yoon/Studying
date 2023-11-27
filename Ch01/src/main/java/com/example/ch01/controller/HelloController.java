package com.example.ch01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello2(Model model){
        model.addAttribute("data","Hellooo!!");
        return "hello";
    }
}
