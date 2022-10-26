function cargarDatos(){
    var legajo = document.getElementById("legajo").value;
    var nombre = document.getElementById("nombre").value;
    var codigo = document.getElementById("codigo").value;
    var mes = document.getElementById("codigo").value;
    var anio = document.getElementById("anio").value;
    var total = document.getElementById("total").value;
    var obs = document.getElementById("obs").value;

    validarCampoLleno(legajo, "Legajo");
    validarCampoLleno(nombre, "Nombre del Empleado");
    validarCampoLleno(codigo, "Código bono");
    validarCampoLleno(anio, "Año");
    validarCampoLleno(total, "Total");
    validarCampoLleno(obs, "Observaciones");
    validarAnio(anio);
    validarTotal(total);

    mostrarDatos(legajo,nombre,codigo,mes,anio,total,obs);
}

function validarCampoLleno(campo, nombre){
    if (campo == "") {
        alert("Debe completar el campo: " + nombre);
    }
}

function validarAnio(anio){
    if (anio>2022){
        alert("El año no puede ser mayor al actual.")
    }
}

function validarTotal(total){
    if (total < 0){
        alert("El total debe ser mayor a 0.");
    }    
}

function mostrarDatos(legajo,nombre,codigo,mes,anio,total,obs){
    var d = document.getElementById("datosFormulario");
    var datos = "DATOS CARGADOS:" + "<br>";
    datos += "Legajo: " + legajo + "<br>";
    datos += "Nombre del Empleado: " + nombre + "<br>";
    datos += "Código bono: " + codigo + "<br>";
    datos += "Mes: " + mes + "<br>";
    datos += "Año: " + anio + "<br>";
    datos += "Total: " + total + "<br>";
    datos += "Observaciones: " + obs + "<br>";
    d.innerHTML = datos;
}