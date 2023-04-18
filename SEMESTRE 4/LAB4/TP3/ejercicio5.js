"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const reptil = {
    nombre: "cobra",
    tipo: "serpiente",
    paisOrigen: "India",
    pesoPromedio: 2.5,
    esVenenosa: true
};
if (reptil.nombre && reptil.tipo &&
    reptil.paisOrigen && reptil.pesoPromedio &&
    reptil.esVenenosa) {
    console.log("El objeto es un reptil válido");
}
else {
    console.log("El objeto no cumple con la estructura de un reptil");
}
