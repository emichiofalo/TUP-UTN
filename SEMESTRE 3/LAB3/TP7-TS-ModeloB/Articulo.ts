import { DetalleFactura } from "./DetalleFactura";

export class Articulo {
    constructor(codigo: number, denominacion: string, 
        precio: number, unidadMedida: string) {
        this._codigo = codigo;
        this._denominacion = denominacion;
        this._precio = precio;
        this._unidadMedida = unidadMedida;
    }

    private _codigo: number; 
    public get codigo(): number {
        return this._codigo;
    }
    public set codigo(value: number) {
        this._codigo = value;
    }

    private _denominacion: string; 
    public get denominacion(): string {
        return this._denominacion;
    }
    public set denominacion(value: string) {
        this._denominacion = value;
    }

    private _precio: number; 
    public get precio(): number {
        return this._precio;
    }
    public set precio(value: number) {
        this._precio = value;
    }

    private _unidadMedida: string; 
    public get unidadMedida(): string {
        return this._unidadMedida;
    }
    public set unidadMedida(value: string) {
        this._unidadMedida = value;
    }

    private _detalles: Array<DetalleFactura>;
    public get detalles(): Array<DetalleFactura> {
        return this._detalles;
    }
    public set detalles(value: Array<DetalleFactura>) {
        this._detalles = value;
    }
    public addDetalle(value: DetalleFactura){
        if (this._detalles == null) {
            this._detalles = new Array<DetalleFactura>();
        }
        this._detalles.push(value);
    }

}