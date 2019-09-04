package com.itokami1123.sample.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/view/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "view/login";
    }

    @RequestMapping(value = "/view/auth", method = RequestMethod.GET)
    public String auth(Model model) {
        return "redirect:" + "main";
    }
}