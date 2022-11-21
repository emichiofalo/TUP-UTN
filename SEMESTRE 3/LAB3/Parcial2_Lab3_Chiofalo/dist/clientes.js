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
class Cliente {
    constructor() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.saldo = 0;
        this.domicilio = "";
        this.telefono = 0;
        this.cuit = 0;
    }
}
function getClientesJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/clientes';
        const txtSearch = document.getElementById("txtSearch");
        if (txtSearch.value.toUpperCase() && txtSearch.value.toUpperCase() != "") {
            urlServer = 'http://localhost:3000/clientes/' + txtSearch.value;
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
        for (const c of datos) {
            grillaHTML += '<div class="row">';
            grillaHTML += '<div class="col">' + c.id + '</div>';
            grillaHTML += '<div class="col">' + c.apellido + '</div>';
            grillaHTML += '<div class="col">' + c.nombre + '</div>';
            grillaHTML += '<div class="col">' + c.saldo + '</div>';
            grillaHTML += '<div class="col">' + c.domicilio + '</div>';
            grillaHTML += '<div class="col">' + c.telefono + '</div>';
            grillaHTML += '<div class="col">' + c.cuit + '</div>';
            grillaHTML += '<div class="col" onclick="editarCliente(' + c.id + ')" style="cursor:pointer; color:green">Editar</div>';
            grillaHTML += '<div class="col" onclick="eliminarCliente(' + c.id + ')" style="cursor:pointer; color:red">Eliminar</div>';
            grillaHTML += '</div>';
        }
        ;
        var divArt = document.getElementById("listaClientes");
        if (divArt) {
            divArt.innerHTML = grillaHTML;
        }
    });
}
function limpiarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const cId = document.getElementById("cId");
        cId.value = "0";
        id = 0;
    });
}
function insertarActualizarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const cNombre = document.getElementById("cNombre");
        const cApellido = document.getElementById("cApellido");
        const cSaldo = document.getElementById("cSaldo");
        const cDomicilio = document.getElementById("cDomicilio");
        const cTelefono = document.getElementById("cTelefono");
        const cCuit = document.getElementById("cCuit");
        if (!cNombre.value || !cApellido.value || !cSaldo.value || !cDomicilio.value || !cTelefono.value || !cCuit.value) {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = "Ingrese todos los datos del cliente.";
            return;
        }
        let urlServer = "http://localhost:3000/insert";
        let metodo = "POST";
        let cliente = new Cliente();
        if (id > 0) {
            cliente.id = id;
            urlServer = "http://localhost:3000/update";
            metodo = "PUT";
        }
        cliente.nombre = cNombre.value.toUpperCase();
        cliente.apellido = cApellido.value.toUpperCase();
        cliente.saldo = Number(cSaldo.value);
        cliente.domicilio = cDomicilio.value.toUpperCase();
        cliente.telefono = Number(cTelefono.value);
        cliente.cuit = Number(cCuit.value);
        const response = yield fetch(urlServer, {
            method: metodo,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(cliente),
        });
        response.json().then(data => {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = data.message;
            getClientesJSON();
        });
    });
}
function editarCliente(numId) {
    return __awaiter(this, void 0, void 0, function* () {
        id = numId;
        let urlServer = 'http://localhost:3000/cliente/' + id;
        let response = yield fetch(urlServer, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        const cId = document.getElementById("cId");
        const cNombre = document.getElementById("cNombre");
        const cApellido = document.getElementById("cApellido");
        const cSaldo = document.getElementById("cSaldo");
        const cDomicilio = document.getElementById("cDomicilio");
        const cTelefono = document.getElementById("cTelefono");
        const cCuit = document.getElementById("cCuit");
        let cliente = yield response.json();
        cId.value = cliente.id.toString();
        cNombre.value = cliente.nombre;
        cApellido.value = cliente.apellido;
        cSaldo.value = cliente.saldo.toString();
        cDomicilio.value = cliente.domicilio;
        cTelefono.value = cliente.telefono.toString();
        cCuit.value = cliente.cuit.toString();
        getClientesJSON();
    });
}
function eliminarCliente(numId) {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/delete/' + numId;
        yield fetch(urlServer, {
            method: 'DELETE',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        getClientesJSON();
    });
}
function getEncabezado(grillaHTML) {
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col"><b>ID</b></div>';
    grillaHTML += '<div class="col"><b>NOMBRE</b></div>';
    grillaHTML += '<div class="col"><b>APELLIDO</b></div>';
    grillaHTML += '<div class="col"><b>SALDO</b></div>';
    grillaHTML += '<div class="col"><b>DOMICILIO</b></div>';
    grillaHTML += '<div class="col"><b>TELÉFONO</b></div>';
    grillaHTML += '<div class="col"><b>CUIT</b></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '</div>';
    return grillaHTML;
}
