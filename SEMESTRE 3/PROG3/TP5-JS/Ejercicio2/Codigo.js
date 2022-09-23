var meses = ["ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"];
for (let index = 0; index < meses.length; index++) {
    document.writeln(meses[index] + "<br/>");
}

document.writeln("<br/>");

let i=0;
while (i < 12) {
    document.writeln(meses[i] + "<br/>");
    i++;
}