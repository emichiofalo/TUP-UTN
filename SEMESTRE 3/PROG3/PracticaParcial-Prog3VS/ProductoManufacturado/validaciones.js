function ValidarCampos(){
    var tiempo = document.getElementById("tmpFabrictx").value;
    var denom = document.getElementById("denomtx").value;
    var precio = document.getElementById("precioVentatx").value;
    var ganancia = document.getElementById("margGananciatx").value;
    var rubro = document.getElementById("rubroSlct").value;
    if (tiempo == "" || denom == "" || precio == "" || ganancia == "") {
        alert("Todos los campos deben estar completos.");
    }else {
        if (!ValidarDecimal(precio)){
            alert("El precio debe ser un número decimal. (Utilice punto en vez de coma.)");
        }else{
            CargarDatosTabla(tiempo,denom,precio,ganancia,rubro);
        }
    }
}

function ValidarEntero(numero, campo){
    if (!Number.isInteger(Number(numero))) {
        alert("El " + campo + " debe contener un número entero.");
    }
}

function ValidarDecimal(numero){
    var RE = /^\d*\.?\d*$/;
    if (RE.test(Number(numero))){
        return true;
    }else{
        return false;
    }
}

function CargarDatosTabla(tiempo,denom,precio,ganancia,rubro){
    document.getElementById("tablaDatos").style.display = "inline";
    document.getElementById("tdTiempo").innerText = tiempo;
    document.getElementById("tdDenom").innerText = denom.toUpperCase();
    document.getElementById("tdPrecio").innerText = precio;
    document.getElementById("tdGanancia").innerText = ganancia;
    document.getElementById("tdRubro").innerText = rubro.toUpperCase();
}