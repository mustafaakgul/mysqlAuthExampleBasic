package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @RequestMapping("/user")
    public String showUserMsg()
    {
        return "User has logged in!!!";

    }

    @RequestMapping("/admin")
    public String showAdminMsg()
    {
        return "Admin has logged in!!!";
    }
}
