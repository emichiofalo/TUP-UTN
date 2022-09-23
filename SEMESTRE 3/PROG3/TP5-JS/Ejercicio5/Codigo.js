function Validar(){
    if (document.getElementById("radioSi").checked) {
        alert("Bienvenido");
    }else if (document.getElementById("radioNo").checked){
        alert("No puede ingresar al sitio.")
    }else{
        alert("Debe seleccionar una opción.")
    }
}