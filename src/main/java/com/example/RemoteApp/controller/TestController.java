package com.example.RemoteApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/football")
    public String getFootBall() {
        return "Foot ball";
    }

    @GetMapping("cricket")
    public String getCricket() {
        return "cricket";
    }
}
