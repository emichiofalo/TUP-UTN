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
        include "conexion.php"; 
        if(isset($_GET['id'])){
            $id=$_GET['id'];
            
            $sql="DELETE FROM noticia WHERE id=$id";
            $result=mysqli_query($con,$sql);
            if($result){
                //echo "Deleted successfully";
                header('location:inicio.php');
            }
            
        }
        ?>
    </body>
</html>
