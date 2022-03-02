package com.bluna.bluna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String CheckLogin() {
        return "/login/login";
    }
}
