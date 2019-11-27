package factory;

public class FactoryNoe {
    private static Employee employee = new Employee();

    public static Employee getFactory() {
        return employee;
    }
    public Employee getFactory2() {
        return new Employee();
    }

    public FactoryNoe() {
        System.out.println(666);
    }

}
