/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.managers;

import static com.utn.managers.Conexion.getConnection;
import com.utn.modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class FacturaManager {
    
    public List<Factura> getAll() {
        String query = "SELECT fechaComprobante, puntoVenta, nroComprobante, periodo, letraComprobante, montoTotal, id FROM factura;";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Factura> facturas = new ArrayList();
        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Factura f = new Factura();
                f.setFechaComprobante(rs.getString(1));
                f.setPuntoVenta(rs.getInt(2));
                f.setNroComprobante(rs.getLong(3));
                f.setPeriodo(rs.getInt(4));
                f.setLetra(rs.getString(5));
                f.setMontoTotal(rs.getDouble(6));
                f.setId(rs.getLong(7));
                facturas.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return facturas;
    }
    
    public List<Factura> getFiltered(int ptoVenta, long nroComprobante) {
        String query = "SELECT fechaComprobante, puntoVenta, nroComprobante, periodo, letraComprobante, montoTotal, id FROM factura WHERE puntoVenta="+ ptoVenta +" || nroComprobante="+ nroComprobante +";";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Factura> facturas = new ArrayList();
        try {
            conn = Conexion.getConnection();
            ps = getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Factura f = new Factura();
                f.setFechaComprobante(rs.getString(1));
                f.setPuntoVenta(rs.getInt(2));
                f.setNroComprobante(rs.getLong(3));
                f.setPeriodo(rs.getInt(4));
                f.setLetra(rs.getString(5));
                f.setMontoTotal(rs.getDouble(6));
                f.setId(rs.getLong(7));
                facturas.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return facturas;
    }
    
}
