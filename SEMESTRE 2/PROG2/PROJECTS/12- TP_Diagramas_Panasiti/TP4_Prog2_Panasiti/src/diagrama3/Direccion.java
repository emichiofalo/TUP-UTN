/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama3;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Direccion {
    //Atributos de clase
    public static final String[] NOMBRE_DIRECCION = {"Norte","Sur","Este","Oeste","Noreste","Noroeste","Sureste","Suroeste"};
    public static final int NORTE = 0;
    public static final int SUR = 1;
    public static final int ESTE = 2;
    public static final int OESTE = 3;
    public static final int NORESTE = 4;
    public static final int NOROESTE = 5;
    public static final int SURESTE = 6;
    public static final int SUROESTE = 7;
    public static final Direccion[] DIRECCIONES = {new Direccion(0),new Direccion(1),new Direccion(2),new Direccion(3),new Direccion(4),new Direccion(5),new Direccion(6),new Direccion(7)};
    //Atributos de objeto
    private int tipo;
    
    public Direccion(int tipo){
        this.tipo = tipo;
    }
    
    public String getNombre(){
        return NOMBRE_DIRECCION[this.tipo];
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public boolean esDiagonal(){
        if(this.tipo < 4){
            return false;
        } else {
            return true;
        }
    }
}
