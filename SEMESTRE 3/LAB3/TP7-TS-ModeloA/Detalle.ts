import { HojaRuta } from "./HojaRuta";

export class Detalle {
    
    constructor(kmSalida: number, kmRegreso: number, 
        horaSalida: number, horaRegreso: number, 
        minutoSalida: number, minutoRegreso: number){
            this._kmSalida = kmSalida;
            this._kmRegreso = kmRegreso;
            this._horaSalida = horaSalida;
            this._horaRegreso = horaRegreso;
            this._minutoSalida = minutoSalida;
            this._minutoRegreso = minutoRegreso;    
    }

    private _kmSalida: number;
    public get kmSalida(): number {
        return this._kmSalida;
    }
    public set kmSalida(value: number) {
        this._kmSalida = value;
    }

    private _kmRegreso: number;  
    public get kmRegreso(): number {
        return this._kmRegreso;
    }
    public set kmRegreso(value: number) {
        this._kmRegreso = value;
    }

    private _horaSalida: number;
    public get horaSalida(): number {
        return this._horaSalida;
    }
    public set horaSalida(value: number) {
        this._horaSalida = value;
    }

    private _horaRegreso: number; 
    public get horaRegreso(): number {
        return this._horaRegreso;
    }
    public set horaRegreso(value: number) {
        this._horaRegreso = value;
    }

    private _minutoSalida: number;
    public get minutoSalida(): number {
        return this._minutoSalida;
    }
    public set minutoSalida(value: number) {
        this._minutoSalida = value;
    }
    
    private _minutoRegreso: number; 
    public get minutoRegreso(): number {
        return this._minutoRegreso;
    }
    public set minutoRegreso(value: number) {
        this._minutoRegreso = value;
    }

    private _hojaRuta: HojaRuta;
    public get hojaRuta(): HojaRuta {
        return this._hojaRuta;
    }
    public set hojaRuta(value: HojaRuta) {
        this._hojaRuta = value;
    }

}