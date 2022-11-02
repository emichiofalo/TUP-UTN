"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.HojaRuta = void 0;
var HojaRuta = /** @class */ (function () {
    function HojaRuta(fecha, numero) {
        this._fecha = fecha;
        this._numero = numero;
    }
    Object.defineProperty(HojaRuta.prototype, "fecha", {
        get: function () {
            return this._fecha;
        },
        set: function (value) {
            this._fecha = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(HojaRuta.prototype, "numero", {
        get: function () {
            return this._numero;
        },
        set: function (value) {
            this._numero = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(HojaRuta.prototype, "vehiculo", {
        get: function () {
            return this._vehiculo;
        },
        set: function (value) {
            this._vehiculo = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(HojaRuta.prototype, "detalle", {
        get: function () {
            return this._detalle;
        },
        set: function (value) {
            this._detalle = value;
        },
        enumerable: false,
        configurable: true
    });
    HojaRuta.prototype.addDetalle = function (value) {
        if (this._detalle == null) {
            this.detalle = new Array();
        }
        this._detalle.push(value);
    };
    HojaRuta.prototype.calcularTotalKilometros = function () {
        var total = 0;
        this._detalle.forEach(function (d) {
            total += d.kmRegreso - d.kmSalida;
        });
        return total;
    };
    return HojaRuta;
}());
exports.HojaRuta = HojaRuta;
