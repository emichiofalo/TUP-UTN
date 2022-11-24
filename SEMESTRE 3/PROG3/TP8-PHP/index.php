<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>TP PHP</title>
    </head>
    <body>
        <br>
        <h3>Punto 1</h3>
        <form action="punto1.php" method="post">
            <p>VALOR 1 <input type="text" name="valor1" id="value1txt"></p>
            <p>VALOR 2 <input type="text" name="valor2" id="value2txt"></p>
            <button type="submit">ENVIAR</button>
        </form>
        <br>
        <h3>Punto 2</h3>
        <form action="index.php" method="post">
            <p>Ingrese una cadena: <input type="text" name="cadena"></p>
            <button type="submit">ENVIAR</button>
            <?php
            $cadena = filter_input(INPUT_POST, 'cadena');
            $array = str_split($cadena, 1);
            foreach ($array as $letra){
                echo "<br>";
                echo $letra;
            }
            ?>
        </form>        
        <br>
        <h3>Punto 3</h3>
        <form action="punto3.php" method="get">
            <button type="submit" name="button1" value="button1" onclick="WriteFile()">EJECUTAR</button>
        </form>      
    </body>
</html>
