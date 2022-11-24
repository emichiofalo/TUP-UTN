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
        <br>
        Valor Uno: <?php echo $_POST["valor1"]; ?><br>
        Valor Dos: <?php echo $_POST["valor2"]; ?><br>
        <br>
        <?php
        $cell = $_POST["valor2"];
        $v1 = $_POST["valor1"];
        $v2 = $_POST["valor2"];
        if ($_POST["valor1"] == $_POST["valor2"]) {
            echo '<table style = "border: 1px solid","border-collapse: collapse">';
            for ($i = 0; $i < $v1; $i++) {
                echo '<tr>';
                for ($j = 0; $j < $v2; $j++) {
                    echo '<td style = " background-color: white; color: black;border: 2px solid grey; margin: 0px;padding: 20px;border-collapse: collapse;">';
                    if (($cell - 1) == $j) {
                        echo "1";
                    } else {
                        echo "0";
                    }
                    echo "</td>";
                }
                $cell--;
                echo "</tr>";
            }
            echo "</table>";
        }else{
            echo "Los valores tienen que ser iguales.";
            echo "<br>";
        }
        ?>
        <br>
        <a href="index.php">VOLVER</a>          
    </body>
</html>
