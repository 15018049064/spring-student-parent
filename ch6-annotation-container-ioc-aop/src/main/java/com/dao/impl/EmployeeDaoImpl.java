package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 相当于被spring管理
 * bean的名字是默认类名，首字母小写，当Repository 带一个字符串值时，
 * 那么这个值就是bean的名字
 */
@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void update() {
        System.out.println("employeeDaoImpl1=========");
    }
    //实例化之后执行
    @PostConstruct
    public void init() {
        System.out.println("init======");
    }

    //销毁容器之后执行
    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
