<%@page import="com.utn.managers.AgendaManager"%>
<%@page import="com.utn.managers.Conexion"%>
<%@page import="com.utn.apprest.AgendaRest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.utn.modelo.Agenda"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
%>
<html>
    <head>
        <link href="bootstrap-5.2.2-dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <script src="bootstrap-5.2.2-dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agenda</title>
    </head>
    <body onload="getAgendaJSON()">
        <h2>AGENDA</h2>
        <div id="agenda" style="width: 50%;" class="container text-left">
            <div class="row">
                <div class="col">ID (solo lectura)</div>
                <div class="col"><input type="number" id="id" name="id" readonly/></div>
            </div>
            <div class="row">
                <div class="col">Nombre</div>
                <div class="col"><input type="text" id="nombre" name="nombre" required /></div>
            </div>
            <div class="row">
                <div class="col">Apellido</div>
                <div class="col"><input type="text" id="apellido" name="apellido" required/></div>
            </div>
            <div class="row">
                <div class="col">Teléfono</div>
                <div class="col"><input type="number" id="telefono" name="telefono" required /></div>
            </div>
             <div class="row">
                <div class="col">Email</div>
                <div class="col"><input type="text" id="email" name="email" required/></div>
            </div>
            <div class="row">
                <div class="col">Dirección</div>
                <div class="col"><input type="text" id="direccion" name="direccion" required/></div>
            </div>
            <div class="row">
                <div class="col">
                    <div id="txtMensaje" style="color: rgb(0, 153, 255); font-weight: bold;"></div>
                </div>
                <div class="col">
                    <button onclick="limpiarDatos()">LIMPIAR</button>
                    <button onclick="insertarActualizarDatos()">GUARDAR</button>
                </div>
            </div>
        </div>
        <hr>
        <hr style="border: white">
        <div id="listaContactos" class="container text-center">
           
        </div>
    </body>
    <script src="Agendas.js"></script>
</html>


    
