"use strict";
class Vehiculo {
    constructor(marca, modelo, patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
}
let vehiculos = [];
function guardarVehiculo() {
    let marca = document.getElementById('marca');
    let modelo = document.getElementById('modelo');
    let patente = document.getElementById('patente');
    let vehiculo = new Vehiculo(marca.value, modelo.value, patente.value);
    vehiculos.push(vehiculo);
    let listadoVehiculos = document.getElementById('listadoVehiculos');
    if (listadoVehiculos) {
        listadoVehiculos.innerHTML = '';
        for (let vehiculo of vehiculos) {
            let li = document.createElement('li');
            li.textContent = `Marca: ${vehiculo.marca}, Modelo: ${vehiculo.modelo}, Patente: ${vehiculo.patente}`;
            listadoVehiculos.appendChild(li);
        }
    }
}
