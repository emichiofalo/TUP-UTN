"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const controlador_1 = require("./controlador/controlador");
const router = (0, express_1.Router)();
router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));
router.get('/paises', controlador_1.getPaises);
router.get('/paises/:busqueda', controlador_1.getPaisesXPoblacion);
exports.default = router;
