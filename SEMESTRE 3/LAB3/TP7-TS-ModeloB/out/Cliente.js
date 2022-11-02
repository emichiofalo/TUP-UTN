"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Cliente = void 0;
class Cliente {
    constructor(numero, razonSocial, cuit) {
        this._numero = numero;
        this._razonSocial = razonSocial;
        this._cuit = cuit;
    }
    get numero() {
        return this._numero;
    }
    set numero(value) {
        this._numero = value;
    }
    get razonSocial() {
        return this._razonSocial;
    }
    set razonSocial(value) {
        this._razonSocial = value;
    }
    get cuit() {
        return this._cuit;
    }
    set cuit(value) {
        this._cuit = value;
    }
    get facturas() {
        return this._facturas;
    }
    set facturas(value) {
        this._facturas = value;
    }
    addFactura(value) {
        if (this._facturas == null) {
            this._facturas = new Array();
        }
        this._facturas.push(value);
    }
    totalFacturadoXTipoPago(tipoPago) {
        let total = 0;
        this._facturas.forEach(f => {
            if (tipoPago == null) {
                total += f.totalFinal;
            }
            else if (f.tipoPago == tipoPago) {
                total += f.totalFinal;
            }
        });
        return total;
    }
}
exports.Cliente = Cliente;
//# sourceMappingURL=Cliente.js.map