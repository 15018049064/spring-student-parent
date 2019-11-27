package task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_task.xml");
        SqlSessionFactory sql1 = context.getBean("sql", SqlSessionFactory.class);
        System.out.println(sql1);
    }
}
