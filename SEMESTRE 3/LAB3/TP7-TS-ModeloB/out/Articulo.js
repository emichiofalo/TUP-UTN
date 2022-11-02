"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Articulo = void 0;
class Articulo {
    constructor(codigo, denominacion, precio, unidadMedida) {
        this._codigo = codigo;
        this._denominacion = denominacion;
        this._precio = precio;
        this._unidadMedida = unidadMedida;
    }
    get codigo() {
        return this._codigo;
    }
    set codigo(value) {
        this._codigo = value;
    }
    get denominacion() {
        return this._denominacion;
    }
    set denominacion(value) {
        this._denominacion = value;
    }
    get precio() {
        return this._precio;
    }
    set precio(value) {
        this._precio = value;
    }
    get unidadMedida() {
        return this._unidadMedida;
    }
    set unidadMedida(value) {
        this._unidadMedida = value;
    }
    get detalles() {
        return this._detalles;
    }
    set detalles(value) {
        this._detalles = value;
    }
    addDetalle(value) {
        if (this._detalles == null) {
            this._detalles = new Array();
        }
        this._detalles.push(value);
    }
}
exports.Articulo = Articulo;
//# sourceMappingURL=Articulo.js.map