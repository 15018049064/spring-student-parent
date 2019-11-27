package basic;

import javafx.beans.property.Property;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserInfo {
    private String string;
    private DbConfig dbConfig;

    private List<DbConfig> list;

    private Map<String,Integer> map;
    private Set<String> set;
    private Properties properties;

    public UserInfo() {
    }

    public UserInfo(String string, DbConfig dbConfig, List<DbConfig> list, Map<String, Integer> map, Set<String> set) {
        this.string = string;
        this.dbConfig = dbConfig;
        this.list = list;
        this.map = map;
        this.set = set;
    }


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public DbConfig getDbConfig() {
        return dbConfig;
    }

    public void setDbConfig(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    public List<DbConfig> getList() {
        return list;
    }

    public void setList(List<DbConfig> list) {
        this.list = list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "string='" + string + '\'' +
                ", dbConfig=" + dbConfig +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", properties=" + properties +
                '}';
    }
}
