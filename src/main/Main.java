/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wassimsaoud
 */
public class Main {
    
    public static void main(String[] args) {
        // Test the database connection
        try {
            Connection conn = connection_BD.getConnection();
            if (conn != null) {
                System.out.println("Connection to the database was successful!");
                conn.close();  // It's important to close the connection when you're done with it
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
    }
}


