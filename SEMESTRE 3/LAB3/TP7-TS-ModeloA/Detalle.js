"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Detalle = void 0;
var Detalle = /** @class */ (function () {
    function Detalle(kmSalida, kmRegreso, horaSalida, horaRegreso, minutoSalida, minutoRegreso) {
        this._kmSalida = kmSalida;
        this._kmRegreso = kmRegreso;
        this._horaSalida = horaSalida;
        this._horaRegreso = horaRegreso;
        this._minutoSalida = minutoSalida;
        this._minutoRegreso = minutoRegreso;
    }
    Object.defineProperty(Detalle.prototype, "kmSalida", {
        get: function () {
            return this._kmSalida;
        },
        set: function (value) {
            this._kmSalida = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Detalle.prototype, "kmRegreso", {
        get: function () {
            return this._kmRegreso;
        },
        set: function (value) {
            this._kmRegreso = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Detalle.prototype, "horaSalida", {
        get: function () {
            return this._horaSalida;
        },
        set: function (value) {
            this._horaSalida = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Detalle.prototype, "horaRegreso", {
        get: function () {
            return this._horaRegreso;
        },
        set: function (value) {
            this._horaRegreso = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Detalle.prototype, "minutoSalida", {
        get: function () {
            return this._minutoSalida;
        },
        set: function (value) {
            this._minutoSalida = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Detalle.prototype, "minutoRegreso", {
        get: function () {
            return this._minutoRegreso;
        },
        set: function (value) {
            this._minutoRegreso = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Detalle.prototype, "hojaRuta", {
        get: function () {
            return this._hojaRuta;
        },
        set: function (value) {
            this._hojaRuta = value;
        },
        enumerable: false,
        configurable: true
    });
    return Detalle;
}());
exports.Detalle = Detalle;
