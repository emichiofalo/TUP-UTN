import {Router} from 'express'
import {getRubros, getProductosXRubro} from './controlador'

const router = Router();

router.get('/test', (requ, resp) => resp.send('HOLA MUNDO'));

router.get('/rubros', getRubros);
router.get('/productos/:idrubro', getProductosXRubro);

const path = require("path");
router.get('/', (requ, resp) => resp.sendFile(path.resolve(__dirname, "web/RubroProducto.html")));

export default router;