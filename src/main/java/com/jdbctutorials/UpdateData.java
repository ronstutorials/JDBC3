package com.jdbctutorials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "secret";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            int rowsaffected =  stmt.executeUpdate("update Contacts" + " set name = 'george'" + "where idContacts = 12");

            System.out.println("rows changed: " + rowsaffected);



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
