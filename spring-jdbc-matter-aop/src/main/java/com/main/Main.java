package com.main;

import com.service.EmployeeService;
import com.util.SqlConnectionUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_advisor.xml");
        EmployeeService empService = context.getBean("employeeService", EmployeeService.class);
        Connection conn = SqlConnectionUtil.getConnection();
        empService.deleteDeptWithEmps(conn,142);
    }
}
