<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Carga Matriz</title>
    </head>
    <body>
        <form action="" method="post">
            <p>Ingrese un número: <input type="number" name="num" id="num">
                <?php
                if (filter_input(INPUT_GET, 'msg1') === (String) 1) {
                    echo "<label style='color: red'>El número debe ser impar.</label>";
                }
                ?></p>
            <button type="submit" name="validarbtn" id="validarbtn">GENERAR MATRIZ</button>
        </form>
        <?php
    if (isset($_POST["validarbtn"])) {
        $path = "location:carga_matriz.php?";

        $tamMatriz = $_POST["num"];
        if ($tamMatriz % 2 == 0) {
            $path = $path . "msg1=1";
        }
        if ($path != "location:carga_matriz.php?") {
            header($path);
        } else {
            $num = $_POST["num"];
            header("location:genera_matriz.php?num=$num");
        }
    }
    ?>
    </body>
</html>
