package com.service;

import com.dao.DeotDao;
import com.dao.EmployeeDao;

import java.sql.Connection;

public class EmployeeServiceImpl implements EmployeeService {
    private DeotDao deptDao;
    private EmployeeDao employeeDao;

    public void setDeptDao(DeotDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void deleteDeptWithEmps(Connection conn, Integer id) {
        employeeDao.delete(conn, id);
        deptDao.delete(conn, id);
    }


}
