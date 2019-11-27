package com.dao.impl;

import com.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDaoImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(String name) {
        String sql = "insert into dept(deptname) values(?)";
        jdbcTemplate.update(sql,name);
    }
}
