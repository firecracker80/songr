package com.vinyl.songr.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("/capitalize/{cap}")
    public static String toUpperCase(@PathVariable String cap, Model c){

        c.addAttribute("cap", cap);
        return cap;
    }
}
