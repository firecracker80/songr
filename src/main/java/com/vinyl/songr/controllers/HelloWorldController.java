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
    public String getHello(Model h){
        h.addAttribute("cap", "hello");
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String getHelloName(@PathVariable String name, Model h){
        h.addAttribute("cap", "hello " + name);
        return "hello";
    }

    @GetMapping("/capitalize/{cap}")
    public String toUpperCase(@PathVariable String cap, Model c){

        c.addAttribute("cap", cap.toUpperCase());
        return "hello";
    }
}
