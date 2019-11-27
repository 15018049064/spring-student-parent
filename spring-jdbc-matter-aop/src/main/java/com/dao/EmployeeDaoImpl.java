package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao {

    public void delete(Connection conn, Integer id) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("delete from employee where deptid=?");
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
