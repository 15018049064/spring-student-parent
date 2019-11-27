package task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-task.xml");
       // A a = context.getBean("a", A.class);
        A a2 = context.getBean("a", A.class);
        A a3 = context.getBean("a", A.class);
        System.out.println(a2);
        System.out.println(a3);
        //System.out.println(a);
    }
}
