import express from "express";
const app = express();
const cors = require('cors');

import rutas from './rutas';

app.use(express.json());
app.use(cors({
    origin: '*'
}));
app.use(express.urlencoded({extended:false}));

app.use(rutas);

app.listen(3000, () => {
    console.log("Servidor en puerto 3000", 3000);
})