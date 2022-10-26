function generarInput(){
    var option = document.getElementById("inputSLCT").value;
    var d = document.getElementById("d");
    switch (option) {
        case "text":
            var el1 = document.createElement("input");
            el1.setAttribute("type", "text");
            el1.setAttribute("name", "newtext");
            el1.setAttribute("id", "newtxt");
            d.appendChild(el1);
            break;
        case "radio":
            var el2 = document.createElement("input");
            el2.setAttribute("type", "radio");
            el2.setAttribute("name", "radioButton");
            el2.setAttribute("id", "radioBtn");
            d.appendChild(el2);
            break;
        case "checkbox":
            var el3 = document.createElement("input");
            el3.setAttribute("type", "checkbox");
            el3.setAttribute("name", "check1");
            el3.setAttribute("id", "check1");
            d.appendChild(el3);
            break;
        case "area":
            var el3 = document.createElement("textarea");
            el3.setAttribute("name", "textarea1");
            el3.setAttribute("id", "txtarea1");
            d.appendChild(el3);
            break;
        default:
            break;
    }
}