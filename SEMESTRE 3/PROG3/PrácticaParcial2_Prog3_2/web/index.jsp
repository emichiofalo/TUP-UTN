<%-- 
    Document   : index
    Created on : 6 nov 2022, 17:50:31
    Author     : Emi Chiófalo
--%>

<%@page import="Modelo.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Facturas</title>
    </head>
    <body>
        <h3>Facturas cargadas:</h3>
        <%
            Connection cn = new Connection();
            java.sql.Connection con = cn.getConnection();
            java.sql.Statement state = con.createStatement();
            String query = "SELECT id, fecha, numero, total, proveedor, cuit_proveedor FROM factura;";
            java.sql.ResultSet rs = state.executeQuery(query);

        %>
        <table border="1" width="70%" style ="border-collapse: collapse">
            <tr>
                <th>Fecha</th>
                <th>Número</th>
                <th>Total</th>
                <th>Proveedor</th>
                <th>CUIT Proveedor</th>
                <th></th>
            </tr>
            <%
                while(rs.next()){
                    long id = rs.getLong(1);
                    String href = "<a href='factura_detalle.jsp?id="+id+"'>Ver Detalle</a>";
            %>
            <tr>
                <td><% out.println(rs.getString(2)); %></td>
                <td><% out.println(rs.getInt(3)); %></td>
                <td><% out.println(rs.getDouble(4)); %></td>
                <td><% out.println(rs.getString(5)); %></td>
                <td><% out.println(rs.getInt(6)); %></td>
                <td><% out.println(href); %></td>
            </tr>
            <%
                }  
            %>
            <script>
            </script>
        </table>
    </body>
</html>
