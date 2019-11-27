package com.controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileInterception implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String password = (String) request.getSession().getAttribute("password");
        String username = (String) request.getSession().getAttribute("username");
        if(username == null || password == null) {
            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }
        return true;
    }
}
