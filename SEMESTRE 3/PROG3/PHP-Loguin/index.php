<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/PHP/PHPProject.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <table>
            <tr>
                <td>
                    Usuario:
                </td>
                <td>
                    <input type="text" id="user">
                </td>
                <td><label id="userError" style="display: none; color: rgb(255, 0, 0);">mal</label></td>
            </tr>
            <tr>
                <td>
                    Contraseña:
                </td>
                <td>
                    <input type="password" id="pass">
                </td>
                <td><label id="passError" style="display: none; color: rgb(255, 0, 0);">mal</label></td>
            </tr>
            <tr>
                <td>
                    <input type="button" value="Mandale" onclick="validar()" />
                </td>
            </tr>
        </table>
        <?php
        include 'conexion.php';
        if (isset($_GET["usuario"])) {
            echo $_GET["usuario"];
            $sql = "SELECT id, usuario, clave FROM usuario where usuario = '" . $_GET["usuario"] . "';";
            $result = mysqli_query($con, $sql);
            $usuario;
            $clave;
            if ($result) {
                while ($row = mysqli_fetch_assoc($result)) {
                    $id = $row['id'];
                    $usuario = $row['usuario'];
                    $clave = $row['clave'];
                }
            }
            if ($clave === $_GET["clave"]) {
                header("location: abmUsuarios.php");
            }
        }
        ?>
    </body>
    <script src="loguin.js"></script>
</html>
