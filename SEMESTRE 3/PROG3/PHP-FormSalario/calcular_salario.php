<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Calcular Salario</title>
    </head>
    <body>
        <?php
            $legajo = $_POST["legajo"];
            $nombre = $_POST["nombre"]; 
            $sueldo = $_POST["sueldo"];
            $antig = $_POST["antig"];
            $nivelEdu = $_POST["nivelEdu"];
            $sueldoNuevo;
            
            switch ($nivelEdu){
                case "si": 
                    $nivelEdu = "Secundario Incompleto";
                    $sueldoNuevo = $sueldo;
                    break; 
                case "sc": 
                    $nivelEdu = "Secundario Completo"; 
                    $sueldoNuevo = $sueldo*1.2;
                    break;
                case "tc": 
                    $nivelEdu = "Terciario Completo"; 
                    $sueldoNuevo = $sueldo*1.3;
                    break; 
                case "uc":
                    $nivelEdu = "Universitario Completo";
                    $sueldoNuevo = $sueldo*1.4;
                    break;
            }
            $aumento = ($antig*0.02);
            $sueldoNuevo += $sueldo*$aumento; 
            
            echo "<br>DATOS CARGADOS: <br>"
            . "<br>Legajo: " . $legajo 
            . "<br><br>Nombre: " . $nombre
            . "<br><br>Sueldo básico: " . $sueldo
            . "<br><br>Antigüedad: " . $antig
            . "<br><br>Nivel educativo: " . $nivelEdu
            . "<br><br>Sueldo calculado: " . $sueldoNuevo;
            
        ?>
    </body>
</html>
