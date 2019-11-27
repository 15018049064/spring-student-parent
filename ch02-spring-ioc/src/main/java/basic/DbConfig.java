package basic;

public class DbConfig {

    private String url;
    private String username;
    private String password;
    private String driverclassname;

    public DbConfig(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public DbConfig() {
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

    public String getDriverclassname() {
        return driverclassname;
    }

    public void setDriverclassname(String driverclassname) {
        this.driverclassname = driverclassname;
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", driverclassname='" + driverclassname + '\'' +
                '}';
    }
}
