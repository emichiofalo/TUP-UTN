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
import Modelo .*;

/**
 *
 * @author Emi Chiófalo
 */
public class ParkingDAO extends Conexion {

    private final String SQL_INSERT = "INSERT INTO Parking (parking_capacidad) VALUES (?)";
    private final String SQL_SELECT = "SELECT * FROM Parking";
    private final String SQL_DELETE = "DELETE FROM Parking WHERE parking_id=?";
    private final String SQL_UPDATE = "UPDATE Parking SET parking_capacidad=? WHERE parking_id=?";
    private final String SQL_FIND = "SELECT * FROM Parking WHERE parking_id=?";
    private final String SQL_FINDCAPACIDAD = "SELECT parking_capacidad FROM Parking WHERE parking_id=?";

    public boolean create(ParkingModelo parking) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setInt(1, parking.getCapacidadAutos());

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

    public List<ParkingModelo> read() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ParkingModelo parking;
        List<ParkingModelo> listaParkings = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                parking = new ParkingModelo();
                
                parking.setNumero(rs.getInt(1));
                parking.setCapacidadAutos(rs.getInt(2));                

                listaParkings.add(parking);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return listaParkings;
    }
    
    public int readCapacidad(int parkingCod) {
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        ArrayList<Integer> capacidad = new ArrayList();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FINDCAPACIDAD);
            ps.setInt(1, parkingCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                capacidad.add(rs.getInt(1));
            }

        } catch (SQLException e) {
            System.out.println("Error al Buscar : " + e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);

        }

        return capacidad.get(0);
    }

    public boolean update(ParkingModelo parking) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            
            ps.setInt(1, parking.getCapacidadAutos());
            
            ps.setInt(2, parking.getNumero());

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

    public boolean delete(int parkingCod) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, parkingCod);
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

    public boolean find(int parkingCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        ParkingModelo parking = new ParkingModelo();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, parkingCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                parking.setNumero(rs.getInt(1));
                parking.setCapacidadAutos(rs.getInt(2));
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
    
    public ParkingModelo findParking(int parkingCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        ParkingModelo parking = new ParkingModelo();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, parkingCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                parking.setNumero(rs.getInt(1));
                parking.setCapacidadAutos(rs.getInt(2));
            }

        } catch (SQLException e) {
            System.out.println("Error al Buscar : " + e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);

        }

        return parking;
    }

    public boolean exist(int parkingCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, parkingCod);
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
