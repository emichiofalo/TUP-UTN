"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const controlador_1 = require("./controlador");
const router = (0, express_1.Router)();
router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));
router.get('/empleados', controlador_1.getEmpleados);
router.get('/empleado/:legajo', controlador_1.getEmpleadosXLegajo);
router.get('/empleados/:apellido', controlador_1.getEmpleadosXApellido);
router.post('/insert', controlador_1.crearEmpleado); //insert
router.put('/update', controlador_1.actualizarEmpleado); //update
router.delete('/delete/:legajo', controlador_1.eliminarEmpleado); //eliminar
const path = require("path");
router.get('/', (requ, resp) => resp.sendFile(path.resolve(__dirname, "web/CRUD.html")));
exports.default = router;
