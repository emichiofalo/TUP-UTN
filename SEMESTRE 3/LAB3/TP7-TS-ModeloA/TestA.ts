import { Detalle } from "./Detalle";
import { Vehiculo } from "./Vehiculo";
import { HojaRuta } from "./HojaRuta";

var v1 = new Vehiculo("PDS769", "Renault", "Sandero");
var dt1 =  new Date(122, 10, 1, 1, 1, 1, 1);
var dt2 = new Date(122, 10, 31, 1, 1, 1, 1);

var hr1 = new HojaRuta(new Date(122, 10, 29, 18, 26, 40, 30), 1);
var d1 = new Detalle(140000, 144000, 9, 10, 30, 30);
var d2 = new Detalle(144000, 148000, 12, 16, 30, 30);
var d3 = new Detalle(148000, 152000, 18, 20, 30, 30);
hr1.addDetalle(d1);
hr1.addDetalle(d2);
hr1.addDetalle(d3);
v1.addhojaRuta(hr1);

var hr2 = new HojaRuta(new Date(122, 10, 10, 18, 26, 40, 30), 2);
var d4 = new Detalle(140000, 144000, 9, 10, 30, 30);
var d5 = new Detalle(144000, 148000, 12, 16, 30, 30);
var d6 = new Detalle(148000, 152000, 18, 20, 30, 30);
hr2.addDetalle(d4);
hr2.addDetalle(d5);
hr2.addDetalle(d6);
v1.addhojaRuta(hr2);

var hr3 = new HojaRuta(new Date(122, 10, 5, 18, 26, 40, 30), 3);
var d7 = new Detalle(140000, 144000, 9, 10, 30, 30);
var d8 = new Detalle(144000, 148000, 12, 16, 30, 30);
var d9 = new Detalle(148000, 152000, 18, 20, 30, 30);
hr3.addDetalle(d7);
hr3.addDetalle(d8);
hr3.addDetalle(d9);
v1.addhojaRuta(hr3);

var kmRecorridos: number = v1.calcularTotalKilometrosRecorridos(dt1, dt2);
console.log("Cantidad de kilómetros recorridos: ", kmRecorridos);

