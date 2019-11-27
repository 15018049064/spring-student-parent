package com;


import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(MyApplication.class)
public class MyServletContextInit implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
//        ServletRegistration.Dynamic first =
//                ctx.addServlet("first", new FirstServlet());
//        first.addMapping("/first");

        for (Class<?> aClass : c) {
            if (MyApplication.class.isAssignableFrom(aClass)) {
                try {
                    MyApplication o = (MyApplication) aClass.newInstance();
                    o.onStartup(ctx);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
