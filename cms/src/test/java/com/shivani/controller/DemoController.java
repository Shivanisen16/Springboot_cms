package com.shivani.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Hello World";
    }
}
