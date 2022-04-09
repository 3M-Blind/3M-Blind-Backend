package com.blind.blind_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HomeController {
    @GetMapping("/test2")
    public String home(){
        return "home";
    }
}

