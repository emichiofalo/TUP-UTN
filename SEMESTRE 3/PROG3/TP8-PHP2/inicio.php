<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Inicio Noticias</title>
        <!-- include Boostrap 5 -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" />
        <!-- include tinymce -->
        <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    </head>
    <body>
        <div class="container">
            <button class="btn bg-success my-5"><a href="crear.php" class="text-light">Crear noticia</a></button>
            <table class="table">
                <thead>
                    <th>Título</th>
                    <th>Resumen</th>                       
                    <th>Contenido</th>
                    <th>Publicada</th>
                    <th>Fecha publicación</th>
                    <th></th>
                    <th></th>
                </thead>
                <tbody>
                    <?php
                    include "conexion.php"; 
                    
                    $sql = "SELECT id, titulo, resumen, contenido_html, publicada, fecha_publicacion FROM noticia;";
                    $result=mysqli_query($con,$sql);
                    if($result){
                        while($row=mysqli_fetch_assoc($result)){
                            $id=$row['id'];
                            $titulo=$row['titulo'];
                            $resumen=$row['resumen'];
                            $contenido_html=$row['contenido_html'];
                            $publicada=$row['publicada'];
                            $fecha_publicacion=$row['fecha_publicacion'];
                            
                            echo '<tr><td>'.$titulo.'</td>'
                                    . '<td>'.$resumen.'</td>'
                                    . '<td>'.$contenido_html.'</td>'
                                    . '<td>'.$publicada.'</td>'
                                    . '<td>'.$fecha_publicacion.'</td>'
                                    . '<td><button class="btn bg-success"><a href="actualizar.php?id='.$id.'" class="text-light">Actualizar</a></button></td>'
                                    . '<td><button class="btn btn-danger"><a href="eliminar.php?id='.$id.'" class="text-light">Eliminar</a></button></td></tr>';                                    
                        }
                    }
                    ?>
                </tbody>
            </table>
        </div>
    </body>
</html>
