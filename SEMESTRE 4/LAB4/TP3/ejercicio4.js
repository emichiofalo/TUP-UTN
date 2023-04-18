"use strict";
var Movimiento;
(function (Movimiento) {
    Movimiento[Movimiento["PIEDRA"] = 0] = "PIEDRA";
    Movimiento[Movimiento["PAPEL"] = 1] = "PAPEL";
    Movimiento[Movimiento["TIJERA"] = 2] = "TIJERA";
})(Movimiento || (Movimiento = {}));
class Jugada {
    constructor(jugador1, jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
}
function play(jugadas) {
    let results = "";
    for (let j of jugadas) {
        if (j.jugador1 === j.jugador2) {
            results += "Empate";
        }
        else if ((j.jugador1 === Movimiento.PIEDRA && j.jugador2 === Movimiento.TIJERA) ||
            (j.jugador1 === Movimiento.PAPEL && j.jugador2 === Movimiento.PIEDRA) ||
            (j.jugador1 === Movimiento.TIJERA && j.jugador2 === Movimiento.PAPEL)) {
            results += "Gana 1";
        }
        else {
            results += "Gana 2";
        }
        results += ", ";
    }
    return results.substring(0, results.length - 2);
}
const j1 = new Jugada(Movimiento.PIEDRA, Movimiento.TIJERA);
const j2 = new Jugada(Movimiento.PIEDRA, Movimiento.PIEDRA);
const j3 = new Jugada(Movimiento.PIEDRA, Movimiento.PAPEL);
const plays = [j1, j2, j3];
console.log(play(plays));
