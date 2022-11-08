<%-- 
    Document   : factura_detalle
    Created on : 6 nov 2022, 18:24:08
    Author     : Emi Chiófalo
--%>

<%@page import="Modelo.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura Detalle</title>
    </head>
    
        <h3>Factura detalle:</h3>
        <%
            String id = (String) request.getParameter("id");
            Connection cn = new Connection();
            java.sql.Connection con = cn.getConnection();
            java.sql.Statement state = con.createStatement();
            String query = "SELECT fecha, numero, proveedor, domicilio_proveedor FROM factura WHERE id=" + id + ";";
            java.sql.ResultSet rs = state.executeQuery(query);
            
            while (rs.next()){
        %>
        
        <p><b>Número: </b><% out.println(rs.getInt(2)); %></p>
        <p><b>Fecha: </b><% out.println(rs.getString(1)); %></p>
        <p><b>Proveedor: </b><% out.println(rs.getString(3)); %></p>
        <p><b>Domicilio proveedor: </b><% out.println(rs.getString(4)); %></p>
        
        <%
            }
            state = con.createStatement();
            query = "SELECT denomicacion_art, precio, cantidad, subtotal FROM detalle_factura WHERE id_factura=" + id + ";";
            rs = state.executeQuery(query);
            
        %>
        
        <table border="1" width="70%" style="border-collapse: collapse">
            <tr>
                <th>Artículo Denominación</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Subtotal</th>
            </tr>
            <tr>
                
            </tr>
        
        
        <%
            double total = 0;
            while(rs.next()){
        %>
            <tr>
                <td> <% out.println(rs.getString(1)); %> </td>
                <td> <% out.println(rs.getDouble(2)); %> </td>
                <td> <% out.println(rs.getInt(3)); %> </td>
                <td> <% out.println(rs.getDouble(4)); %> </td>
                <% total += rs.getDouble(4); %>
            </tr>
        <%
            }
        %>
        </table>
        <%
            out.println("<p style='text-align: right; margin-right: 30%'><b>Total:" + total + "</b></p>");
        %>
</html>
