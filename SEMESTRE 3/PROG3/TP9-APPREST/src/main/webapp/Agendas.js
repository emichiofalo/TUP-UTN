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
let id = 0;
class Agenda {
    constructor() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.telefono = 0;
        this.email = "";
        this.domicilio = "";
    }
}
function getContactosJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:8080/apprest/rest/agenda/agendas';
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
        for (const c of datos) {
            grillaHTML += '<tr>';
            grillaHTML += '<td>' + c.id + '</td>';
            grillaHTML += '<td>' + c.nombre + '</td>';
            grillaHTML += '<td>' + c.apellido + '</td>';
            grillaHTML += '<td>' + c.telefono + '</td>';
            grillaHTML += '<td>' + c.email + '</td>';
            grillaHTML += '<td>' + c.domicilio + '</td>';
            grillaHTML += '<td onclick="editarContacto(' + c.id + ')" style="cursor:pointer; color:green">Editar</td>';
            grillaHTML += '<td onclick="eliminarContacto(' + c.id + ')" style="cursor:pointer; color:red">Eliminar</td>';
            grillaHTML += '</tr>';
        }
        grillaHTML += '</table>';
        ;
        var div = document.getElementById("listaContactos");
        if (div) {
            div.innerHTML = grillaHTML;
        }
    });
}
function limpiarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const cId = document.getElementById("id");
        cId.value = "0";
        id = 0;
    });
}
function insertarActualizarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const nombre = document.getElementById("nombre");
        const apellido = document.getElementById("apellido");
        const telefono = document.getElementById("telefono");
        const email = document.getElementById("email");
        const domicilio = document.getElementById("domicilio");
        if (!nombre.value || !apellido.value || !telefono.value || !email.value || !domicilio.value) {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = "Ingrese todos los datos del contacto.";
            return;
        }
        let urlServer = "http://localhost:8080/apprest/rest/agenda/create";
        let metodo = "POST";
        let agenda = new Agenda();
        if (id > 0) {
            agenda.id = id;
            urlServer = "http://localhost:8080/apprest/rest/agenda/update";
            metodo = "PUT";
        }
        agenda.nombre = nombre.value.toUpperCase();
        agenda.apellido = apellido.value.toUpperCase();
        agenda.telefono = Number(telefono.value);
        agenda.email = email.value;
        agenda.domicilio = domicilio.value.toUpperCase();
        const response = yield fetch(urlServer, {
            method: metodo,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(agenda)
        });
        getContactosJSON();
    });
}
function editarContacto(numId) {
    return __awaiter(this, void 0, void 0, function* () {
        id = numId;
        let urlServer = 'http://localhost:8080/apprest/rest/agenda/' + numId;
        let response = yield fetch(urlServer, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        const cid = document.getElementById("id");
        const nombre = document.getElementById("nombre");
        const apellido = document.getElementById("apellido");
        const telefono = document.getElementById("telefono");
        const email = document.getElementById("email");
        const domicilio = document.getElementById("domicilio");
        let agenda = yield response.json();
        cid.value = agenda.id.toString();
        nombre.value = agenda.nombre;
        apellido.value = agenda.apellido;
        telefono.value = agenda.telefono.toString();
        email.value = agenda.email;
        domicilio.value = agenda.domicilio;
    });
}
function eliminarContacto(numId) {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:8080/apprest/rest/agenda/del/' + numId;
        yield fetch(urlServer, {
            method: 'DELETE',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        getContactosJSON();
    });
}
function getEncabezado(grillaHTML) {
    grillaHTML += '<table>';
    grillaHTML += '<tr>';
    grillaHTML += '<td><b>ID</b></td>';
    grillaHTML += '<td><b>NOMBRE</b></td>';
    grillaHTML += '<td><b>APELLIDO</b></td>';
    grillaHTML += '<td><b>TELÉFONO</b></td>';
    grillaHTML += '<td><b>EMAIL</b></td>';
    grillaHTML += '<td><b>DOMICILIO</b></td>';
    grillaHTML += '<td></td>';
    grillaHTML += '<td></td>';
    grillaHTML += '</tr>';
    return grillaHTML;
}
