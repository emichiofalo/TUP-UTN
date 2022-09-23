var sueldo = prompt("Ingrese el sueldo del operario: ");
var antiguedad = prompt("Ingrese su antigüedad: ");


sueldo >= 500 ? alert(sueldo) :
sueldo < 500 && antiguedad >= 10 ? alert(sueldo*=1.2) : 
sueldo < 500 && antiguedad < 10 ? alert(sueldo*=1.05) : alert("Ha ocurrido un error. Intente nuevamente.");