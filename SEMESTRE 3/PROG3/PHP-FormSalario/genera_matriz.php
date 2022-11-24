<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Genera Matriz</title>
    </head>
    <style>
        table{
            margin-left: 1%;
            margin-top: 1%;
        }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 15px;
        }
    </style>
    <body>
        <?php
        $tamMatriz = $_GET["num"];
        $matriz = array();
        for ($i = 0; $i < $tamMatriz; $i++) {
            for ($j = 0; $j < $tamMatriz; $j++) {
                $matriz[$i][$j] = random_int(0, 100);
            }
        }
        echo "<br>";
        echo "<table>";
        for ($i = 0; $i < $tamMatriz; $i++) {
            echo "<tr>";
            for ($j = 0; $j < $tamMatriz; $j++) {
                echo "<td>".$matriz[$i][$j]."</td>";
            }
            echo "</tr>";
        }
        echo "</table>";
        
        $centro = intval($tamMatriz / 2);
        echo "$centro";
        
        $fila = 0;
        $columna = 0;
        
        $matriz2 = array();
        for ($i = 0; $i < $tamMatriz; $i++) {
            for ($j = 0; $j < $tamMatriz; $j++) {
                $matriz2[0][$i] = $matriz[$i][$centro-1];
                $matriz2[1][$i] = $matriz[$centro-1][$j];
            }
        }
        
        echo "<br>";
        echo "<table>";
        for ($i = 0; $i < 2; $i++) {
            echo "<tr>";
            for ($j = 0; $j < $tamMatriz; $j++) {
                echo "<td>".$matriz2[$i][$j]."</td>";
            }
            echo "</tr>";
        }
        echo "</table>";
        
        echo "<br>El promedio de la columna es " . $columna/$tamMatriz . ",el promedio de la fila es " . $fila/$tamMatriz . ".";
        
        ?>
    </body>
</html>
