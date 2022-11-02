import { Factura } from "./Factura";
import { Articulo } from "./Articulo";

export class DetalleFactura {
    constructor(cantidad: number, articulo: Articulo) {
        this._cantidad = cantidad;
        this._articulo = articulo;
    }

    private _cantidad: number; 
    public get cantidad(): number {
        return this._cantidad;
    }
    public set cantidad(value: number) {
        this._cantidad = value;
    }

    private _subtotal: number;
    public get subtotal(): number {
        return this._subtotal;
    }
    public set subtotal(value: number) {
        this._subtotal = value;
    }

    private _factura: Factura;
    public get factura(): Factura {
        return this._factura;
    }
    public set factura(value: Factura) {
        this._factura = value;
    }

    private _articulo: Articulo; 
    public get articulo(): Articulo {
        return this._articulo;
    }
    public set articulo(value: Articulo) {
        this._articulo = value;
    }

    public calcularSubTotal(){
        this._subtotal = this._cantidad * this._articulo.precio;
    }

}