<%-- 
    Document   : genera_tabla
    Created on : 8 nov 2022, 13:27:32
    Author     : Emi Chiófalo
--%>

<%@page import="Modelo.Métodos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matriz Rombo</title>
    </head>
    <style>
        table{
            margin-left: 1%;
            margin-top: 1%;
        }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 15px;
        }
    </style>
    <body>
        <%
            int num = Integer.parseInt(request.getParameter("num"));
            Métodos m = new Métodos();
            char[][] matriz = new char[num][num];
            m.romboMatrix(matriz, 'x');
            out.println("<table>");
            for (int i = 0; i < matriz.length; i++) {
            out.println("<tr>");
                for (int j = 0; j < matriz.length; j++) {
                    out.println("<td>" + matriz[i][j] + "</td>");
                }
                out.println("</tr>");
                    }
                out.println("</table>");
            %>
    </body>
</html>
