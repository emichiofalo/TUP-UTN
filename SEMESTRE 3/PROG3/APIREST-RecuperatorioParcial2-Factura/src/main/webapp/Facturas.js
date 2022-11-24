/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


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

class Factura {
    constructor() {
        this.id = 0;
        this.fechaComprobante = "";
        this.puntoVenta = 0;
        this.nroComprobante = 0;
        this.periodo = 0;
        this.letra = "";
        this.montoTotal = 0;
    }
}

function checkInput(){
    var ptoVenta = document.getElementById('ptoVenta');
    var nroComp = document.getElementById('nroComp');
    
    if (!ptoVenta.value || !nroComp.value) {
        getFacturasJSON();
    }else{
        getFiltroFacturasJSON(ptoVenta.value, nroComp.value);
    }
}

function getFacturasJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:8080/apprest/rest/facturas/all';
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
        for (const f of datos) {
            grillaHTML += '<tr>';
            grillaHTML += '<td>' + f.fechaComprobante + '</td>';
            grillaHTML += '<td>' + f.puntoVenta + '-' + f.nroComprobante + '</td>';
            grillaHTML += '<td>' + f.periodo + '</td>';
            grillaHTML += '<td>' + f.letra + '</td>';
            grillaHTML += '<td>' + f.montoTotal + '</td>';
            grillaHTML += '<td><a href="factura_detalle.jsp?id='+f.id+'">Ver Detalle</a></td>';
            grillaHTML += '</tr>';
        }
        grillaHTML += '</table>';
        ;
        var div = document.getElementById("listaFacturas");
        if (div) {
            div.innerHTML = grillaHTML;
        }
    });
}

function getFiltroFacturasJSON(ptoVenta, nroComp) {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:8080/apprest/rest/facturas/filter/'+ptoVenta+'/'+nroComp;
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
        for (const f of datos) {
            grillaHTML += '<tr>';
            grillaHTML += '<td>' + f.fechaComprobante + '</td>';
            grillaHTML += '<td>' + f.puntoVenta + '-' + f.nroComprobante + '</td>';
            grillaHTML += '<td>' + f.periodo + '</td>';
            grillaHTML += '<td>' + f.letra + '</td>';
            grillaHTML += '<td>' + f.montoTotal + '</td>';
            grillaHTML += '<td><a href="factura_detalle.jsp?id='+f.id+'">Ver Detalle</a></td>';
            grillaHTML += '</tr>';
        }
        grillaHTML += '</table>';
        ;
        var div = document.getElementById("listaFacturas");
        if (div) {
            div.innerHTML = grillaHTML;
        }
    });
}

function getEncabezado(grillaHTML) {
    grillaHTML += '<table>';
    grillaHTML += '<tr>';
    grillaHTML += '<td><b>Fecha Comprobante</b></td>';
    grillaHTML += '<td><b>Punto Venta - Nº Comprobante</b></td>';
    grillaHTML += '<td><b>Perido</b></td>';
    grillaHTML += '<td><b>Letra</b></td>';
    grillaHTML += '<td><b>Monto Total</b></td>';
    grillaHTML += '<td><b>Vínculo</b></td>';
    grillaHTML += '</tr>';
    return grillaHTML;
}
