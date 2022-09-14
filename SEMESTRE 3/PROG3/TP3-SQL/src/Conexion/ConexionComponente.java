/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Componente;

/**
 *
 * @author Tano
 */
public class ConexionComponente extends Conexion {

    private final String SQL_INSERT = "INSERT INTO componente (Nombre, nroSerie, idComputadora) VALUES (?,?,?)";
   
    public boolean create (Componente componente) throws SQLException {

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, componente.getNombre());
            ps.setString(2, componente.getNroSerie());
            ps.setInt(3, componente.getComputadora().getIdCompu());

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

}
