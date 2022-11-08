import {Router} from 'express'
import {getEmpleados, getEmpleadosXLegajo, crearEmpleado, actualizarEmpleado, eliminarEmpleado, getEmpleadosXApellido} from './controlador'

const router = Router();

router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));

router.get('/empleados', getEmpleados);
router.get('/empleado/:legajo', getEmpleadosXLegajo);
router.get('/empleados/:apellido', getEmpleadosXApellido);
router.post('/insert', crearEmpleado);//insert
router.put('/update', actualizarEmpleado);//update
router.delete('/delete/:legajo', eliminarEmpleado);//eliminar

const path = require("path");
router.get('/', (requ, resp) => resp.sendFile(path.resolve(__dirname, "web/CRUD.html")));

export default router;