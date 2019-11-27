package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyApplicationImpl implements MyApplication {
    @Override
    public void onStartup(ServletContext sc) {
        ServletRegistration.Dynamic application = sc.addServlet("application", new MyApplicationServlet());
        application.addMapping("/app");
    }
}
