package com.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(String name,Integer id) {
        System.out.println(name);
        System.out.println("id = " + id);
        return "index";
    }

    @GetMapping("/index2")
    public String index2(@RequestParam(defaultValue = "张三") String name) {
        System.out.println(name);

        return "index";
    }

    @GetMapping("/index3/{name}")
    public String index3(String name) {
        System.out.println(name);
        return "index";
    }

}
