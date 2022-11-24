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
        $f = $_GET["f"];
        echo "<br>Fila: $f";
        $c = $_GET["c"];
        echo "<br>Columna: $c";
        $x = $_GET["x"];
        echo "<br>Valor: $x <br>";

        $matriz = array();
        for ($i = 0; $i < $tamMatriz; $i++) {
            for ($j = 0; $j < $tamMatriz; $j++) {
                $matriz[$i][$j] = 0;
            }
        }

        if (@$matriz[$f][$c] !== null) {
            $matriz[$f][$c] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f][$c + 1] !== null) {
            $matriz[$f][$c + 1] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f + 1][$c + 1] !== null) {
            $matriz[$f + 1][$c + 1] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f + 1][$c] !== null) {
            $matriz[$f + 1][$c] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f + 1][$c - 1] !== null) {
            $matriz[$f + 1][$c - 1] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f][$c - 1] !== null) {
            $matriz[$f][$c - 1] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f - 1][$c - 1] !== null) {
            $matriz[$f - 1][$c - 1] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f - 1][$c] !== null) {
            $matriz[$f - 1][$c] = $x;
            $x = $x + 1;
        }
        if (@$matriz[$f - 1][$c + 1] !== null) {
            $matriz[$f - 1][$c + 1] = $x;
            $x = $x + 1;
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
