<%-- 
    Document   : abmusuario
    Created on : 9 nov 2022, 11:22:01
    Author     : Emi Chiófalo
--%>

<%@page import="Modelo.Connection2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>

        <input type="text" id="user" />
        <input type="button" value="Buscar" onclick="reload()"/>
        <%
            if (request.getParameter("bus") != null && request.getParameter("bus") != "") {
                String usuario = (String) request.getParameter("bus");
                Connection2 cn = new Connection2();
                java.sql.Connection con = cn.getConnection();
                java.sql.Statement state = con.createStatement();
                String query = "SELECT * FROM usuario where usuario = '" + usuario + "';";
                java.sql.ResultSet rs = state.executeQuery(query);

                String user;

                while (rs.next()) {
                    user = rs.getString(2);
                    out.println("<table><tr><td>" + user + "</td></tr></table>");
                }
            } else {
                String usuario = (String) request.getParameter("bus");
                Connection2 cn = new Connection2();
                java.sql.Connection con = cn.getConnection();
                java.sql.Statement state = con.createStatement();
                String query = "SELECT * FROM usuario;";
                java.sql.ResultSet rs = state.executeQuery(query);

                String user;

                while (rs.next()) {
                    user = rs.getString(2);
                    out.println("<table><tr><td>" + user + "</td></tr></table>");
                }
            }

        %>
    </body>
</html>
<script>
    function reload() {
        var bus = document.getElementById('user').value;
        self.location = 'abmusuario.jsp?bus=' + bus;
    }
</script>