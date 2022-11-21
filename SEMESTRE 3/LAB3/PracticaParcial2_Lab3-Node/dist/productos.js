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
class Rubro {
    constructor() {
        this.id = 0;
        this.denominacion = "";
    }
}
class Producto {
    constructor() {
        this.id = 0;
        this.codigo = "";
        this.denominacion = "";
        this.precio = 0;
        this.idrubro = 0;
    }
}
function getRubrosJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/rubros';
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
        let selectContent = "";
        for (const rub of datos) {
            selectContent += '<option value="' + rub.id.toString() + '">' + rub.denominacion.toUpperCase() + '</option>\n';
        }
        ;
        var slctRubs = document.getElementById("rubrosSLCT");
        if (slctRubs) {
            slctRubs.innerHTML = selectContent;
        }
    });
}
function getProductosJSON(idRubro) {
    return __awaiter(this, void 0, void 0, function* () {
        const rubrosSLCT = document.getElementById("rubrosSLCT");
        let urlServer;
        if (rubrosSLCT.value) {
            urlServer = 'http://localhost:3000/productos/' + rubrosSLCT.value;
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
            let tablaHTML = "";
            tablaHTML = getEncabezado(tablaHTML);
            for (const prod of datos) {
                tablaHTML += '<tr>';
                tablaHTML += '<td>' + prod.codigo + '</td>';
                tablaHTML += '<td>' + prod.denominacion + '</td>';
                tablaHTML += '<td>' + prod.precio + '</td>';
                tablaHTML += '</tr>';
            }
            ;
            tablaHTML += '</table></tr>';
            var divProds = document.getElementById("tablaProductos");
            if (divProds) {
                divProds.innerHTML = tablaHTML;
            }
        }
    });
}
function getEncabezado(tablaHTML) {
    tablaHTML += '<table><tr>';
    tablaHTML += '<th>CÓDIGO</th>';
    tablaHTML += '<th>DENOMINACIÓN</th>';
    tablaHTML += '<th>PRECIO</th>';
    return tablaHTML;
}
