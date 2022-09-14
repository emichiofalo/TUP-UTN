/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Computadora;
import java.sql.SQLException;

/**
 *
 * @author Tano
 */
public class ConexionComputadora extends Conexion {

    private final String SQL_INSERT = "INSERT INTO Computadora (Codigo, Marca, Modelo) VALUES (?,?,?)";

    public boolean create(Computadora computadora) throws SQLException {

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, computadora.getCodigo());
            ps.setString(2, computadora.getMarca());
            ps.setString(3, computadora.getModelo());

            ps.executeUpdate();
            conn.commit();
            System.out.println("Agregado Con Exito");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al Crear : " + e);
            conn.rollback();
            return false;

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
        }
    }
    
    public int getIdCompu() {
        final String SQL_GET_ID_COMPU = "SELECT Computadora.Id FROM Computadora ORDER BY ID DESC LIMIT 1;";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = Conexion.getConnection().prepareStatement(SQL_GET_ID_COMPU);
            rs = ps.executeQuery();

            while (rs.next()) {
                int i = rs.getInt(1);
                return i;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
        }
        return 0;
    }
}
