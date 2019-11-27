package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void delete(int id) {
        String sql = "delete from employee where id=?";
        jdbcTemplate.update(sql,id);
    }
}
