<%-- 
    Document   : genera_matriz
    Created on : 22 nov 2022, 17:33:27
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Genera Matriz</title>
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
        int[][] matriz = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        
        out.println("<table>");
            for (int i = 0; i < matriz.length; i++) {
                out.println("<tr>");
                for (int j = 0; j < matriz.length; j++) {
                    out.println("<td>"+matriz[i][j]+"</td>");
                }
                out.println("</tr>");
            }
        out.println("</table>");
        
        int fila = 0; 
        int columna = 0; 
        int[][] matriz2 = new int[2][num]; 
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                columna += matriz[j][i];
                fila += matriz[i][j];
            }
            matriz2[0][i] = columna; 
            matriz2[1][i] = fila; 
            columna = 0; 
            fila = 0; 
        }
        
        out.println("<table>");
            for (int i = 0; i < matriz2.length; i++) {
                out.println("<tr>");
                for (int j = 0; j < num; j++) {
                    out.println("<td>"+matriz2[i][j]+"</td>");
                }
                out.println("</tr>");
            }
        out.println("</table>");
        
        for (int i = 0; i < num; i++) {
            columna += matriz2[0][i];
            fila += matriz2[1][i];
        }
        out.println("<br>La suma de las columnas es "+ columna + ", la suma de las filas es "+ fila);
        
        %>
    </body>
</html>
