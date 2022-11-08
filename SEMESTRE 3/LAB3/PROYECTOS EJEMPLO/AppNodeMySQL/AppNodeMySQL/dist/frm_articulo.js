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
let idArticulo = 0;
class Articulo {
    constructor() {
        this.id = 0;
        this.fechaAlta = "";
        this.codigo = "";
        this.denominacion = "";
        this.precio = 0;
        this.publicado = "";
    }
}
function getArticulosJSON() {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/articulos';
        const txtSearch = document.getElementById("txtSearch");
        if (txtSearch.value && txtSearch.value != "") {
            urlServer = 'http://localhost:3000/searcharticulo/' + txtSearch.value;
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
        for (const art of datos) {
            grillaHTML += '<div class="row">';
            grillaHTML += '<div class="col">' + art.id + '</div>';
            grillaHTML += '<div class="col">' + art.fechaAlta + '</div>';
            grillaHTML += '<div class="col">' + art.codigo + '</div>';
            grillaHTML += '<div class="col">' + art.denominacion + '</div>';
            grillaHTML += '<div class="col">' + art.precio + '</div>';
            grillaHTML += '<div class="col">' + art.publicado + '</div>';
            grillaHTML += '<div class="col" onclick="editarArticulo(' + art.id + ')" style="cursor:pointer; color:green">Editar</div>';
            grillaHTML += '<div class="col" onclick="eliminarArticulo(' + art.id + ')" style="cursor:pointer; color:red">Eliminar</div>';
            grillaHTML += '</div>';
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
        var divArt = document.getElementById("listaArticulos");
        if (divArt) {
            divArt.innerHTML = grillaHTML;
        }
    });
}
function limpiarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const artID = document.getElementById("artID");
        artID.value = "0";
        idArticulo = 0;
    });
}
function insertarActualizarDatos() {
    return __awaiter(this, void 0, void 0, function* () {
        const artCodigo = document.getElementById("artCodigo");
        const artDenominacion = document.getElementById("artDenominacion");
        const artPrecio = document.getElementById("artPrecio");
        const artPublicado = document.getElementById("artPublicado");
        const fechaAlta = new Date().getFullYear() + "-" + new Date().getMonth() + "-" + new Date().getDay();
        if (!artCodigo.value || !artDenominacion.value || !artPrecio.value || !artPublicado.value) {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = "Ingrese los datos del articulo";
            return;
        }
        let urlServer = "http://localhost:3000/insert";
        let metodo = "POST";
        let articulo = new Articulo();
        if (idArticulo > 0) {
            articulo.id = idArticulo;
            urlServer = "http://localhost:3000/update";
            metodo = "PUT";
        }
        else {
            articulo.fechaAlta = fechaAlta;
        }
        articulo.codigo = artCodigo.value;
        articulo.denominacion = artDenominacion.value;
        articulo.precio = parseFloat(artPrecio.value);
        articulo.publicado = artPublicado.value;
        const response = yield fetch(urlServer, {
            method: metodo,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(articulo),
        });
        response.json().then(data => {
            let txtMensaje = document.getElementById("txtMensaje");
            if (txtMensaje)
                txtMensaje.innerHTML = data.message;
            getArticulosJSON();
        });
    });
}
function editarArticulo(id) {
    return __awaiter(this, void 0, void 0, function* () {
        idArticulo = id;
        let urlServer = 'http://localhost:3000/articulo/' + id;
        let response = yield fetch(urlServer, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        const artID = document.getElementById("artID");
        const artCodigo = document.getElementById("artCodigo");
        const artDenominacion = document.getElementById("artDenominacion");
        const artPrecio = document.getElementById("artPrecio");
        const artPublicado = document.getElementById("artPublicado");
        const artFecha = document.getElementById("artFecha");
        let articulo = yield response.json();
        artID.value = articulo.id.toString();
        artCodigo.value = articulo.codigo;
        artDenominacion.value = articulo.denominacion;
        artPrecio.value = articulo.precio.toString();
        artPublicado.value = articulo.publicado;
        artFecha.value = articulo.fechaAlta;
    });
}
function eliminarArticulo(id) {
    return __awaiter(this, void 0, void 0, function* () {
        let urlServer = 'http://localhost:3000/delete/' + id;
        yield fetch(urlServer, {
            method: 'DELETE',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        getArticulosJSON();
    });
}
function getEncabezado(grillaHTML) {
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col"><b>ID</b></div>';
    grillaHTML += '<div class="col"><b>FECHA ALTA</b></div>';
    grillaHTML += '<div class="col"><b>CODIGO</b></div>';
    grillaHTML += '<div class="col"><b>DENOMINACION</b></div>';
    grillaHTML += '<div class="col"><b>PRECIO</b></div>';
    grillaHTML += '<div class="col"><b>PUBLICADO</b></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '</div>';
    return grillaHTML;
}
function getFila(grillaHTML, art) {
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col">' + art.id + '</div>';
    grillaHTML += '<div class="col">' + art.fechaAlta + '</div>';
    grillaHTML += '<div class="col">' + art.codigo + '</div>';
    grillaHTML += '<div class="col">' + art.denominacion + '</div>';
    grillaHTML += '<div class="col">' + art.precio + '</div>';
    grillaHTML += '<div class="col">' + art.publicado + '</div>';
    grillaHTML += '<div class="col" onclick="editarArticulo(' + art.id + ')" style="cursor:pointer; color:green">Editar</div>';
    grillaHTML += '<div class="col" onclick="eliminarArticulo(' + art.id + ')" style="cursor:pointer; color:red">Eliminar</div>';
    grillaHTML += '</div>';
    return grillaHTML;
}
