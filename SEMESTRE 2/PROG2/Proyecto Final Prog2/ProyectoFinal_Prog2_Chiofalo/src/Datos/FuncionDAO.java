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
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
/**
 *
 * @author Emi Chiófalo
 */
public class FuncionDAO extends Conexion {

    private final String SQL_INSERT = "INSERT INTO Funcion (funcion_fecha, funcion_horario, funcion_parking, funcion_pelicula) VALUES (?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM Funcion";
    private final String SQL_DELETE = "DELETE FROM Funcion WHERE funcion_id=?";
    private final String SQL_UPDATE = "UPDATE Funcion SET funcion_fecha=?,funcion_horario=?,funcion_parking=?, funcion_pelicula=? WHERE funcion_id=?";
    private final String SQL_FIND = "SELECT * FROM Funcion WHERE funcion_id=?";

    public boolean create(FuncionModelo funcion) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, funcion.getFecha().toString());
            ps.setString(2, funcion.getHorario().toString());
            ps.setInt(3, funcion.getParking().getNumero());
            ps.setInt(4, funcion.getPelicula().getCodigo());

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

    public List<FuncionModelo> read() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        FuncionModelo funcion;
        ParkingModelo parking;
        PeliculaModelo pelicula;
        List<FuncionModelo> listafunciones = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                funcion = new FuncionModelo();
                
                funcion.setNroFuncion(rs.getInt(1));
                funcion.setFecha(rs.getDate(2).toLocalDate());
                funcion.setHorario(rs.getTime(3).toLocalTime());
                parking = new ParkingModelo();
                funcion.setParking(parking.findParkingCod(rs.getInt(4)));
                pelicula = new PeliculaModelo();
                pelicula = pelicula.findPeliculaCod(rs.getInt(5));
                funcion.setPelicula(pelicula.findPeliculaCod(rs.getInt(5)));             

                listafunciones.add(funcion);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return listafunciones;
    }

    public boolean update(FuncionModelo funcion) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, funcion.getFecha().toString());
            ps.setString(2, funcion.getHorario().toString());
            ps.setInt(3, funcion.getParking().getNumero());
            ps.setInt(4, funcion.getPelicula().getCodigo());
            
            ps.setInt(5, funcion.getNroFuncion());

            ps.executeUpdate();
            System.out.println("Actualizado Con Exito");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al Actualizar : " + e);
            return false;

        } finally {

            Conexion.close(conn);
            Conexion.close(ps);

        }
    }

    public boolean delete(int funcionCod) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, funcionCod);
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

    public boolean find(int funcionCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        FuncionModelo funcion = new FuncionModelo();
        ParkingModelo parking = new ParkingModelo();
        PeliculaModelo pelicula = new PeliculaModelo();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, funcionCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                funcion.setFecha(rs.getDate(2).toLocalDate());
                funcion.setHorario(rs.getTime(3).toLocalTime());
                funcion.setParking(parking.findParkingCod(rs.getInt(4)));
                funcion.setPelicula(pelicula.findPeliculaCod(rs.getInt(5)));
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
    
    public FuncionModelo findFuncion(int funcionCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        FuncionModelo funcion;
        ParkingModelo parking = new ParkingModelo();
        PeliculaModelo pelicula = new PeliculaModelo();
        List<FuncionModelo> listaFunciones = new ArrayList();
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, funcionCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                funcion = new FuncionModelo();
                
                funcion.setNroFuncion(rs.getInt(1));
                funcion.setFecha(rs.getDate(2).toLocalDate());
                funcion.setHorario(rs.getTime(3).toLocalTime());
                funcion.setParking(parking.findParkingCod(rs.getInt(4)));
                funcion.setPelicula(pelicula.findPeliculaCod(rs.getInt(5)));
                
                listaFunciones.add(funcion);
            }

        } catch (SQLException e) {
            System.out.println("Error al Buscar : " + e);
            
        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);

        }

        return listaFunciones.get(0);
    }
    
    public boolean exist(int funcionCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, funcionCod);
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
