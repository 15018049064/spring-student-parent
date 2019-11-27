package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factory.xml");
        //Employee factory = context.getBean("factory", Employee.class);
//        String name = factory.getClass().getName();
//        System.out.println(name);
        Employee factory1 = context.getBean("factory3", Employee.class);
        Employee factory2 = context.getBean("factory3", Employee.class);
        System.out.println(factory1);
        System.out.println(factory2);
    }
}
