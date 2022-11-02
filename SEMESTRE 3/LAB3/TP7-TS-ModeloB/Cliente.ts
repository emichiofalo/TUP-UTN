import { Factura } from "./Factura";

export class Cliente {
    constructor(numero: number, razonSocial: string,
        cuit: number) {
        this._numero = numero;
        this._razonSocial = razonSocial;
        this._cuit = cuit;
    }

    private _numero: number;
    public get numero(): number {
        return this._numero;
    }
    public set numero(value: number) {
        this._numero = value;
    }

    private _razonSocial: string; 
    public get razonSocial(): string {
        return this._razonSocial;
    }
    public set razonSocial(value: string) {
        this._razonSocial = value;
    }

    private _cuit: number; 
    public get cuit(): number {
        return this._cuit;
    }
    public set cuit(value: number) {
        this._cuit = value;
    }

    private _facturas: Array<Factura>;
    public get facturas(): Array<Factura> {
        return this._facturas;
    }
    public set facturas(value: Array<Factura>) {
        this._facturas = value;
    }
    public addFactura(value: Factura) {
        if (this._facturas == null) {
            this._facturas = new Array<Factura>();
        }
        this._facturas.push(value);
    }

    public totalFacturadoXTipoPago(tipoPago: string) : number{
        let total : number = 0;
        this._facturas.forEach(f => {
            if (tipoPago == null) {
                total += f.totalFinal;
            } else if (f.tipoPago == tipoPago){
                total += f.totalFinal;
            }
        });
        return total;
    }

}