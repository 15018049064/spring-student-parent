package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_basic.xml");
        UserInfo userInfo = context.getBean("addr", UserInfo.class);
        DbConfig dbConfig = new DbConfig("a","b","v");
        ArrayList<DbConfig> dbConfigs = new ArrayList<DbConfig>();
        dbConfigs.add(dbConfig);
        dbConfig.setDriverclassname("driver");
        userInfo.setList(dbConfigs);
        System.out.println("userInfo = " + userInfo);


    }
}
