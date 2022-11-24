<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Actualizar noticia</title>
        <!-- include Boostrap 5 -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" />
        <!-- include tinymce -->
        <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    </head>
    <body>
        <?php
        include "conexion.php";
        $id=$_GET['id'];
        $sql="SELECT * FROM noticia WHERE id='$id';";
        $result=mysqli_query($con,$sql);
        $row=mysqli_fetch_assoc($result);
        
        $titulox=$row['titulo'];
        $resumenx=$row['resumen'];
        $contenido_htmlx=$row['contenido_html'];
        $publicadax=$row['publicada'];
        $fecha_publicacionx=$row['fecha_publicacion'];
        echo "<div style='margin:3%'>".
                "<br><h3>Datos actuales de la noticia: </h3>".
                "<br><b> Título: </b>".$titulox. 
                "<br><b> Resumen: </b>".$resumenx .  
                "<br><b> Publicada: </b>".$publicadax . 
                "<br><b> Fecha publicación: </b>".$fecha_publicacionx.
                "<br><b> Contenido: </b>".$contenido_htmlx.
                "</div>";
        
        if (isset($_POST ['submit'])) {
            $titulo = filter_input(INPUT_POST, 'titulo');
            $resumen = filter_input(INPUT_POST, 'resumen');
            $fecha = filter_input(INPUT_POST, 'fecha_publicacion');
            $publicada = filter_input(INPUT_POST, 'publicada');
            //$imagen = filter_input(INPUT_POST, 'imagen');
            $contenido_html = filter_input(INPUT_POST, 'contenido_html');

            $sql = "UPDATE noticia SET titulo='$titulo',resumen='$resumen', contenido_html='$contenido_html', publicada='$publicada', fecha_publicacion='$fecha' WHERE id='$id';";

            if (mysqli_query($con, $sql)) {
                //echo "New record created successfully";
                header('location:inicio.php');
            } else {
                echo "Error: " . $sql . "<br>" . mysqli_error($con);
            }

        }
        ?>

        <div class="container mt-4">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header text-center bg-success text-white">
                            <h4>Actualizar noticia</h4>
                        </div>
                        <div class="card-body">
                            <form method='post' action=''>
                                <div class="mb-3">
                                    <label><strong>Título:</strong></label>
                                    <input type="text" name="titulo" id="titulo" class="form-control">
                                </div>
                                <div class="mb-3">
                                    <label><strong>Resumen:</strong></label>
                                    <input type="text" name="resumen" id="resumen" class="form-control">
                                </div>
                                <table width="100%">
                                    <tr>

                                        <td><div class="mb-3">
                                                <label><strong>Fecha de publicación:</strong></label>
                                                <input type="date" name="fecha_publicacion" class="form-control" value=<?php echo $fecha_publicacionx;?>>
                                            </div></td>
                                        <td><div class="mb-3">
                                                <label><strong>Publicada:</strong></label>
                                                <select name="publicada" id="select" class="form-control">
                                                    <?php echo ("<script>");?>
                                                    <?php if($publicadax=='Y'){
                                                            echo ("var option1 = document.getElementById('Y');"
                                                                    . "option1.setAttribute('selected', 'true');");
                                                            }else{
                                                            echo ("var option2 = document.getElementById('N');"
                                                                    . "option2.setAttribute('selected', 'true';</script>");
                                                            }?>
                                                    <option value="Y" id="Y">Si</option>
                                                    <option value="N" id="N">No</option>
                                                </select>
                                            </div></td>
                                    </tr>
                                </table>
                                <div class="mb-1">
                                    <label><strong>Contenido:</strong></label>
                                    <textarea id="mytextarea" name='contenido_html' class="form-control"></textarea><br>
                                </div>
                                <div class="d-flex justify-content-center">
                                    <input type="submit" name="submit" value="ACTUALIZAR" class="btn btn-success">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Script -->
        <script>
            tinymce.init({
                selector: '#mytextarea',
                plugins: [
                    'a11ychecker', 'advlist', 'advcode', 'advtable', 'autolink', 'checklist', 'export',
                    'lists', 'link', 'image', 'charmap', 'preview', 'anchor', 'searchreplace', 'visualblocks',
                    'powerpaste', 'fullscreen', 'formatpainter', 'insertdatetime', 'media', 'table', 'help', 'wordcount'
                ],
                toolbar: 'undo redo | formatpainter casechange styleselect | bold italic backcolor | ' +
                        'alignleft aligncenter alignright alignjustify | ' +
                        'bullist numlist checklist outdent indent | removeformat | a11ycheck code table help'
            });
        </script>
    </body>
</html>
