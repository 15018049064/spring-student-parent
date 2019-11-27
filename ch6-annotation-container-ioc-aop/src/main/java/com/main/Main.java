package com.main;

import com.file.ReadFile;
import com.service.EmployeeService;
import com.service.impl.CountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        context();
       //aop();
        //getFile();
    }
    private static void context() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService bean = context.getBean(EmployeeService.class);
        EmployeeService bean2 = context.getBean(EmployeeService.class);
        System.out.println(bean);
        System.out.println(bean2);

        bean.update();



        ((ConfigurableApplicationContext)context).close();
    }
    public static void aop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        EmployeeService bean = context.getBean(EmployeeService.class);
//        bean.update();
        CountServiceImpl bean = context.getBean(CountServiceImpl.class);
        int count = bean.count(1, 2);
        System.out.println("count = " + count);


    }

    public static void getFile() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ReadFile bean = context.getBean(ReadFile.class);
        String fileName = bean.getFileName();
        System.out.println("fileName = " + fileName);
    }
}
