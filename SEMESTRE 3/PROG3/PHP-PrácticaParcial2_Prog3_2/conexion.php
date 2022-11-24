<?php

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
 */

    $host = "localhost";
    $user = "root";
    $password = "mysql";
    $dbname = "escuela";
    $con = new mysqli($host, $user, $password,$dbname);

    if (!$con) {
        die("Connection failed: " . mysqli_connect_error());
    }
    
?>
