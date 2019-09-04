package com.itokami1123.sample.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/view/main", method = RequestMethod.GET)
    public String login(Model model) {
        return "view/main";
    }
}