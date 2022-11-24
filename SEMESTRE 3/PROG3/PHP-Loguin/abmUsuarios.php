<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>

        <input type="text" id="user" />
        <input type="button" value="Buscar" onclick="reload()"/>
        <?php
        include 'conexion.php';

        if (@$_GET["bus"] !== null && $_GET['bus'] !== "") {
            $sql = "SELECT id, usuario, clave FROM usuario where usuario = '". $_GET["bus"] ."';";
            $result = mysqli_query($con, $sql);
             if ($result) {
                echo '<table>';
                while ($row = mysqli_fetch_assoc($result)) {
                    $id = $row['id'];
                    $usuario = $row['usuario'];
                    $clave = $row['clave'];

                    echo '<tr>';
                    echo '<td>';
                    echo $usuario;
                    echo '</td>';
                    echo '</tr>';
                }
                echo '</table>';
             }
        } else {
            $sql = "SELECT id, usuario, clave FROM usuario;";
            $result = mysqli_query($con, $sql);
            if ($result) {
                echo '<table>';
                while ($row = mysqli_fetch_assoc($result)) {
                    $id = $row['id'];
                    $usuario = $row['usuario'];
                    $clave = $row['clave'];

                    echo '<tr>';
                    echo '<td>';
                    echo $usuario;
                    echo '</td>';
                    echo '</tr>';
                }
                echo '</table>';
            }
        }
        ?>
    </body>
</html>
<script>
    function reload() {
        var bus = document.getElementById('user').value;
        self.location = 'abmUsuarios.php?bus=' + bus;
    }
</script>
