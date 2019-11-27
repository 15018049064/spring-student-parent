package com.controller;

import com.entity.Emp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/formatter")
public class DateController {

//    @InitBinder
//    public void getDate(WebDataBinder dataBinder) {
//        dataBinder.addCustomFormatter(new EmpFormatter());
//        dataBinder.addCustomFormatter(new DateFormatter());
//    }

    @GetMapping("/date")
    public String index(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {

        System.out.println("format = " + date);
        return "index";
    }

    @GetMapping("/emp")
    public String index2(@RequestParam(value = "emp") Emp emp) {
        System.out.println("date = " + emp);
        return "index";
    }
}
