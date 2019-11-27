package task;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean {
    private B b;

    public  A(B b,C c) {
        this.b = b;
        System.out.println("b = " + "构造函数");
    }


    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
        System.out.println("\"set方法\" = " + "set方法");
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }

    public void init() {
        System.out.println("init 方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(" = " + "wu ping jiao");
    }

}
