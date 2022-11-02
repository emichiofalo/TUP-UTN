import { Detalle } from "./Detalle";
import { Vehiculo } from "./Vehiculo";

export class HojaRuta {
    
    constructor(fecha: Date, numero: number){
        this._fecha = fecha;
        this._numero = numero;
    }

    private _fecha: Date;
    public get fecha(): Date {
        return this._fecha;
    }
    public set fecha(value: Date) {
        this._fecha = value;
    }

    private _numero: number; 
    public get numero(): number {
        return this._numero;
    }
    public set numero(value: number) {
        this._numero = value;
    }

    private _vehiculo: Vehiculo;
    public get vehiculo(): Vehiculo {
        return this._vehiculo;
    }
    public set vehiculo(value: Vehiculo) {
        this._vehiculo = value;
    }

    private _detalle: Array<Detalle>;
    public get detalle(): Array<Detalle> {
        return this._detalle;
    }
    public set detalle(value: Array<Detalle>) {
        this._detalle = value;
    }
    public addDetalle(value: Detalle) : void{
        if (this._detalle == null) {
            this.detalle = new Array<Detalle>();
        }
        this._detalle.push(value);
    }

    public calcularTotalKilometros() : number{
        let total: number = 0;
        this._detalle.forEach(d => {
            total += d.kmRegreso - d.kmSalida;
        });
        return total;
    }
}