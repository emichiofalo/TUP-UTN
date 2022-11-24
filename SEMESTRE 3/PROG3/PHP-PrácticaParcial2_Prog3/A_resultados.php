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
        <?php
        $cadena = $_POST["cadena"];
        $split = explode('-', $cadena);
        echo "Se ingresaron los números: ";
        $sumaNumeros = 0;
        $menor = 0;
        $mayor = 0;
        foreach ($split as $num){
            echo $num . "  ";
            $sumaNumeros += $num;
            if ($num > 0){
                $mayor = $num;
            }
            if ($menor == 0){
                $menor = $num;
            }else if($num < $menor){
                $menor = $num;
            }
        }
        $promedio = $sumaNumeros / count($split);
               
        echo "<br>Se ingresaron " . count($split) . " números";
        echo "<br>La suma de los números es igual a " . $sumaNumeros;
        echo "<br>El promedio de los números es " . $promedio; 
        echo "<br>El menor número es " . $menor;
        echo "<br>El mayor número es " . $mayor; 
        
        sort($split);
        $contados = array_count_values($split);
        $repetidos = array_unique($split);
        foreach($repetidos as $key){
            if ($contados[$key]>1) {
                echo "<br>El número " . $key . " se repite " . "$contados[$key] " . "veces";
            }
        }
        ?>
    </body>
</html>
