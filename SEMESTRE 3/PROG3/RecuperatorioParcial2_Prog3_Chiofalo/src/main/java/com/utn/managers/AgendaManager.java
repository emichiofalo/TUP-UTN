/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.managers;

import static com.utn.managers.Conexion.getConnection;
import com.utn.modelo.Agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author asulia
 */
public class AgendaManager {

    public List<Agenda> getAll() {
        String query = "SELECT * FROM agenda;";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Agenda> ag = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Agenda a = new Agenda();
                a.setId(rs.getLong(1));
                a.setNombre(rs.getString(2));
                a.setApellido(rs.getString(3));
                a.setTelefono(rs.getLong(4));
                a.setEmail(rs.getString(5));
                a.setDomicilio(rs.getString(6));
                ag.add(a);
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return ag;
    }

    public Agenda getById(long id) {
        String query = "SELECT * FROM agenda where id = " + id + ";";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Agenda a = new Agenda();
        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                a.setId(rs.getLong(1));
                a.setNombre(rs.getString(2));
                a.setApellido(rs.getString(3));
                a.setTelefono(rs.getLong(4));
                a.setEmail(rs.getString(5));
                a.setDomicilio(rs.getString(6));
            }

        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return a;
    }

    public Boolean update(Agenda agenda) {
        PreparedStatement ps = null;
        Connection conn = null;
        String query = "UPDATE agenda SET nombre = ?, apellido = ?, telefono = ?, email = ?, domicilio = ? WHERE id = ?";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, agenda.getNombre());
            ps.setString(2, agenda.getApellido());
            ps.setLong(3, agenda.getTelefono());
            ps.setString(4, agenda.getEmail());
            ps.setString(5, agenda.getDomicilio());
            ps.setLong(6, agenda.getId());
            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;

        } finally {

            Conexion.close(conn);
            Conexion.close(ps);

        }
    }

    public Boolean insert(Agenda agenda) {
        PreparedStatement ps = null;
        Connection conn = null;
        String query = "INSERT INTO agenda (nombre, apellido, telefono, email, domicilio) VALUES (?,?,?,?,?)";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, agenda.getNombre());
            ps.setString(2, agenda.getApellido());
            ps.setLong(3, agenda.getTelefono());
            ps.setString(4, agenda.getEmail());
            ps.setString(5, agenda.getDomicilio());
            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;

        } finally {

            Conexion.close(conn);
            Conexion.close(ps);

        }
    }

    public void delete(long id) {
        String query = "DELETE FROM agenda WHERE id = " + id + ";";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {

            System.out.println(e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
        }
    }
}
