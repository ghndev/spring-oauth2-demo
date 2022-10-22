package com.example.oauth2.controller;

import com.example.oauth2.config.auth.LoginUser;
import com.example.oauth2.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("username", user.getUsername());
        }
        return "home";
    }
}
