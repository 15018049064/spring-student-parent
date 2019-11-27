package com.service.impl;

import com.dao.EmployeeDao;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//相当于被spring管理
@Service
//作用域
@Scope("singleton")
public class EmployeeServiceImpl implements EmployeeService {
    //自动注入
    @Autowired
    @Qualifier("dao")
    private EmployeeDao dao;

    @Override
    public void update() {
        dao.update();
    }


}
