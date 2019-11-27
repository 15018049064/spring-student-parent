package com;

import javax.servlet.ServletContext;

public interface MyApplication {
    void onStartup(ServletContext sc);
}
