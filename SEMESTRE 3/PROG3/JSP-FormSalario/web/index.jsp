<%-- 
    Document   : index
    Created on : 22 nov 2022, 16:25:05
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos empleado</title>
    </head>
    <body>
        <p>DATOS DEL EMPLEADO:</p>
        <form action="calcular_salario.jsp" method="post">
            Legajo: <input type="number" name="legajo" id="legajo"><br><br>
            Nombre del empleado: <input type="text" name="nombre" id="nombre"><br><br>
            Sueldo básico: <input type="number" name="sueldo" id="sueldo"><br><br>
            Antigüedad: <input type="number" name="antig" id="antig"><br><br>
            <select name="nivelEdu" id="nivelEdu">Nivel educativo:
                <option value="1">Secundario incompleto</option>
                <option value="2">Secundario completo</option>
                <option value="3">Terciario completo</option>
                <option value="4">Universitario completo</option>
            </select>
            <button type="submit">CALCULAR</button>
        </form>
    </body>
</html>
