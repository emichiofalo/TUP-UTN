<%-- 
    Document   : carga_tabla
    Created on : 8 nov 2022, 13:27:18
    Author     : Emi Chiófalo
--%>

<%@page import="java.sql.Array"%>
<%@page import="Modelo.Métodos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matriz rombo</title>
    </head>
    <body>
        <form action="carga_tabla.jsp" method="post">
            <p>Tamaño de la matriz: <input type="number" name="num" id="num"></p>
            <button type="submit">GENERAR MATRIZ</button>
        </form>
        <%
            if (request.getParameter("num") != null) {
                int num = Integer.parseInt(request.getParameter("num"));
                if (num % 2 == 0 || num < 6) {
                    %><br><label style='color: red'>Ingresar un número impar mayor a 5.</label> <%
                } else {
                    response.sendRedirect("http://localhost:8080/Pr_cticaParcial2_Prog3_2/genera_tabla.jsp?num="+num);
                }
            }
        %>
</body>
</html>