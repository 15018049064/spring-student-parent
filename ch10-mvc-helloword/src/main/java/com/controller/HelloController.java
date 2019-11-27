package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Component
public class HelloController  {

    @RequestMapping("/index")
    public static String handle() {
        return "hello";
    }

    @RequestMapping("/index2")
    public ModelAndView handle2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("view","hello word");
        modelAndView.addObject("view2","hello word2");
        modelAndView.addObject("view3","hello word3");
        modelAndView.setViewName("hello2");
        return modelAndView;
    }

//    @RequestMapping("/index3")
//    public String handle3(){
//        return "hello";
//    }

}
