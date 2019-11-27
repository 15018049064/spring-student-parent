package com.dao.impl;

import com.dao.EmployeeDao;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {
    @Override
    public void delete(int id) {
        String sql = "delete employee where deptid=?";
        jdbcTemplate.update(sql,id);
    }
}
