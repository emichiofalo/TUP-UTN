<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Matriz - celdas colindantes</title>
    </head>
    <body>
        <form action="" method="post">
            <p>Tamaño de la matriz: <input type="number" name="tamMatriz" id="tamMatriz">
                <?php
                if (filter_input(INPUT_GET, 'msg1') === (String) 1) {
                    echo "<label style='color: red'>Ingresar un número impar mayor o igual a 5.</label>";
                }
                ?></p>
            <p>Fila seleccionada: <input type="number" name="fila" id="fila">
                <?php
                if (filter_input(INPUT_GET, 'msg2') === (String) 1) {
                    echo "<label style='color: red'>La fila seleccionada se encuentra fuera de la matriz.</label>";
                }
                ?></p>
            <p>Columna seleccionada: <input type="number" name="columna" id="columna">
                <?php
                if (filter_input(INPUT_GET, 'msg3') === (String) 1) {
                    echo "<label style='color: red'>La columna seleccionada se encuentra fuera de la matriz.</label>";
                }
                ?></p>
            <p>Valor para la celda seleccionada: <input type="number" name="valor" id="valor"></p>
                <?php
                if (filter_input(INPUT_GET, 'msg4') === (String) 1) {
                    echo "<label style='color: red'>Todos los campos deben estar completos.</label>";
                }
                ?></p>
        <button type="submit" name="validarbtn" id="validarbtn">GENERAR MATRIZ</button>
    </form>
    <?php
    if (isset($_POST["validarbtn"])) {
        $path = "location:C_carga4Datos.php?";

        $tamMatriz = $_POST["tamMatriz"];
        if ($tamMatriz % 2 == 0 || $tamMatriz < 5) {
            $path = $path . "msg1=1&";
        }
        $fila = $_POST["fila"];
        $columna = $_POST["columna"];
        if ($fila > $tamMatriz - 1) {
            $path = $path . "msg2=1&";
        }
        if ($columna > $tamMatriz - 1) {
            $path = $path . "msg3=1&";
        }
        $valor = $_POST["valor"];
        if ($columna == null || $fila == null || $tamMatriz == null || $valor == null) {
            $path = $path . "msg4=1&";
        }

        if ($path != "location:C_carga4Datos.php?") {
            header($path);
        } else {
            $valor = $_POST["valor"];
            //header("location:C_generarMatriz.php?tamMatriz=$tamMatriz&fila=$fila&columna=$columna&valor=$valor");
            header("location:C_generarMatriz2.php?tamMatriz=$tamMatriz&f=$fila&c=$columna&x=$valor");
        }
    }
    ?>
</body>
</html>