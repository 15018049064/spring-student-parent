package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/index1")
    public String demo1(HttpServletRequest req) {
        req.setAttribute("view","demo1 data");
        return "view";
    }

    @RequestMapping("/index2")
    public ModelAndView demo2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("view","demo2 data");
        modelAndView.setViewName("view");
        return modelAndView;
    }

    @RequestMapping("index3")
    public String demo3(Model model) {
        model.addAttribute("view","demo3 data");
        return "view";

    }


    @RequestMapping("/index4")
    public String demo4() {
        return "redirect:index44?view=index4 data";
    }

    @RequestMapping("/index44")
    public String demo44(String view,HttpServletRequest req) {
        req.setAttribute("view",view);
        return "view";
    }

    @RequestMapping("/index5")
    public String demo5(HttpSession session){
        session.setAttribute("view","index5 data");
        return "redirect:index55";
    }

    @RequestMapping("/index55")
    public String demo55() {
        return "view";
    }

    @RequestMapping("/index6")
    public String demo6(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("view","index6 data");
        return "redirect:index66";
    }

    @RequestMapping("index66")
    public String demo66() {
        return "view";
    }

}
