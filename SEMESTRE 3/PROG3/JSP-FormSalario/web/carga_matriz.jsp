<%-- 
    Document   : carga_matriz
    Created on : 22 nov 2022, 17:19:48
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga Matriz</title>
    </head>
    <body>
        <form action="" method="post">
            <p>Ingrese un número: <input type="number" name="num" id="num"></p>
            <button type="submit" name="validarbtn" id="validarbtn">GENERAR MATRIZ</button>
        </form>
        <%
        if(request.getParameter("validarbtn") != null){
            int tamMatriz = Integer.parseInt(request.getParameter("num"));
            if(tamMatriz %2 == 0){
                out.println("<br><label style='color: red'>El número debe ser impar.</label>");
            }else {
                int num = Integer.parseInt(request.getParameter("num"));
                response.sendRedirect("genera_matriz.jsp?num="+num);
            }
        }   
        %>
    </body>
</html>
