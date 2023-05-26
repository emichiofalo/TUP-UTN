/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.entities.Ingrediente;
import com.example.demo.entities.IngredienteCantidad;
import com.example.demo.entities.Plato;
import com.example.demo.entities.PlatoIngrediente;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gerardo
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PlatoController {
    
    @RequestMapping(value = "prueba")
    public String prueba(){
        return "PRUEBA SPRING BOOT";
    } 
    
    @GetMapping("prueba2")
    public String prueba2(){
        return "PRUEBA 2 SPRING BOOT";
    } 
    
    String urlConexion = "jdbc:mysql://localhost:3306/react";
    String usuario = "root";
    String clave = "123456";
    
    @GetMapping("api/platos")
    public List<Plato> getPlatosDataBaseJSON() throws SQLException{
        System.out.println("getPlatosDataBaseJSON");
        return getPlatosDataBase();
    }
    
    @RequestMapping(value = "api/getPlatosDataBase")
    public List<Plato> getPlatosDataBase() throws SQLException{
    
        ResultSet rs = null;
        List<Plato> platos = new ArrayList<Plato>();
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);

            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from plato");
            while (rs.next()) {
                Plato plato = new Plato();
                plato.setId(Long.parseLong(rs.getString("id")));
                plato.setNombre(rs.getString("nombre"));
                plato.setImagenPath(rs.getString("imagenPath"));
                plato.setPrecio(rs.getDouble("precio"));
                plato.setStrPrecio(String.valueOf(rs.getDouble("precio")));
                plato.setRubro(rs.getString("rubro"));
                platos.add(plato);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
        return platos;

    
    } 
    
    @GetMapping("api/platoxid/{id}")
    public Plato getPlatoDataBaseXIdJSON(@PathVariable String id){
        try{
            Plato plato = getPlatoDataBaseXId(Long.parseLong(id));
            Gson gsonBuilder = new GsonBuilder().create();
            String platosJson = gsonBuilder.toJson(plato);
            String respuestaServer = platosJson;
            System.out.println(respuestaServer);
        return plato;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    private Plato getPlatoDataBaseXId(long idPlato) throws SQLException{
    
        ResultSet rs = null;
        Plato plato = new Plato();
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);

            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("SELECT * from plato WHERE id = " + idPlato);
            while (rs.next()) {
                plato.setId(Long.parseLong(rs.getString("id")));
                plato.setNombre(rs.getString("nombre"));
                plato.setImagenPath(rs.getString("imagenPath"));
                plato.setPrecio(rs.getDouble("precio"));
                plato.setStrPrecio(String.valueOf(rs.getDouble("precio")));
                plato.setRubro(rs.getString("rubro"));
            }
            
            rs = s.executeQuery("SELECT * FROM plato_ingrediente AS pin INNER JOIN ingrediente i ON pin.idingrediente = i.id " +
                                "WHERE pin.idplato = " + idPlato);
            while (rs.next()) {
                PlatoIngrediente platoIngrediente = new PlatoIngrediente();
                platoIngrediente.setIdplatoingrediente(Long.parseLong(rs.getString("idplatoingrediente")));
                platoIngrediente.setCantidad(rs.getDouble("cantidad"));
                platoIngrediente.setIngrediente(this.getIngredienteXId(Long.parseLong(rs.getString("idingrediente"))));
                plato.addIngredientePlato(platoIngrediente);
                
                IngredienteCantidad ingCant = new IngredienteCantidad();
                ingCant.setIdIngrediente(Long.parseLong(rs.getString("idingrediente")));
                ingCant.setCantidad(rs.getDouble("cantidad"));
                ingCant.setNombre(rs.getString("nombre"));
                ingCant.setUnidadMedida(rs.getString("unidadMedida"));
                plato.addIngrediente(ingCant);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
        return plato;
    }
    
    @GetMapping("api/buscar/{termino}")
    public List<Plato> getPlatoDataBaseXTermino(@PathVariable String termino) throws SQLException{
    
        ResultSet rs = null;
        List<Plato> platos = new ArrayList<Plato>();
        Connection conexion = null;    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);

            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("SELECT * from plato WHERE nombre LIKE '%" + termino + "%'");
            while (rs.next()) {
                Plato plato = new Plato();
                plato.setId(Long.parseLong(rs.getString("id")));
                plato.setNombre(rs.getString("nombre"));
                plato.setImagenPath(rs.getString("imagenPath"));
                plato.setPrecio(rs.getDouble("precio"));
                plato.setStrPrecio(String.valueOf(rs.getDouble("precio")));
                plato.setRubro(rs.getString("rubro"));
                platos.add(plato);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
        return platos;
    }
    
    @PostMapping("api/insert")
    public Plato insertarPlato(@RequestBody Plato plato) throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);
            conexion.setAutoCommit(false);
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO plato(nombre, imagenPath, precio, rubro) VALUES (?, ?, ?, ?)");

            // Se establecen los parámetros y se ejecuta la sentencia.
            ps.setString(1, plato.getNombre());
            ps.setString(2, plato.getImagenPath());
            ps.setDouble(3, plato.getPrecio());
            ps.setString(4, plato.getRubro());
            
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0) {
                    throw new SQLException("No se pudo guardar");
            }
            
            //recupero el ultimo id
            ResultSet generatedKeys = ps.getGeneratedKeys();
            long idGenerado = 0;
            if (generatedKeys.next()) {
                idGenerado = generatedKeys.getLong(1);
            }
            
            for(PlatoIngrediente platoIng : plato.getIngredientesPlato()){
                ps = conexion.prepareStatement("INSERT INTO plato_ingrediente(idplato, idingrediente, cantidad) VALUES (?, ?, ?)");
                ps.setLong(1, idGenerado);
                ps.setLong(2, platoIng.getIngrediente().getId());
                ps.setDouble(3, platoIng.getCantidad());
               
                ps.executeUpdate();
            }
            
             conexion.commit();
             
            return this.getPlatoDataBaseXId(idGenerado);
        } catch (ClassNotFoundException | SQLException ex) {
            if(null != conexion)
                conexion.rollback();
            return null;
        }finally{
            if(null != conexion)
                conexion.close();
        }
        

    }

    @PutMapping("api/update")
    public Plato actualizarPlato(@RequestBody Plato plato) throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);
            conexion.setAutoCommit(false);
            //busco los ingredientes que tiene el plato
            List<PlatoIngrediente> ingredientesPlato = getPlatoIngredientesXIdPlato(plato.getId());
            
            List<Long> idsDelete = new ArrayList<Long>();
            //comparo lo que tenia antes contra lo que tiene ahora
            for(PlatoIngrediente ingAntes : ingredientesPlato){
                boolean eliminar = true;
                for(PlatoIngrediente ingAhora : plato.getIngredientesPlato()){
                    if(ingAhora.getIdplatoingrediente() == 0){
                        eliminar = false;
                        break;
                    }
                    if(ingAhora.getIdplatoingrediente() == ingAntes.getIdplatoingrediente()){
                        eliminar = false;
                        break;
                    }
                }
                if(eliminar){
                    idsDelete.add(ingAntes.getIdplatoingrediente());
                }
            }
            
            for(Long idDelete : idsDelete){
                Statement st = conexion.createStatement();
                st.executeUpdate("DELETE FROM plato_ingrediente WHERE idplatoingrediente = " + idDelete);
            }
            
            for(PlatoIngrediente platoIng : plato.getIngredientesPlato()){
                if(platoIng.getIdplatoingrediente() > 0){
                    continue;
                }
                PreparedStatement ps = conexion.prepareStatement("INSERT INTO plato_ingrediente(idplato, idingrediente, cantidad) VALUES (?, ?, ?)");
                ps.setLong(1, plato.getId());
                ps.setLong(2, platoIng.getIngrediente().getId());
                ps.setDouble(3, platoIng.getCantidad());
               
                ps.executeUpdate();
            }
            
            PreparedStatement ps = conexion.prepareStatement("UPDATE plato SET nombre = ?, imagenPath = ?, precio = ?, rubro = ? WHERE id = ?");
            ps.setString(1, plato.getNombre());
            ps.setString(2, plato.getImagenPath());
            ps.setDouble(3, plato.getPrecio());
            ps.setString(4, plato.getRubro());
            ps.setLong(5, plato.getId());
            ps.executeUpdate();
            
            conexion.commit();
                    
            return this.getPlatoDataBaseXId(plato.getId());

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
    }
    
    public List<PlatoIngrediente> getPlatoIngredientesXIdPlato(Long idPlato) throws SQLException{
        ResultSet rs = null;
        List<PlatoIngrediente> platoIngredientes = new ArrayList<PlatoIngrediente>();
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);

            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from plato_ingrediente where idplato = " + idPlato );
            while (rs.next()) {
                PlatoIngrediente ing = new PlatoIngrediente();
                ing.setIdplatoingrediente(rs.getLong("idplatoingrediente"));
                ing.setCantidad(rs.getDouble("cantidad"));
                ing.setIngrediente(getIngredienteXId(rs.getLong("idingrediente")));
                ing.setPlato(getPlatoDataBaseXId(rs.getLong("idplato")));
                platoIngredientes.add(ing);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
        return platoIngredientes;

    
    } 
     
    @DeleteMapping("api/delete/{id}")
    public void deletePlato(@PathVariable String idPlato) throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);
            
            conexion.setAutoCommit(false);
            
            Statement st = conexion.createStatement();
            st.executeUpdate("DELETE FROM plato_ingrediente WHERE idplato = " + idPlato);
            
            st = conexion.createStatement();
          
            String sql = "DELETE FROM plato WHERE id = " + idPlato;
            int delete = st.executeUpdate(sql);

            if (delete == 1) {
                System.out.println("plato Borrado");
            } else {
                System.out.println("plato no Borrado");
            }
            
            conexion.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(conexion != null)
                conexion.close();
        }
    }

    @GetMapping("api/eliminar/{id}")
    public String eliminarPlato(@PathVariable String id) throws SQLException{
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);
            
            conexion.setAutoCommit(false);
            
            Statement st = conexion.createStatement();
            st.executeUpdate("DELETE FROM plato_ingrediente WHERE idplato = " + id);
            
            st = conexion.createStatement();
            String sql = "DELETE FROM plato WHERE id = " + id;
            int delete = st.executeUpdate(sql);

            conexion.commit();
            
            if (delete != 0) {
                System.out.println("plato Borrado");
                return "OK";
            } else {
                System.out.println("plato no Borrado");
                return "Error";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
    }
    
    @GetMapping("api/ingredientes")
    public List<Ingrediente> getIngredientesDataBaseJSON() throws SQLException{
        System.out.println("getIngredientesDataBaseJSON");
        ResultSet rs = null;
        List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);

            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select * from ingrediente");
            while (rs.next()) {
                Ingrediente ing = new Ingrediente();
                ing.setId(Long.parseLong(rs.getString("id")));
                ing.setNombre(rs.getString("nombre"));
                ing.setUnidadMedida(rs.getString("unidadMedida"));
                ing.setStrNombreUnidadMedida(ing.getNombre() + " (" + ing.getUnidadMedida() + ")");
                ingredientes.add(ing);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
        return ingredientes;

    
    } 
    
    @GetMapping("api/ingredientexid/{id}")
    public Ingrediente getIngredienteXId(@PathVariable String id) throws SQLException{
        return getIngredienteXId(Long.parseLong(id));
    }
    
    private Ingrediente getIngredienteXId(long idIngrediente) throws SQLException{
        System.out.println("getIngredienteXId");
        ResultSet rs = null;
        Ingrediente ingrediente = new Ingrediente();
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(urlConexion, usuario, clave);

            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("SELECT * from ingrediente WHERE id = " + idIngrediente);
            while (rs.next()) {
                ingrediente.setId(Long.parseLong(rs.getString("id")));
                ingrediente.setNombre(rs.getString("nombre"));
                ingrediente.setUnidadMedida(rs.getString("unidadMedida"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            if(conexion != null)
                conexion.close();
        }
        return ingrediente;
    }
    
    
    @GetMapping("/error")
    public String getMensaje() {
        return "";
    }
    
}
