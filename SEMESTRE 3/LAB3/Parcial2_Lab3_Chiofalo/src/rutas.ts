import {Router} from 'express'
import {getClientes, getClientesXid, getClientesXApellido, crearCliente, actualizarCliente, eliminarCliente} from './controlador'

const router = Router();

router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));

router.get('/clientes', getClientes);
router.get('/cliente/:id', getClientesXid);
router.get('/clientes/:apellido', getClientesXApellido);
router.post('/insert', crearCliente);//insert
router.put('/update', actualizarCliente);//update
router.delete('/delete/:id', eliminarCliente);//eliminar

const path = require("path");
router.get('/', (requ, resp) => resp.sendFile(path.resolve(__dirname, "web/CRUD.html")));

export default router;