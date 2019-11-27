package com.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class ReadFile {

    @Autowired
   private Environment environment;

    public String getFileName() {
        return environment.getProperty("jdbc.username");
    }
//    @Value("${jdbc.username:default}")
//    private String environment;


//    public String getFileName() {
//       return environment;
//    }
}
