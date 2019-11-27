package com.dao;

import java.sql.Connection;

public interface EmployeeDao {
    void delete(Connection conn, Integer id);
}
