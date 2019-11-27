package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factory_lifecycle.xml");

        EmployeeDaoLifeCycle2 lifecycle = context.getBean("lifecycle", EmployeeDaoLifeCycle2.class);
        ((ConfigurableApplicationContext)context).close();
    }
}
