package aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aware.xml");
        SomeBean aware = context.getBean("aware", SomeBean.class);
        ApplicationContext context1 = aware.getContext();
        System.out.println(context == context1);
    }
}
