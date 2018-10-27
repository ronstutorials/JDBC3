package com.jdbctutorials;

import java.sql.*;

public class DeleteData {

    public static void main(String[] args) {

        String url;
        String user;
        String password;
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        PreparedStatement ps;
        ResultSet rs = ps.executeQuery();

        while (rs.next())

            



    }


}