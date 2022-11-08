function mostrarSoluciones(){
    var element = document.getElementById("select");

    var newElement1 = document.createElement("option");
    var newText1 = document.createTextNode("Solución 1");
    newElement1.setAttribute("selected", "true");
    newElement1.appendChild(newText1);

    var newElement2 = document.createElement("option");
    var newText2 = document.createTextNode("Solución 2");
    newElement2.appendChild(newText2);

    element.appendChild(newElement1);
    element.appendChild(newElement2);
}

function actualizar(){
    var opt1 = document.getElementById("Y");
    var opt2 = document.getElementById("N");
    var opt3 = document.getElementById("X");

    opt3.setAttribute("selected", true);
}