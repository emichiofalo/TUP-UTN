"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Factura = void 0;
class Factura {
    constructor(letra, numero, recargo, tipoPago, fecha) {
        this._letra = letra;
        this._numero = numero;
        this._recargo = recargo;
        this._tipoPago = tipoPago;
        this._fecha = fecha;
    }
    get letra() {
        return this._letra;
    }
    set letra(value) {
        this._letra = value;
    }
    get numero() {
        return this._numero;
    }
    set numero(value) {
        this._numero = value;
    }
    get recargo() {
        return this._recargo;
    }
    set recargo(value) {
        this._recargo = value;
    }
    get tipoPago() {
        return this._tipoPago;
    }
    set tipoPago(value) {
        switch (value) {
            case 'E':
                this._tipoPago = value;
                break;
            case 'TD':
                this._tipoPago = value;
                break;
            case 'TC':
                this._tipoPago = value;
                break;
            case 'CC':
                this._tipoPago = value;
                break;
            case 'TR':
                this._tipoPago = value;
                break;
            default:
                throw new Error("El tipo de pago es inválido");
        }
    }
    get totalItems() {
        return this._totalItems;
    }
    set totalItems(value) {
        this._totalItems = value;
    }
    get totalFinal() {
        return this._totalFinal;
    }
    set totalFinal(value) {
        this._totalFinal = value;
    }
    get fecha() {
        return this._fecha;
    }
    set fecha(value) {
        this._fecha = value;
    }
    get cliente() {
        return this._cliente;
    }
    set cliente(value) {
        this._cliente = value;
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
    calcularTotalItems() {
        let total = 0;
        this._detalles.forEach(d => {
            d.calcularSubTotal();
            total += d.subtotal;
        });
        this._totalItems = total;
    }
    calcularTotalFinal() {
        this._totalFinal = this._totalItems + this._recargo;
    }
}
exports.Factura = Factura;
//# sourceMappingURL=Factura.js.map