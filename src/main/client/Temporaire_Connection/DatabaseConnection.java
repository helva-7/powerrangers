/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporaire_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/projet_s6";
    private static final String USER = "root";
    private static final String PASSWORD = "";


    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to database successful!"); // Successful connection message
            return conn;
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage()); // Error message
            return null;
        }
    }
}

