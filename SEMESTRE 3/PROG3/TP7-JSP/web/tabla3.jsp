<%-- 
    Document   : tabla3
    Created on : 19 oct 2022, 16:51:36
    Author     : Emi Chiófalo
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registros de datos personales</h1>
        <table border="1" width="50%" style ="border-collapse: collapse">
            <tr>
                <td> <% out.println("Nº");%></td>
                <td> <% out.println("DNI");%></td>
                <td> <% out.println("NOMBRE");%></td>
                <td> <% out.println("DOMICILIO");%></td>
            </tr>
            <% 
                String JDBC_DRIVER = "com.mysql.jdbc.Driver";
                Class.forName(JDBC_DRIVER);
                java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/persona-tpjsp?serverTimezone=UTC","root","mysql");
                java.sql.Statement st = con.createStatement();
                String query = "SELECT * FROM persona;";
                java.sql.ResultSet rs = st.executeQuery(query);

                while (rs.next()){    
            %>         
            <tr>
                <td> <% out.println(rs.getLong(1));%></td>
                <td> <% out.println(rs.getString(2));%></td>
                <td> <% out.println(rs.getString(3));%></td>
                <td> <% out.println(rs.getString(4));%></td>
            </tr>
            <%                
                }
            %>
        </table>
    </body>
</html>
