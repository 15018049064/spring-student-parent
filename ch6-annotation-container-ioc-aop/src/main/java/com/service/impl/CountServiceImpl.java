package com.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl {
    public int count(int x,int y) {
        System.out.println("afterThrowing---");
       // throw new RuntimeException();
        return x + y;
    }
}
