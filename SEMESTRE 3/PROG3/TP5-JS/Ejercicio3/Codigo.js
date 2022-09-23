var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
var nroDNI = prompt("Ingrese su numero de DNI sin puntos: ");
var letraDNI = prompt("Ingrese la letra de su DNI: ");

nroDNI <0 || nroDNI>99999999 || !isNumero(nroDNI) ? alert("El número proporcionado no es válido.") : CalculoLetra(nroDNI);

function CalculoLetra(numero){
    var resto = numero%23;
    var letra = letras[resto];
    CompararLetra(letra);
}

function CompararLetra(letra){
    letra === letraDNI.toUpperCase() ? alert("El número y la letra ingresados son correctos.") : 
    alert("La letra indicada no es correcta. La letra de su documento es: " + letra);
}

function isNumero(value) {
    return /^-?\d+$/.test(value);
}