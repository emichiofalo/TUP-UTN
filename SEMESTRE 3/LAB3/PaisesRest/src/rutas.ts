import {Router} from 'express'
import {getPaises, getPaisesXPoblacion} from './controlador/controlador'

const router = Router();

router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));
router.get('/paises', getPaises);
router.get('/paises/:busqueda', getPaisesXPoblacion);

export default router;