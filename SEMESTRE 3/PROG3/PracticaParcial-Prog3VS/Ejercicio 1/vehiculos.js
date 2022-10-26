function ValidarCampos(){
    var marca = document.getElementById("marca").value;
    var modelo = document.getElementById("modelo").value;
    var dominio = document.getElementById("domPat").value;
    if (marca == "" || modelo == "" || dominio == ""){
        alert("Debe completar todos los campos");
    }else{
        LeerDatosCargados();
    }
}

function AsignaEquipamiento(){
    var valor = document.getElementById("TVselect").value;
    var ac = document.getElementById("AC");
    var acl = document.getElementById("ACl");
    var da = document.getElementById("DA");
    var dal = document.getElementById("DAl");
    if (valor === "moto"){
        ac.style.display = "none";
        acl.style.display = "none";
        da.style.display = "none";
        dal.style.display = "none";
    }else{
        ac.style.display = "inline";
        acl.style.display = "inline";
        da.style.display = "inline";
        dal.style.display = "inline";
    }
}

function LeerDatosCargados(){
    var tipoV = document.getElementById("TVselect").value;
    var marca = document.getElementById("marca").value;
    var modelo = document.getElementById("modelo").value;
    var dominio = document.getElementById("domPat").value;
    var combustible = document.getElementById("combSelect").value;
    var condicion;
    if (document.getElementById("nuevo").checked){
        condicion = document.getElementById("new").innerHTML;
    }else if (document.getElementById("usado").checked){
        condicion = document.getElementById("used").innerHTML;
    }
    var equipamiento;
    if (document.getElementById("AC").checked){
        equipamiento = document.getElementById("ACl").innerHTML;
    }
    if (document.getElementById("DA").checked){
        equipamiento += ", " + document.getElementById("DAl").innerHTML;
    }
    if (document.getElementById("AL").checked){
        equipamiento += ", " + document.getElementById("ALl").innerHTML;
    }
    if (document.getElementById("ABS").checked){
        equipamiento += ", " + document.getElementById("ABSl").innerHTML;
    }
    alert(equipamiento);
    var descripcion = document.getElementById("descripcion").value;
    alert(descripcion);

    document.writeln("DATOS CARGADOS: ");
    document.writeln("Tipo vehículo: " + tipoV + "<br>");
    document.writeln("Marca: " + marca + "<br>");
    document.writeln("Modelo: " + modelo + "<br>");
    document.writeln("Dominio: " + dominio + "<br>");
    document.writeln("Combustible: " + combustible + "<br>");
    document.writeln("Condición: " + condicion + "<br>");
    document.writeln("Equipamiento: " + equipamiento + "<br>");
    document.writeln("Descripción: " + descripcion);
}