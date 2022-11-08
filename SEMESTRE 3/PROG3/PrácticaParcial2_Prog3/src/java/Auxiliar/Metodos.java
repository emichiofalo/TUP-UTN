/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auxiliar;

/**
 *
 * @author asulia
 */
public class Metodos {

    public String getSelect(int idPais) {
        java.sql.ResultSet rs = null;
        String html = "";
        try {
            Conexion cn = new Conexion();
            java.sql.Connection con = cn.getConnection();
            java.sql.Statement state = con.createStatement();
            String query = "select * from provincia where idPais = " + idPais + ";";
            rs = state.executeQuery(query);

             html += " <p>Provincias</p>\n" +
"                           <select>";
            while (rs.next()) {
                
                html +=" <option value=\"" + rs.getString(2) + 
                        "\">" + rs.getString(2) +"</option>";
                
            }
            
            html += "</select> <br>";

        } catch (Exception e) {
        }
        return html;
    }

}
