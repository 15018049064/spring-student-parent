package config;

import config.MyConfig;
import org.springframework.cglib.transform.impl.InterceptFieldFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;


public class MyInit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(MyConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

        ServletRegistration.Dynamic config =
                servletContext.addServlet("config", dispatcherServlet);
        config.addMapping("/");
    }
}
