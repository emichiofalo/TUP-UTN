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
        $numero = $_POST['num'];

        if ($numero < 3 || $numero % 2 == 0) {

            echo "Error, vuelva a intentarlo más tarde";
        } else {
            $central = intval($numero / 2);
            echo $central;

            echo "<table>";
            for ($index = 0; $index < $numero; $index++) {

                echo "<tr>";

                if ($central % 2 == 0) {
                    for ($index1 = 0; $index1 < $numero; $index1++) {
                        if ($index1 == 0 || $index1 % 2 == 0) {
                            echo "<td>1</td>";
                        } else {
                            echo "<td>0</td>";
                        }
                    }
                } else {
                    for ($index1 = 0; $index1 < $numero; $index1++) {
                        if ($index1 % 2 != 0) {
                            echo "<td>1</td>";
                        } else {
                            echo "<td>0</td>";
                        }
                    }
                }

                echo "</tr>";
            }

            echo "</table>";
        }
        ?>
    </body>
</html>
