"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const controlador_1 = require("./controlador");
const router = (0, express_1.Router)();
router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));
router.get('/clientes', controlador_1.getClientes);
router.get('/cliente/:id', controlador_1.getClientesXid);
router.get('/clientes/:apellido', controlador_1.getClientesXApellido);
router.post('/insert', controlador_1.crearCliente); //insert
router.put('/update', controlador_1.actualizarCliente); //update
router.delete('/delete/:id', controlador_1.eliminarCliente); //eliminar
const path = require("path");
router.get('/', (requ, resp) => resp.sendFile(path.resolve(__dirname, "web/CRUD.html")));
exports.default = router;
