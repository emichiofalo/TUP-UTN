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
        $tamMatriz = $_GET["tamMatriz"];
        echo "<br>Tamaño matriz: $tamMatriz";
        $fila = $_GET["fila"];
        echo "<br>Fila: $fila";
        $columna = $_GET["columna"];
        echo "<br>Columna: $columna";
        $valor = $_GET["valor"];
        echo "<br>Valor: $valor <br>";
        
        $matriz = array();
        for ($i = 0; $i < $tamMatriz; $i++) {
            for ($j = 0; $j < $tamMatriz; $j++) {
                if ($i == $fila && $j == $columna) {
                    $matriz[$i][$j] = $valor;
                } else {
                    $matriz[$i][$j] = 0;
                }
            }
        }
        if ($fila == $tamMatriz-1 && $columna == 0) {
            $matriz[$fila][$columna + 1] = $valor + 1;
            $matriz[$fila - 1][$columna] = $valor + 3;
            $matriz[$fila - 1][$columna + 1] = $valor + 2;
        } else if ($fila == $tamMatriz - 1 && $columna == $tamMatriz - 1) {
            $matriz[$fila][$columna - 1] = $valor + 1;
            $matriz[$fila - 1][$columna - 1] = $valor + 2;
            $matriz[$fila - 1][$columna] = $valor + 3;
        } else if ($fila >= 0 && $columna == 0){
            $matriz[$fila][$columna + 1] = $valor + 1;
            $matriz[$fila + 1][$columna + 1] = $valor + 2;
            $matriz[$fila + 1][$columna] = $valor + 3;
            $matriz[$fila - 1][$columna] = $valor + 4;
            $matriz[$fila - 1][$columna + 1] = $valor + 5;
        } else if ($fila >= 0 && $columna == $tamMatriz-1){
            $matriz[$fila + 1][$columna] = $valor + 1;
            $matriz[$fila + 1][$columna - 1] = $valor + 2;
            $matriz[$fila][$columna - 1] = $valor + 3;
            $matriz[$fila - 1][$columna - 1] = $valor + 4;
            $matriz[$fila - 1][$columna] = $valor + 5;
            $matriz[$fila - 1][$columna + 1] = $valor + 6;
        } else {
            $matriz[$fila][$columna + 1] = $valor + 1;
            $matriz[$fila + 1][$columna + 1] = $valor + 2;
            $matriz[$fila + 1][$columna] = $valor + 3;
            $matriz[$fila + 1][$columna - 1] = $valor + 4;
            $matriz[$fila][$columna - 1] = $valor + 5;
            $matriz[$fila - 1][$columna - 1] = $valor + 6;
            $matriz[$fila - 1][$columna] = $valor + 7;
            $matriz[$fila - 1][$columna + 1] = $valor + 8;
        }
      
        echo "<br>";
        echo "<table>";
        for ($i = 0; $i < $tamMatriz; $i++) {
            echo "<tr>";
            for ($j = 0; $j < $tamMatriz; $j++) {
                $num = $matriz[$i][$j];
                echo "<td>$num</td>";
            }
            echo "</tr>";
        }
        echo "</table>";
        ?>
    </body>
</html>
