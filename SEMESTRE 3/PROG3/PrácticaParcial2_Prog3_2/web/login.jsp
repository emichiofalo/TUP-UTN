<%-- 
    Document   : login
    Created on : 9 nov 2022, 10:28:38
    Author     : Emi Chiófalo
--%>


<%@page import="Modelo.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Usuario:</td>
                <td><input type="text" id="user"></td>
                <td><label id="userError" style="display: none; color: rgb(255, 0, 0);">Incorrecto</label></td>
            </tr>
            <tr>
                <td>Contraseña:</td><td><input type="password" id="psw"></td>
                <td><label id="passError" style="display: none; color: rgb(255, 0, 0);">Incorrecto</label></td>
            </tr>
            <tr>
                <td><input type="submit" value="Mandale" onclick="validarDatos()"></td>
            </tr>
        </table>
    </body>
    <script>
        function validarDatos() {
            var user = document.getElementById("user");
            var psw = document.getElementById("psw");
            var userErr = document.getElementById("userError");
            var passErr = document.getElementById("passError");
            var error = false;
            limpiarError();

            if (user.value === null || user.value === "") {
                userErr.style.display = "inline";
                error = true;
            }
            if (psw.value === null || psw.value === "" || psw.value.length < 6) {
                passErr.style.display = "inline";
                error = true;
            }
            if (!error) {
                window.location = "login.jsp?usuario=" + user.value + "&clave=" + psw.value;
            }
        }
        function limpiarError() {
            var userErr = document.getElementById("userError");
            var passErr = document.getElementById("passError");

            userErr.style.display = "none";
            passErr.style.display = "none";
        }
    </script>
    <%
        
        if(request.getParameter("usuario") != null){
            String usuario = request.getParameter("usuario");
            String clave = request.getParameter("clave");
            
            Connection2 cn = new Connection2();
            java.sql.Connection con = cn.getConnection();
            java.sql.Statement state = con.createStatement();
            String query = "SELECT * FROM usuario WHERE usuario='" + usuario + "';";
            java.sql.ResultSet rs = state.executeQuery(query);
            
            int idnum; 
            String user, psw; 
            
            while (rs.next()){
                idnum = rs.getInt(1);
                user = rs.getString(2);
                psw = rs.getString(3);
                
                if (clave.equalsIgnoreCase(psw)){
                    response.sendRedirect("abmusuario.jsp");
                }
            }
        }
            

    %>
</html>