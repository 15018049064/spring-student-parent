package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void deleteDeptById(int id) {
        employeeDao.delete(id);
        deptDao.delete(id);
    }
}
