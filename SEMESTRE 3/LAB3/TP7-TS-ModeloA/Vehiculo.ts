import { HojaRuta } from "./HojaRuta";

export class Vehiculo {
    
    constructor(patente:string, marca:string,modelo:string) {
        this._patente = patente; 
        this._marca = marca;
        this._modelo = modelo;
    }

    private _patente: string;
    public get patente(): string {
        return this._patente;
    }
    public set patente(value: string) {
        this._patente = value;
    }
   
    private _marca: string;
    public get marca(): string {
        return this._marca;
    }
    public set marca(value: string) {
        this._marca = value;
    }
    
    private _modelo: string;
    public get modelo(): string {
        return this._modelo;
    }
    public set modelo(value: string) {
        this._modelo = value;
    }
    private _hojasRuta: Array<HojaRuta>;
    
    public get hojasRuta(): Array<HojaRuta> {
        return this._hojasRuta;
    }
    public set hojasRuta(value: Array<HojaRuta>) {
        this._hojasRuta = value;
    }
    public addhojaRuta(value:HojaRuta){
        if (this._hojasRuta == null) {
            this._hojasRuta = new Array<HojaRuta>();
        }
        this._hojasRuta.push(value);
    }

    public calcularTotalKilometrosRecorridos(fechaDesde: Date, fechaHasta: Date) : number {
        let total: number = 0;
        this._hojasRuta.forEach(hr => {
            if (hr.fecha>= fechaDesde && hr.fecha<= fechaHasta) {
                total += hr.calcularTotalKilometros();
            }
        });
        return total;
    }

}