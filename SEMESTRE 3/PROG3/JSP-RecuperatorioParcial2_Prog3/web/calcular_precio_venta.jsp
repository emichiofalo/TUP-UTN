<%-- 
    Document   : calcular_precio_venta
    Created on : 23 nov 2022, 15:08:12
    Author     : Emi Chiófalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculo precio venta</title>
    </head>
    <body>
        <%
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nombre = request.getParameter("nombre");
            int costo = Integer.parseInt(request.getParameter("costo"));
            double ganancia = Integer.parseInt(request.getParameter("gan"));
            String fecha = request.getParameter("fecha").toString();
            int iva = Integer.parseInt(request.getParameter("iva"));
           
            double gananciaAux = 1 + (ganancia/100);
            double precioVenta = costo * gananciaAux;
            double montoiva = 0;
            String ivastr = "";

            switch (iva) {
                case 1:
                    montoiva = 0;
                    ivastr = "0%";
                    break;
                case 2:
                    montoiva = costo * (0.105);
                    ivastr = "10,5%";
                    break;
                case 3:
                    montoiva = costo * (0.21);
                    ivastr = "21%";
                    break;
            }
            precioVenta += montoiva;
        %>

        <br>DATOS CARGADOS: <br>
        <br>Código <% out.println(codigo); %>
        <br><br>Nombre del artículo: <% out.println(nombre); %>
        <br><br>Precio de costo: <% out.println(costo); %>
        <br><br>Margen de ganancia: <% out.println(ganancia); %>
        <br><br>Fecha de vencimiento: <% out.println(fecha); %>
        <br><br>IVA: <% out.println(iva);%>
        <br><br>Precio de venta: <% out.println(precioVenta);%>
    </body>
</html>
