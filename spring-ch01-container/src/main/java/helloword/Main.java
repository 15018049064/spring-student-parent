package helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao first = (EmployeeDao) context.getBean("first");
        System.out.println(first);

        EmployeeDao first2 = context.getBean("first", EmployeeDao.class);
        System.out.println("first2 = " + first2);

    }
}
