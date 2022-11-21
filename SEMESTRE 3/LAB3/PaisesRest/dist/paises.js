"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
class Pais {
    constructor() {
        this.codigo = "";
        this.nombre = "";
        this.continente = "";
        this.poblacion = 0;
    }
}
class Consulta {
    constructor() {
        this.pmax = 0;
        this.pmin = 0;
    }
}
function getPaisesJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/paises';
        const txtSearchMax = document.getElementById("txtSearchMax");
        const txtSearchMin = document.getElementById("txtSearchMin");
        if (txtSearchMax.value && txtSearchMax.value != "" && txtSearchMin.value && txtSearchMin.value != "") {
            urlServer = 'http://localhost:3000/paises/' + parseInt(txtSearchMax.value) + '-' + parseInt(txtSearchMin.value);
        }
        let response = yield fetch(urlServer, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        console.log(response);
        let datos = yield response.json();
        let grillaHTML = "";
        grillaHTML = getEncabezado(grillaHTML);
        for (const pais of datos) {
            grillaHTML += '<tr>';
            grillaHTML += '<td>' + pais.codigo + '</td>';
            grillaHTML += '<td>' + pais.nombre + '</td>';
            grillaHTML += '<td>' + pais.continente + '</td>';
            grillaHTML += '<td>' + pais.poblacion + '</td>';
            grillaHTML += '</tr>';
        }
        ;
        //for clasico
        /*for(let i:number=0; i < datos.length; i++){
            grillaHTML += '<div class="row">';
            grillaHTML += '<div class="col">' + datos[i].id + '</div>';
            grillaHTML += '<div class="col">' + datos[i].fechaAlta + '</div>';
            grillaHTML += '<div class="col">' + datos[i].codigo + '</div>';
            grillaHTML += '<div class="col">' + datos[i].denominacion + '</div>';
            grillaHTML += '<div class="col">' + datos[i].precio + '</div>';
            grillaHTML += '<div class="col">' + datos[i].publicado + '</div>';
            grillaHTML += '</div>';
        }*/
        //NO USAR FOREACH PORQUE NO ES ASINCRONICO, HABRIA Q HACER UN CONTROLADOR PARA QUE MUESTRE LA GRILLA
        var divArt = document.getElementById("listaPaises");
        if (divArt) {
            divArt.innerHTML = grillaHTML;
        }
    });
}
function getEncabezado(grillaHTML) {
    grillaHTML += '<tr>';
    grillaHTML += '<td><b>CODIGO</b></td>';
    grillaHTML += '<td><b>NOMBRE</b></td>';
    grillaHTML += '<td><b>Continente</b></td>';
    grillaHTML += '<td><b>POBLACION</b></td>';
    grillaHTML += '</tr>';
    return grillaHTML;
}
