package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.awt.im.spi.InputMethodContext;
import java.lang.reflect.InvocationHandler;

public class EmployeeDaoLifeCycle2 implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("这是init");
    }

    public void destroy() throws Exception {
        System.out.println("这是destroy ");
    }
}
