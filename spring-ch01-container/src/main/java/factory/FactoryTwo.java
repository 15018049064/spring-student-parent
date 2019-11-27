package factory;

import org.springframework.beans.factory.FactoryBean;

public class FactoryTwo implements FactoryBean<Employee> {

    public Employee getObject() throws Exception {
        return new Employee();
    }

    public Class<?> getObjectType() {
        return Employee.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
