/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import static Datos.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.*;

/**
 *
 * @author Emi Chiófalo
 */
public class EntradaDAO extends Conexion {

    private final String SQL_INSERT = "INSERT INTO Entrada (entrada_patente, entrada_funcion, entrada_precio) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM Entrada";
    private final String SQL_DELETE = "DELETE FROM Entrada WHERE entrada_id=?";
    private final String SQL_FIND = "SELECT * FROM Entrada WHERE entrada_id=?";
    private final String SQL_FINDENTRADASFUNCION = "SELECT entrada_id FROM Entrada WHERE entrada_funcion=?";
    
    public boolean create(EntradaModelo entrada) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, entrada.getPatente());
            ps.setInt(2, entrada.getFuncion().getNroFuncion());
            ps.setFloat(3, entrada.getPrecio());

            ps.executeUpdate();

            System.out.println("Agregado Con Exito");

            return true;
        } catch (SQLException e) {
            System.out.println("Error al Crear : " + e);
            return false;

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
        }
    }

    public List<EntradaModelo> read() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        EntradaModelo entrada;
        FuncionModelo funcion = new FuncionModelo();
        List<EntradaModelo> listaEntradas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                entrada = new EntradaModelo();
                
                entrada.setNumero(rs.getInt(1));
                entrada.setPatente(rs.getString(2));
                entrada.setFuncion(funcion.findFuncionCod(rs.getInt(3)));   
                entrada.setPrecioComprado(rs.getFloat(4));

                listaEntradas.add(entrada);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return listaEntradas;
    }

    public int readDisponibles(int codigoFuncion) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        EntradaModelo entrada;
        FuncionModelo funcion = new FuncionModelo();
        int contadorOcupadas = 0;
        //encontrar cuantas entradas tienen esa funcion
        
        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_FINDENTRADASFUNCION);
            ps.setInt(1, codigoFuncion);
            rs = ps.executeQuery();

            while (rs.next()) {
                contadorOcupadas++;
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return contadorOcupadas;
    }

    public boolean delete(int entradaCod) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, entradaCod);
            ps.executeUpdate();
            System.out.println("Eliminado con Exito");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al Eliminar : " + e);
            return false;

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);

        }
    }

    public boolean find(int entradaCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        EntradaModelo entrada = new EntradaModelo();
        FuncionModelo funcion = new FuncionModelo();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, entradaCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                entrada.setPatente(rs.getString(2));
                entrada.setFuncion(funcion.findFuncionCod(rs.getInt(3)));
                entrada.setPrecio(rs.getFloat(4));
            }

        } catch (SQLException e) {
            System.out.println("Error al Buscar : " + e);
            return false;

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);

        }

        return true;
    }

    public boolean exist(int entradaCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, entradaCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Buscar : " + e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);

        }

        return false;
    }

}
