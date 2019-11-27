package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/view")
public class ViewController {

    @RequestMapping("/demo1")
    public String index(HttpServletRequest req) {
        req.setAttribute("view","view demo1");
        return "view";
    }

    @RequestMapping("/demo2")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("view","view demo2");
        modelAndView.setViewName("view");
        return modelAndView;
    }

    //转发到另一个地址去
    @RequestMapping("/demo3")
    public String index3(HttpServletRequest req) {
        req.setAttribute("view","view demo3");
        return "forward:demo1";
    }

    @RequestMapping("/demo4")
    public String index4() {
        return "redirect:demo1";
    }

    @RequestMapping("/demo5")
    public RedirectView index5() {
        RedirectView redirectView = new RedirectView("demo1");
        return redirectView;
    }

}
