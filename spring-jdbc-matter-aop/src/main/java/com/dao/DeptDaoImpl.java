package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDaoImpl implements DeotDao {

    public void delete(Connection conn, Integer id) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("delete from dept where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

}
