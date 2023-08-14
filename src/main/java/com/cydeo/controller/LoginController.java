package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class LoginController {
    @RequestMapping("login/{email}/{phone}")
    public String login(@PathVariable String email, @PathVariable String phone, Model model){

        HashMap<String, String> messages = new HashMap<>();
        messages.put("email",email);
        messages.put("phoneNumber",phone);
        messages.put("loginMessage","Login success, welcome to Cydeo");

        model.addAllAttributes(messages);

        return "login/login-info";
    }
}
