/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author wassimsaoud
 */
public class connection_BD {
       private static final String URL = "jdbc:mysql://viaduct.proxy.rlwy.net:35716/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "ftKAdhPyVNxpCGwUjNCABFIzUfyjuhgJ";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (SQLException e) {
            throw new RuntimeException("Erreur de connexion à la base de données", e);
        }
    }
    
}
