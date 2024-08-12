package org.scoula.jdbc_ex.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;


import java.sql.SQLException;
class JDBCUtilTest {

    @Test
    @DisplayName("db접속 한다잉")
    void getConnection() throws SQLException {

        try (Connection conn = JDBCUtil.getConnection()){
            System.out.println("연결성공");

        }
    }
}