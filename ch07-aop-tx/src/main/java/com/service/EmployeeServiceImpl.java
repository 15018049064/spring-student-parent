package com.service;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;
    private DeptDao deptDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao, DeptDao deptDao) {
        this.employeeDao = employeeDao;
        this.deptDao = deptDao;
    }

    @Transactional
    @Override
    public void demo(int id,String name) {
        employeeDao.delete(id);
        deptDao.insert(name);
    }
}
