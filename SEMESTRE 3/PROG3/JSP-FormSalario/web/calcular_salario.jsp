<%-- 
    Document   : calcular_salario
    Created on : 22 nov 2022, 16:42:23
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular Salario</title>
    </head>
    <body>
        <%
            int legajo = Integer.parseInt(request.getParameter("legajo"));
            String nombre = request.getParameter("nombre");
            int sueldo = Integer.parseInt(request.getParameter("sueldo"));
            int antig = Integer.parseInt(request.getParameter("antig"));
            int nivelEdu = Integer.parseInt(request.getParameter("nivelEdu"));
            double sueldoNuevo = 0;
            String nivelEdustr = "";

            switch (nivelEdu) {
                case 1:
                    nivelEdustr = "Secundario Incompleto";
                    sueldoNuevo = sueldo; 
                    break;
                case 2:
                    nivelEdustr = "Secundario Completo";
                    sueldoNuevo = sueldo * 1.2;
                    break;
                case 3:
                    nivelEdustr = "Terciario Completo";
                    sueldoNuevo = sueldo * 1.3;
                    break;
                case 4:
                    nivelEdustr = "Universitario Completo";
                    sueldoNuevo = sueldo * 1.4;
                    break;
            }
            double aumento = (antig*0.02);
            sueldoNuevo += sueldo * aumento;
        %>

        <br>DATOS CARGADOS: <br>
        <br>Legajo: <% out.println(legajo); %>
        <br><br>Nombre: <% out.println(nombre); %>
        <br><br>Sueldo básico: <% out.println(sueldo); %>
        <br><br>Antigüedad: <% out.println(antig); %>
        <br><br>Nivel educativo: <% out.println(nivelEdustr); %>
        <br><br>Sueldo calculado: <% out.println(sueldoNuevo);%>
    </body>
</html>
