import {Router} from 'express'
import {getArticulos, getArticulosXID, crearArticulo, actualizarArticulo, eliminarArticulo, getArticulosXDenominacion} from './controlador/controlador'

const router = Router();

router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));

router.get('/articulos', getArticulos);
router.get('/articulo/:id', getArticulosXID);
router.get('/searcharticulo/:denominacion', getArticulosXDenominacion);
router.post('/insert', crearArticulo);//insert
router.put('/update', actualizarArticulo);//update
router.delete('/delete/:id', eliminarArticulo);//eliminar

export default router;