package com.dao.impl;

import com.dao.BaseDao;
import com.dao.EmployeeDao;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {

    @Override
    public void delete(int id) {
        String sql = "delete from employee where deptid=?";
        template.update(sql,id);
    }
}
