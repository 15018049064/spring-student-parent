package com.dao.impl;

import com.dao.DeptDao;

import org.springframework.jdbc.core.JdbcTemplate;


//@Repository
public class DeptDaoImpl implements DeptDao {

//    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(String name) {
        String sql = "insert into dept(deptname) values(?)";
        jdbcTemplate.update(sql,name);
    }
}
