/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class EstadoControl {
    
    private long id; 
    private boolean aprobado; 
    private ArrayList<Control> control; 

    public EstadoControl() {
    }

    public EstadoControl(long id, boolean aprobado, ArrayList<Control> control) {
        this.id = id;
        this.aprobado = aprobado;
        this.control = control;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public ArrayList<Control> getControl() {
        return control;
    }

    public void addControl(Control control) {
        if (this.control == null) {
            this.control = new ArrayList();
        }
        this.control.add(control);
    }
    
    
    
}
