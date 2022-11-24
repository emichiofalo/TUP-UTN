<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cátedra-Alumno</title>
    </head>
    <style>
        table{
            margin-left: 1%;
            margin-top: 1%;
            width: 50%;
        }
        th{
            border: 1px solid black;
            border-collapse: collapse;
            padding: 15px;
            background-color: dimgray;
            color:white;
        }
        table, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 15px;
        }
    </style>
    <body>
        <?php
        include "conexion.php";

        $sql = "SELECT * FROM catedra;";
        $result = mysqli_query($con, $sql);
        if ($result) {
            echo "<form type='post' action='Catedra-Alumno.php'>";
            echo "<select name='catedra' id='catedra' onchange='reload()'>";
            echo "<option unselectable>---seleccionar---</option>";
            while ($row = mysqli_fetch_assoc($result)) {
                $codigo = $row['codigo'];
                $denominacion = $row['denominacion'];

                echo "<option value='$codigo'>$denominacion</option>";
            }
            echo "</select>";
        }
        ?>
        <script>
            function reload() {
                var cat = document.getElementById('catedra').value;
                self.location = 'Catedra-Alumno.php?cat=' + cat;
            }
        </script>
        <div name="div" id="div">
            <?php
            if (isset($_GET['cat'])) {
                $catedra = intval($_GET['cat']);
                $sql = "SELECT * FROM catedra C "
                        . "INNER JOIN catedra_alumno CA ON C.codigo = CA.codigoCatedra "
                        . "INNER JOIN alumno A ON CA.legajoAlumno = A.legajo "
                        . "WHERE CA.codigoCatedra =$catedra;";
                $result = mysqli_query($con, $sql);
                if ($result) {
                    echo "<table>";
                    echo "<th>Nombre</th>";
                    echo "<th>Apellido</th>";
                    while ($row = mysqli_fetch_assoc($result)) {
                        echo "<tr>";
                        echo "<td>" . $nombre = $row['nombre'] . "</td>";
                        echo "<td>" . $apellido = $row['apellido'] . "</td>";
                        echo "</tr>";
                    }
                    echo "</table>";
                }
            }
            ?> 
        </div>
    </body>
</html>

