/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Emi Chiófalo
 */
public class PaisManager {
    
    public Boolean insert(Pais pais){
        PreparedStatement ps = null; 
        Connection conn = null; 
        String query = "INSERT INTO pais (codigoPais, nombrePais, capitalPais, region, poblacion, latitud, longitud) VALUES (?,?,?,?,?,?,?)";
        try{
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setInt(1, Integer.parseInt(pais.getNumericCode()));
            ps.setString(2, pais.getName());
            ps.setString(3, pais.getCapital());
            ps.setString(4, pais.getRegion());
            ps.setLong(5, pais.getPopulation());
            ps.setDouble(6, pais.getLatlng().get(0));
            ps.setDouble(7, pais.getLatlng().get(1));
            ps.executeUpdate();
            
            System.out.println("Pais insertado con éxito.");
            
            return true; 
        }catch (SQLException e){
            return false;
 
        }finally{
            Conexion.close(conn);
            Conexion.close(ps);
        }
    }
    
    public Boolean update(Pais pais){
        PreparedStatement ps = null; 
        Connection conn = null;
        String query = "UPDATE pais SET nombrePais = ?, capitalPais = ?, region = ?, poblacion = ?, latitud = ?, longitud = ? WHERE codigoPais = ?";
        try{
            conn = Conexion.getConnection(); 
            ps = conn.prepareStatement(query);
           
            ps.setString(1, pais.getName());
            ps.setString(2, pais.getCapital());
            ps.setString(3, pais.getRegion());
            ps.setLong(4, pais.getPopulation());
            ps.setDouble(5, pais.getLatlng().get(0));
            ps.setDouble(6, pais.getLatlng().get(1));
            ps.setInt(7, Integer.parseInt(pais.getNumericCode()));
            ps.executeUpdate();
            
            System.out.println("Pais actualizado con éxito.");
            
            return true; 
            
        }catch(SQLException e){
            return false; 
        }finally{
            Conexion.close(conn);
            Conexion.close(ps);
        }
    }
    
    public Boolean exists(long numericCode){
        String query = "SELECT * FROM pais where codigoPais = " + numericCode + ";";
        Connection conn = null; 
        PreparedStatement ps = null; 
        ResultSet rs = null; 
        try{
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(query); 
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            System.out.println(e);
        }finally{
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);
        }
        return false;
    }
    
}
