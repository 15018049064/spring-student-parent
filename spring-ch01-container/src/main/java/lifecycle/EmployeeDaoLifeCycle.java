package lifecycle;

public class EmployeeDaoLifeCycle {
    public void into() {
        System.out.println("into");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
