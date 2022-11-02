//traer empleados de base de dato y cargarlos en tabla creando elementos de manera dinámica

function getDatosForm(){
    var legajo = document.getElementById("legajotxt").value;
    var apellido = document.getElementById("apellidotxt").value;
    var nombre = document.getElementById("nombretxt").value;
    var dni = document.getElementById("dnitxt").value;
    var sector = document.getElementById("sectortxt").value;
    var fecha = document.getElementById("date").value;
    var activo;
    if (document.getElementById("activoSI").checked) {
        activo = document.getElementById("activoSI").value;
    }else if (document.getElementById("activoNO").checked) {
        activo = document.getElementById("activoNO").value;
    }
}

function cargarEmpleado(){
    document.getElementById("form").setAttribute("action", "/insert");
}

function actualizarEmpleado(){
    document.getElementById("form").setAttribute("action", "/update");
}

function eliminarEmpleado(){
    document.getElementById("form").setAttribute("action", "/delete:"+document.getElementById("legajotxt").value);
}

