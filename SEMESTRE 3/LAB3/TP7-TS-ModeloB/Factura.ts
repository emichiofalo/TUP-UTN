import { Cliente } from "./Cliente";
import { DetalleFactura } from "./DetalleFactura";

export class Factura {
    constructor(letra: string, numero: number,
        recargo: number, tipoPago: string,
        fecha: Date) {
        this._letra = letra;
        this._numero = numero;
        this._recargo = recargo;
        this._tipoPago = tipoPago;
        this._fecha = fecha;

    }

    private _letra: string;
    public get letra(): string {
        return this._letra;
    }
    public set letra(value: string) {
        this._letra = value;
    }

    private _numero: number;
    public get numero(): number {
        return this._numero;
    }
    public set numero(value: number) {
        this._numero = value;
    }

    private _recargo: number;
    public get recargo(): number {
        return this._recargo;
    }
    public set recargo(value: number) {
        this._recargo = value;
    }

    private _tipoPago: string;
    public get tipoPago(): string {
        return this._tipoPago;
    }
    public set tipoPago(value: string) {
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

    private _totalItems: number;
    public get totalItems(): number {
        return this._totalItems;
    }
    public set totalItems(value: number) {
        this._totalItems = value;
    }

    private _totalFinal: number;
    public get totalFinal(): number {
        return this._totalFinal;
    }
    public set totalFinal(value: number) {
        this._totalFinal = value;
    }

    private _fecha: Date;
    public get fecha(): Date {
        return this._fecha;
    }
    public set fecha(value: Date) {
        this._fecha = value;
    }

    private _cliente: Cliente;
    public get cliente(): Cliente {
        return this._cliente;
    }
    public set cliente(value: Cliente) {
        this._cliente = value;
    }

    private _detalles: Array<DetalleFactura>;
    public get detalles(): Array<DetalleFactura> {
        return this._detalles;
    }
    public set detalles(value: Array<DetalleFactura>) {
        this._detalles = value;
    }
    public addDetalle(value: DetalleFactura) {
        if (this._detalles == null) {
            this._detalles = new Array<DetalleFactura>();
        }
        this._detalles.push(value);
    }

    public calcularTotalItems(){
        let total: number = 0;
        this._detalles.forEach(d => {
            d.calcularSubTotal();
            total += d.subtotal;
        });
        this._totalItems = total;
    }

    public calcularTotalFinal(){
        this._totalFinal = this._totalItems + this._recargo;
    }
}