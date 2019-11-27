package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//当有多个候选时，可以用@Primary注解进行标明也可以用@Qualifier注解参数带bean的名字
//@Primary
public class EmployeeDaoImpl2 implements EmployeeDao {
    @Override
    public void update() {
        System.out.println("employeeDaoImpl22 -------------");
    }
}
