package com.example.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HiController {

    @GetMapping("/")
    public String hello() {return "index";}
}
