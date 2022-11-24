<%@page import="com.utn.managers.FacturaManager"%>
<%@page import="com.utn.managers.Conexion"%>
<%@page import="com.utn.apprest.FacturaRest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.utn.modelo.Factura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Facturas</title>
    </head>
    <style>
        table{
            margin-left: 1%;
            margin-top: 1%;
        }
        table, th, td {
          padding: 8px;
        }
    </style>
    <body onload="checkInput()">
        <h2 style="margin-left: 2%">Facturas</h2>
        <p style="margin-left: 2%">Filtro:<br><br>
        Punto de venta <input type="number" name="ptoVenta" id="ptoVenta">
        Nro comprobante <input type="number" name="nroComp" id="nroComp">
        <button type="submit" onclick="checkInput()">BUSCAR</button>
        </p>
        <label style="color: blue; margin-left: 2%">Para filtrar por un solo campo, completar el otro con 0.</label>
        <hr>
        <hr style="border: white">
        <div id="listaFacturas"> 
        </div>
        
    </body>
    <script src="Facturas.js"></script>
</html>


    
