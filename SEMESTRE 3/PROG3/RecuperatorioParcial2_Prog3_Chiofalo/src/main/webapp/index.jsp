<%@page import="com.utn.managers.AgendaManager"%>
<%@page import="com.utn.managers.Conexion"%>
<%@page import="com.utn.apprest.AgendaRest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.utn.modelo.Agenda"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agenda</title>
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
    <body onload="getContactosJSON()">
        <h2 style="margin-left: 2%">AGENDA</h2>
        <table id="agenda" style="width: 50%;">
            <tr>
                <td>ID (solo lectura)</td>
                <td><input type="number" id="id" name="id" readonly/></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" id="nombre" name="nombre" required /></td>
            </tr>
            <tr>
                <td>Apellido</td>
                <td><input type="text" id="apellido" name="apellido" required/></td>
            </tr>
            <tr>
                <td>Teléfono</td>
                <td><input type="number" id="telefono" name="telefono" required /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" id="email" name="email" required/></td>
            </tr>
            <tr>
                <td>Dirección</td>
                <td><input type="text" id="domicilio" name="domicilio" required/></td>
            </tr>
            <tr>
                <td>
                    <div id="txtMensaje" style="color: rgb(0, 153, 255); font-weight: bold;"></div>
                </td>
                <td>
                    <button onclick="limpiarDatos()">LIMPIAR</button>
                    <button onclick="insertarActualizarDatos()">GUARDAR</button>
                </td>
            </tr>
        </table>
        <hr>
        <hr style="border: white">
        <div id="listaContactos">
           
        </div>
    </body>
    <script src="Agendas.js"></script>
</html>


    
