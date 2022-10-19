<%-- 
    Document   : tabla2
    Created on : 19 oct 2022, 16:16:30
    Author     : Emi Chiófalo
--%>

<%@ page import = "java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos personales cargados</h1>
        <table border="1" width="50%" style ="border-collapse: collapse">
            <tr>
                <td> <% out.println("DNI");%></td>
                <td> <% out.println("NOMBRE");%></td>
                <td> <% out.println("DOMICILIO");%></td>
            </tr>
            <%
                String dni = request.getParameter("dni");
                String nombre = request.getParameter("nombre");
                String domicilio = request.getParameter("domicilio");
            %>         
            <tr>
                <td> <% out.println(dni);%></td>
                <td> <% out.println(nombre);%></td>
                <td> <% out.println(domicilio);%></td>
            </tr>
        </table>
        <% 
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            Class.forName(JDBC_DRIVER);
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/persona-tpjsp?serverTimezone=UTC","root","mysql");
            java.sql.Statement st = con.createStatement();
            String query = "INSERT INTO persona (dni,nombre,domicilio) VALUES ('"+dni+"','"+nombre+"','"+domicilio+"')";
            st.executeUpdate(query);
        %>
        <br>
        <button onclick="window.location='tabla3.jsp'" style="font-family: verdana; font-size: 14px; color: #150567; border-color: #92c7c7; background-color: #92c7c7" border="0">Mostrar registros</button>
    </body>
</html>
