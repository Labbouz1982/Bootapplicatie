package com.capgemini.Springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootEndpoint {

    @GetMapping("hallo")
    public String lopen(){
        System.out.println("go");
        return "jojo";
    }


    }
