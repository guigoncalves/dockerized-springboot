package com.example.gsg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/healthy")
    public String getHealthStatus() {
        return "Application is healthy";
    }
}
