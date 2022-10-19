<%-- 
    Document   : index
    Created on : 19 oct 2022, 15:56:21
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
        <h3>Punto 1</h3>
        <form action="tabla1.jsp" method="post">
            <table align="center" width="100%">
                <tr>
                    <td>Filas</td>
                    <td><input value="" type="text" name="filas" id="idfilas"></input></td>
                </tr>
                <tr>
                    <td>Columnas</td>
                    <td><input value="" type="text" name="columnas" id="idcolumnas"></input></td>
                </tr>
                <br>
                <table width="100%">
                    <tr>
                        <td align="center"><input type="submit" value="Aceptar" style="font-family: verdana; font-size: 14px; color: #150567; border-color: #92c7c7; background-color: #92c7c7" border="0"></input></td>
                    </tr>
                </table>
            </table>
        </form>
        <h3>Punto 2</h3>
        <form action="tabla2.jsp" method="post">
            <table align="center" width="100%">
                <tr>
                    <td>DNI</td>
                    <td><input value="" type="text" name="dni" id="iddni"></input></td>
                </tr>
                <tr>
                    <td>NOMBRE</td>
                    <td><input value="" type="text" name="nombre" id="idnombre"></input></td>
                </tr>
                <tr>
                    <td>DOMICILIO</td>
                    <td><input value="" type="text" name="domicilio" id="iddomicilio"></input></td>
                </tr>
                <br>
                <table width="100%">
                    <tr>
                        <td align="center"><input type="submit" value="Aceptar" style="font-family: verdana; font-size: 14px; color: #150567; border-color: #92c7c7; background-color: #92c7c7" border="0"></input></td>
                    </tr>
                </table>
            </table>
        </form>
        <h3>Punto 3</h3>
        <br>
        <button onclick="window.location='tabla3.jsp'" style="font-family: verdana; font-size: 14px; color: #150567; border-color: #92c7c7; background-color: #92c7c7" border="0">Mostrar registros</button>
    </body>
</html>
