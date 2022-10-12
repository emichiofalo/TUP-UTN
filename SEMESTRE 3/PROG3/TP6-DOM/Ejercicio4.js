function cambiarColor(){
    var elements = document.getElementsByTagName("p1");
    for (let index = 0; index < elements.length; index++) {
        elements[index].style.color = "blue";
    }
}