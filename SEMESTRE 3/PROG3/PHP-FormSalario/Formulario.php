<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Datos empleado</title>
    </head>
    <body>
        <p>DATOS DEL EMPLEADO:</p>
        <form action="calcular_salario.php" method="post">
            Legajo: <input type="number" name="legajo" id="legajo"><br><br>
            Nombre del empleado: <input type="text" name="nombre" id="nombre"><br><br>
            Sueldo básico: <input type="number" name="sueldo" id="sueldo"><br><br>
            Antigüedad: <input type="number" name="antig" id="antig"><br><br>
            <select name="nivelEdu" id="nivelEdu">Nivel educativo:
                <option value="si">Secundario incompleto</option>
                <option value="sc">Secundario completo</option>
                <option value="tc">Terciario completo</option>
                <option value="uc">Universitario completo</option>
            </select>
            <button type="submit">CALCULAR</button>
        </form>
    </body>
</html>
