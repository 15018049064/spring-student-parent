package com.controller;

import com.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ValidationController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/validation")
    public ModelAndView index(@Valid Employee employee, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
            }
            System.out.println(employee);
            modelAndView.setViewName("/index");
        } else {
            modelAndView.setViewName("index2");
        }
        return modelAndView;
    }

}
