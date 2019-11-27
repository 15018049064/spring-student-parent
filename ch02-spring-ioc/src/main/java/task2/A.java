package task2;

public class A {
    private B b;
    private String url;
    private String username;
    private String password;

    public A() {
    }

    public A(B b, String url, String username, String password) {
        this.b = b;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public A(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
