package com.example.herokutest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hallo {
    @GetMapping
    public String sayHallo(){
        return "Hallo, wie geht's?";
    }
}
