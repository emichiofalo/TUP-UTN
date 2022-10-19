<%-- 
    Document   : tabla
    Created on : 19 oct 2022, 15:58:24
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla Números</h1>
        <table border="1" width="50%" style ="border-collapse: collapse">

            <%
                int filas = Integer.parseInt(request.getParameter("filas"));
                int col = Integer.parseInt(request.getParameter("columnas"));
                for (int i = 0; i < filas; i++) {
            %>         
            <tr>
                <%
                    for (int j = 0; j < col; j++) {
                %> 
                <td> <% out.println((i+1) + "." + (j+1));%></td>
                <%
                    }
                %>
            </tr>
            <%                
                }
            %>
        </table>
    </body>
</html>
