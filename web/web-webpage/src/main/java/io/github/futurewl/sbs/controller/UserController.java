package io.github.futurewl.sbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/templates")
    public String html(Model model) {
        model.addAttribute("key","hello,world");
        return "index";
    }

}
