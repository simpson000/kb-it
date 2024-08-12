package org.scoula.jdbc_ex1.common;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class JDBCUtilTest {

    @Test
    void getConnection() throws SQLException {
        try(Connection conn = JDBCUtil.getConnection()) {
            System.out.println("Connected to database");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}