<%-- 
    Document   : index
    Created on : 6 nov. 2022, 09:49:02
    Author     : asulia
--%>

<%@page import="Auxiliar.Metodos"%>
<%@page import="Auxiliar.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Conexion cn = new Conexion();
            java.sql.Connection con = cn.getConnection();
            java.sql.Statement state = con.createStatement();
            String query = "select * from pais;";
            java.sql.ResultSet rs = state.executeQuery(query);

        %>
        <p>Paises</p>
        <form action="index.jsp">
            <select name="paises" onchange="this.form.submit()">
                <option value="">Seleccione un pais</option>
                <%                while (rs.next()) {
                %>

                <option value="<% out.println(rs.getString(1)); %>"><% out.println(rs.getString(2)); %></option>
                <%
                    }
                %>
                </select>
                <%
                    
                    String variable = (String) request.getParameter("paises");
                    if (variable != null) {
                        String a = variable.substring(0, 1);
                        Metodos m = new Metodos();
                        out.println(m.getSelect(Integer.valueOf(a)));
                    }

                %>
            
        </form>



    </body>
</html>
