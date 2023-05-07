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
Object.defineProperty(exports, "__esModule", { value: true });
exports.Empleado = void 0;
let legajo = 0;
class Empleado {
    constructor() {
        this.legajo = 0;
        this.apellido = "";
        this.nombre = "";
        this.dni = 0;
        this.sector = "";
        this.fecha_ingreso = "";
        this.activo = false;
    }
}
exports.Empleado = Empleado;
function getEmpleadosJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/empleados';
        const txtSearch = document.getElementById("txtSearch");
        if (txtSearch.value.toUpperCase() && txtSearch.value.toUpperCase() != "") {
            urlServer = 'http://localhost:3000/empleados/' + txtSearch.value;
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
        for (const emp of datos) {
            grillaHTML += '<div class="row">';
            grillaHTML += '<div class="col">' + emp.legajo + '</div>';
            grillaHTML += '<div class="col">' + emp.apellido + '</div>';
            grillaHTML += '<div class="col">' + emp.nombre + '</div>';
            grillaHTML += '<div class="col">' + emp.dni + '</div>';
            grillaHTML += '<div class="col">' + emp.sector + '</div>';
            grillaHTML += '<div class="col">' + emp.fecha_ingreso.slice(0, 10) + '</div>';
            grillaHTML += '<div class="col">' + (emp.activo == true ? "SI" : "NO") + '</div>';
            grillaHTML += '<div class="col" onclick="editarEmpleado(' + emp.legajo + ')" style="cursor:pointer; color:green">Editar</div>';
            grillaHTML += '<div class="col" onclick="eliminarEmpleado(' + emp.legajo + ')" style="cursor:pointer; color:red">Eliminar</div>';
            grillaHTML += '</div>';
        }
        ;
        var divArt = document.getElementById("listaEmpleados");
        if (divArt) {
            divArt.innerHTML = grillaHTML;
        }
    });
}
function limpiarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const empLgj = document.getElementById("empLgj");
        empLgj.value = "0";
        legajo = 0;
    });
}
function insertarActualizarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const empApellido = document.getElementById("empApellido");
        const empNombre = document.getElementById("empNombre");
        const empDNI = document.getElementById("empDNI");
        const empSector = document.getElementById("empSector");
        const empFecha = document.getElementById("empFecha");
        const empActivo = document.getElementById("empActivo");
        if (!empApellido.value || !empNombre.value || !empDNI.value || !empSector.value || !empFecha.value || !empActivo.value) {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = "Ingrese todos los datos del empleado";
            return;
        }
        let urlServer = "http://localhost:3000/insert";
        let metodo = "POST";
        let empleado = new Empleado();
        if (legajo > 0) {
            empleado.legajo = legajo;
            urlServer = "http://localhost:3000/update";
            metodo = "PUT";
        }
        empleado.apellido = empApellido.value.toUpperCase();
        empleado.nombre = empNombre.value.toUpperCase();
        empleado.dni = Number(empDNI.value);
        empleado.sector = empSector.value.toUpperCase();
        empleado.fecha_ingreso = empFecha.value.slice(0, 10);
        empleado.activo = empActivo.value == "true" ? true : false;
        const response = yield fetch(urlServer, {
            method: metodo,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(empleado),
        });
        response.json().then(data => {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = data.message;
            getEmpleadosJSON();
        });
    });
}
function editarEmpleado(lgj) {
    return __awaiter(this, void 0, void 0, function* () {
        legajo = lgj;
        let urlServer = 'http://localhost:3000/empleado/' + lgj;
        let response = yield fetch(urlServer, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        const empLegajo = document.getElementById("empLgj");
        const empApellido = document.getElementById("empApellido");
        const empNombre = document.getElementById("empNombre");
        const empDNI = document.getElementById("empDNI");
        const empSector = document.getElementById("empSector");
        const empFecha = document.getElementById("empFecha");
        const empActivo = document.getElementById("empActivo");
        let empleado = yield response.json();
        empLegajo.value = empleado.legajo.toString();
        empApellido.value = empleado.apellido;
        empNombre.value = empleado.nombre;
        empDNI.value = empleado.dni.toString();
        empSector.value = empleado.sector;
        empFecha.value = empleado.fecha_ingreso.slice(0, 10);
        empActivo.value = empleado.activo == true ? "true" : "false";
        getEmpleadosJSON();
    });
}
function eliminarEmpleado(lgj) {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/delete/' + lgj;
        yield fetch(urlServer, {
            method: 'DELETE',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        getEmpleadosJSON();
    });
}
function getEncabezado(grillaHTML) {
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col"><b>LEGAJO</b></div>';
    grillaHTML += '<div class="col"><b>APELLIDO</b></div>';
    grillaHTML += '<div class="col"><b>NOMBRE</b></div>';
    grillaHTML += '<div class="col"><b>DNI</b></div>';
    grillaHTML += '<div class="col"><b>SECTOR</b></div>';
    grillaHTML += '<div class="col"><b>FECHA DE INGRESO</b></div>';
    grillaHTML += '<div class="col"><b>ACTIVO</b></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '</div>';
    return grillaHTML;
}
function getFila(grillaHTML, emp) {
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col">' + emp.legajo + '</div>';
    grillaHTML += '<div class="col">' + emp.apellido + '</div>';
    grillaHTML += '<div class="col">' + emp.nombre + '</div>';
    grillaHTML += '<div class="col">' + emp.dni + '</div>';
    grillaHTML += '<div class="col">' + emp.sector + '</div>';
    grillaHTML += '<div class="col">' + emp.fecha_ingreso + '</div>';
    grillaHTML += '<div class="col">' + emp.activo + '</div>';
    grillaHTML += '<div class="col" onclick="editarEmpleado(' + emp.legajo + ')" style="cursor:pointer; color:green">Editar</div>';
    grillaHTML += '<div class="col" onclick="eliminarEmpleado(' + emp.legajo + ')" style="cursor:pointer; color:red">Eliminar</div>';
    grillaHTML += '</div>';
    return grillaHTML;
}
