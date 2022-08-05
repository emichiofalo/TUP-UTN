/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

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
public class PeliculaDAO extends Conexion{
    
    private final String SQL_INSERT = "INSERT INTO Pelicula (peli_titulo, peli_anio, peli_director, peli_genero) VALUES (?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM Pelicula";
    private final String SQL_DELETE = "DELETE FROM Pelicula WHERE peli_id=?";
    private final String SQL_UPDATE = "UPDATE Pelicula SET peli_titulo=?,peli_anio=?, peli_director=?,peli_genero=? WHERE peli_id=?";
    private final String SQL_FIND = "SELECT * FROM Pelicula WHERE peli_id=?";
    private final String SQL_FINDPELI = "SELECT * FROM Pelicula WHERE peli_titulo = ?";
    
    public boolean create(PeliculaModelo pelicula) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, pelicula.getTitulo());
            ps.setInt(2, pelicula.getAnio());
            ps.setString(3, pelicula.getDirector());
            ps.setString(4, pelicula.getGenero());

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

    public List<PeliculaModelo> read() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PeliculaModelo pelicula;
        List<PeliculaModelo> listaPeliculas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                pelicula = new PeliculaModelo();
                
                pelicula.setCodigo(rs.getInt(1));
                pelicula.setTitulo(rs.getString(2));
                pelicula.setAnio(rs.getInt(3));
                pelicula.setDirector(rs.getString(4));
                pelicula.setGenero(rs.getString(5));
                

                listaPeliculas.add(pelicula);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return listaPeliculas;
    }

    public boolean update(PeliculaModelo pelicula) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            
            ps.setString(1, pelicula.getTitulo());
            ps.setInt(2, pelicula.getAnio());
            ps.setString(3, pelicula.getDirector());
            ps.setString(4, pelicula.getGenero());
            
            ps.setInt(5, pelicula.getCodigo());

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

    public boolean delete(int peliculaCod) {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, peliculaCod);
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

    public boolean find(int peliculaCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        PeliculaModelo pelicula = new PeliculaModelo();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, peliculaCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                pelicula.setCodigo(rs.getInt(1));
                pelicula.setTitulo(rs.getString(2));
                pelicula.setAnio(rs.getInt(3));
                pelicula.setDirector(rs.getString(4));
                pelicula.setGenero(rs.getString(5));
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
    
    public PeliculaModelo findPelicula(int peliculaCod) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PeliculaModelo pelicula;
        List<PeliculaModelo> listaPeliculas = new ArrayList();

        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_FIND);
            ps.setInt(1, peliculaCod);
            rs = ps.executeQuery();

            while (rs.next()) {
                pelicula = new PeliculaModelo();
                
                pelicula.setCodigo(rs.getInt(1));
                pelicula.setTitulo(rs.getString(2));
                pelicula.setAnio(rs.getInt(3));
                pelicula.setDirector(rs.getString(4));
                pelicula.setGenero(rs.getString(5));
                

                listaPeliculas.add(pelicula);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return listaPeliculas.get(0);
    }
    
    public PeliculaModelo findPeliculaporNombre(String nombre) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PeliculaModelo pelicula;
        List<PeliculaModelo> listaPeliculas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(SQL_FINDPELI);
            ps.setString(1, nombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                pelicula = new PeliculaModelo();
                
                pelicula.setCodigo(rs.getInt(1));
                pelicula.setTitulo(rs.getString(2));
                pelicula.setAnio(rs.getInt(3));
                pelicula.setDirector(rs.getString(4));
                pelicula.setGenero(rs.getString(5));

                listaPeliculas.add(pelicula);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return listaPeliculas.get(0);
    }

    public boolean exist(int peliculaCod) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, peliculaCod);
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
