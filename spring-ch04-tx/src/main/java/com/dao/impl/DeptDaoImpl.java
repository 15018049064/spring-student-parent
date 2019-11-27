package com.dao.impl;

import com.dao.BaseDao;
import com.dao.DeptDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeptDaoImpl extends BaseDao implements DeptDao {


    @Override
    public void delete(int id) {
        String sql = "delete from dept where id=?";
        template.update(sql,id);
    }
}
