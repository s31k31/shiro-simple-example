package com.seikei.shiroexample.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @PostMapping("/doLogin")
    public void doLogin(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username, password));
            System.out.println("login success");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("login failed");
        }
    }

    @RequestMapping("/login")
    public String  login() {
        return "please login!";
    }



}