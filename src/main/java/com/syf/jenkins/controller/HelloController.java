package com.syf.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by syf on 2019/3/18.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/say")
    public String Hello(){

        System.out.println("123");
        return "123" ;
    }
}
