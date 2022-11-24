<%-- 
    Document   : index
    Created on : 22 nov 2022, 18:04:36
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga precio</title>
    </head>
    <body>
        <form action="calcular_precio_venta.jsp" method="post">
            Codigo: <input type="number" name="codigo" id="codigo"><br><br>
            Nombre del artículo: <input type="text" name="nombre" id="nombre"><br><br>
            Precio costo: <input type="number" name="costo" id="costo"><br><br>
            Margen de ganancia: <input type="number" name="gan" id="gan"><br><br>
            Fecha de vencimiento: <input type="date" name="fecha" id="fecha"><br><br>
            IVA:<select name="iva" id="iva">
                <option value="1">0%</option>
                <option value="2">10.5%</option>
                <option value="3">21%</option>
            </select><br><br>
            <button type="submit">CALCULAR</button>
        </form>
    </body>
</html>
