"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DetalleFactura = void 0;
class DetalleFactura {
    constructor(cantidad, articulo) {
        this._cantidad = cantidad;
        this._articulo = articulo;
    }
    get cantidad() {
        return this._cantidad;
    }
    set cantidad(value) {
        this._cantidad = value;
    }
    get subtotal() {
        return this._subtotal;
    }
    set subtotal(value) {
        this._subtotal = value;
    }
    get factura() {
        return this._factura;
    }
    set factura(value) {
        this._factura = value;
    }
    get articulo() {
        return this._articulo;
    }
    set articulo(value) {
        this._articulo = value;
    }
    calcularSubTotal() {
        this._subtotal = this._cantidad * this._articulo.precio;
    }
}
exports.DetalleFactura = DetalleFactura;
//# sourceMappingURL=DetalleFactura.js.map