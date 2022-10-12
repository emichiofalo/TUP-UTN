function mostrarSoluciones(){
    var element = document.getElementById("lista");

    var newElement1 = document.createElement("li");
    var newText1 = document.createTextNode("Solución 1");
    newElement1.appendChild(newText1);

    var newElement2 = document.createElement("li");
    var newText2 = document.createTextNode("Solución 2");
    newElement2.appendChild(newText2);

    element.appendChild(newElement1);
    element.appendChild(newElement2);
}