package com.main;

import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        employeeService.deleteDeptById(145);
    }
}
