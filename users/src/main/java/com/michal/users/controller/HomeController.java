package com.michal.users.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
class HomeController {
    @GetMapping("/api/v1/hello")
    public String home()
    {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }
}