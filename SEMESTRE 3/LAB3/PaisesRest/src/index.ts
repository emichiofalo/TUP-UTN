import express from "express";
const app = express();
const cors = require('cors');

import rutas from './rutas';

app.use(cors({origin: '*'}));
//para transformar los datos a objetos json
app.use(express.json());
//transformar los datos de un formulario html a objetos json 
app.use(express.urlencoded({extended:false}));

app.use(rutas);

app.listen(3000, () => {
    console.log("Servidor en puerto 3000", 3000);
})