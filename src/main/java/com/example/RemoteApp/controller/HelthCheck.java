package com.example.RemoteApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/helth-check")
public class HelthCheck {

    @GetMapping
    public String helthCheck() {
        return "Working fine";
    }
}
