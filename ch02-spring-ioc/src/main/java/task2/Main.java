package task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_ab.xml");
        A a = context.getBean("a", A.class);
        A a2 = context.getBean("a", A.class);
        System.out.println("a = " + a);
        System.out.println("a2 = " + a2);
    }
}
