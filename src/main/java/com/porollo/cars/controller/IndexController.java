package com.porollo.cars.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getMessage() {
        return "Hello from public API controller on Index page";
    }
}