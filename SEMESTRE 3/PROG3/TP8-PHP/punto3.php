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
        if (isset($_GET['button1'])) {
            $dir = getcwd();
            $path2file = $dir."\\"."punto3.txt";
            $file = fopen($path2file, "c");
            fwrite($file, "Ejemplo-de-escritura-de-un-archivo-de-php".PHP_EOL);
            fclose($file);
            echo "<br>";
            
            $file = fopen("punto3.txt", "r");
            while(!feof($file)){
                $txt = fgets($file);
                echo $txt;
                $split = explode('-', $txt);
                echo "<br>";
                foreach ($split as $word){
                    echo "<br>";
                    echo $word;
                }
            }
            fclose($file);
            echo "<br>";
        }   
        ?>
        <br>
        <a href="index.php">VOLVER</a>  
    </body>
</html>
