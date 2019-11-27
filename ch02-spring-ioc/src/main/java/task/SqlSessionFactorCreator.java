package task;

import java.util.Properties;

public class SqlSessionFactorCreator {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public SqlSessionFactory getFactory() {
        return new SqlSessionFactory(properties);
    }

}
