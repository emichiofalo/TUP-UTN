/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author sebastiansulia
 */
public class Conexion {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATA_BASE = "productos";
    private static final String SSL = "?useSSL=false";
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "mysql";
    
    public static Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(URL + DATA_BASE + SSL, USER_NAME, PASSWORD);
            if (conexion != null) {
                System.out.println("Conexión Exitosa!");
                System.out.println("Conectado a : " + URL + DATA_BASE + SSL);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error De Conexión! :  " + e);
            JOptionPane.showMessageDialog(null, "Error De Conexión A Base De Datos!\n " + e);
            System.exit(0);

        }

        return conexion;

    }
    
     public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
