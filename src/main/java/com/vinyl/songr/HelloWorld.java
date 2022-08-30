package com.vinyl.songr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
    @ResponseBody
    public String getTest(){
        return "Hello World";
    }
    @GetMapping("/capitalize")
    public static String toUpperCase(String str){
        return str;
    }
}
