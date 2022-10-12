function sumar1(){
    var title = document.getElementById("title1");
    var value = title.childNodes.item(0);
    value.nodeValue = parseInt(value.nodeValue)+1;
}