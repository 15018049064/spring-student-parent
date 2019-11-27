package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;

import com.service.DeptByEmployeeService;

import org.springframework.transaction.annotation.Transactional;

//@Service
public class DeptByEmployeeServiceImpl implements DeptByEmployeeService {

    private DeptDao deptDao;

    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    @Override
    public void txDemo(int id, String name) {
        employeeDao.delete(id);
        deptDao.insert(name);
    }
}
