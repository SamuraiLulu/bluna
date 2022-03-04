package com.bluna.bluna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    /**
     * 시작 화면. 로그인 & 회원가입 화면으로 이동
     * @return login.jsp
     */
    @GetMapping("/")
    public String checkLogin() {
        return "login/login";
    }

    /**
     * 로그인 완료 후 메인 화면으로 이동
     * @return
     */
    @PostMapping("/default")
    public String mian() {
        return "default";
    }
}
