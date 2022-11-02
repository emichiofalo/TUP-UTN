"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vehiculo = void 0;
var Vehiculo = /** @class */ (function () {
    function Vehiculo(patente, marca, modelo) {
        this._patente = patente;
        this._marca = marca;
        this._modelo = modelo;
    }
    Object.defineProperty(Vehiculo.prototype, "patente", {
        get: function () {
            return this._patente;
        },
        set: function (value) {
            this._patente = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Vehiculo.prototype, "marca", {
        get: function () {
            return this._marca;
        },
        set: function (value) {
            this._marca = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Vehiculo.prototype, "modelo", {
        get: function () {
            return this._modelo;
        },
        set: function (value) {
            this._modelo = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Vehiculo.prototype, "hojasRuta", {
        get: function () {
            return this._hojasRuta;
        },
        set: function (value) {
            this._hojasRuta = value;
        },
        enumerable: false,
        configurable: true
    });
    Vehiculo.prototype.addhojaRuta = function (value) {
        if (this._hojasRuta == null) {
            this._hojasRuta = new Array();
        }
        this._hojasRuta.push(value);
    };
    Vehiculo.prototype.calcularTotalKilometrosRecorridos = function (fechaDesde, fechaHasta) {
        var total = 0;
        this._hojasRuta.forEach(function (hr) {
            if (hr.fecha >= fechaDesde && hr.fecha <= fechaHasta) {
                total += hr.calcularTotalKilometros();
            }
        });
        return total;
    };
    return Vehiculo;
}());
exports.Vehiculo = Vehiculo;
