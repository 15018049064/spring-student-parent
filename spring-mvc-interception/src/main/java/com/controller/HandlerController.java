package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HandlerController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/index2")
    public String index2() {
        return "index2";
    }


    @PostMapping("/login")
    public String index2(HttpSession session,String username, String password) {
        session.setAttribute("username",username);
        session.setAttribute("password",username);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String index3() {
        return "login";
    }

}
