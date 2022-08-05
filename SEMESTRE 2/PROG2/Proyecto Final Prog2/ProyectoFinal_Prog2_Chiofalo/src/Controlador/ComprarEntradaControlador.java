/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emi Chiófalo
 */
public class ComprarEntradaControlador implements ActionListener {

    private EntradaModelo entrada = new EntradaModelo();
    private PeliculaVistaAdmin peliculaAdmin = new PeliculaVistaAdmin();
    private PeliculaControlador contPeli;
    private ComprarEntradaVista vistaCompra;
    private DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public ComprarEntradaControlador(ComprarEntradaVista vistaCompra) {
        this.vistaCompra = vistaCompra;
        vistaCompra.getjTFprecio().setText(String.valueOf(EntradaModelo.getPrecio()));
        listarFunciones(vistaCompra.getjTableFunciones());
        vistaCompra.getjTFprecio().setText("$" + String.valueOf(entrada.getPrecio()));
        this.vistaCompra.getjBentrada().addActionListener(this);
        this.vistaCompra.getjBconfiguracion().addActionListener(this);
        this.vistaCompra.getjBlimpiar().addActionListener(this);
        this.vistaCompra.getjBseleccionar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaCompra.getjBentrada()) {
            agregar();
        } else if (e.getSource() == vistaCompra.getjBlimpiar()) {
            resetVista();
        } else if (e.getSource() == vistaCompra.getjBseleccionar()) {
            cargarFields();
        } else if (e.getSource() == vistaCompra.getjBconfiguracion()) {
            this.contPeli = new PeliculaControlador(peliculaAdmin);
            peliculaAdmin.setVisible(true);
            vistaCompra.dispose();
        }
    }

    public void listarFunciones(JTable table) {
        FuncionModelo funcion = new FuncionModelo();
        modelo = (DefaultTableModel) table.getModel();
        table.setRowHeight(20);
        List<FuncionModelo> lista = funcion.readFunciones();
        Object[] fila = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getNroFuncion();
            fila[1] = lista.get(i).getFecha().toString();
            fila[2] = lista.get(i).getHorario().toString();
            fila[3] = lista.get(i).getParking().getNumero();
            fila[4] = lista.get(i).getPelicula().getTitulo();
            fila[5] = cantidadEntradasDisponibles(lista.get(i));
            modelo.addRow(fila);
        }
        table.setModel(modelo);
    }

    public void cargarFields() {
        int fila = vistaCompra.getjTableFunciones().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            vistaCompra.getjTFfecha().setText(vistaCompra.getjTableFunciones().getValueAt(fila, 1).toString());
            vistaCompra.getjTFhora().setText(vistaCompra.getjTableFunciones().getValueAt(fila, 2).toString());
            vistaCompra.getjTFparking().setText(vistaCompra.getjTableFunciones().getValueAt(fila, 3).toString());
            vistaCompra.getjTFpelicula().setText(vistaCompra.getjTableFunciones().getValueAt(fila, 4).toString());
        }
    }

    public void agregar() {
        FuncionModelo funcion = new FuncionModelo();
        int fila = vistaCompra.getjTableFunciones().getSelectedRow();
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else if (validarPatente(vistaCompra.getjTFpatente().getText()) == false) {
            JOptionPane.showMessageDialog(null, "La patente no puede tener más de 10 caracteres.");
        } else if (verificarCantidadEntradas()) {
            JOptionPane.showMessageDialog(null, "No quedan más entradas disponibles para esta función.");
        } else {
            entrada.setPatente(vistaCompra.getjTFpatente().getText().toUpperCase());
            funcion.setNroFuncion(Integer.valueOf(vistaCompra.getjTableFunciones().getValueAt(fila, 0).toString()));
            entrada.setFuncion(funcion);

            if (entrada.createEntrada(entrada) == true) {
                clearTable();
                resetVista();
                listarFunciones(vistaCompra.getjTableFunciones());
                JOptionPane.showMessageDialog(null, "Entrada comprada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "No puede comprar dos entradas para el mismo vehiculo en la misma función.");
            }
        }
    }

    public boolean validarCampos() {
        if (vistaCompra.getjTFpatente().getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarPatente(String patente) {
        if (patente.length() > 10 || patente.length() < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificarCantidadEntradas() {
        FuncionModelo funcion = new FuncionModelo();
        ParkingModelo parking = new ParkingModelo();
        int fila = vistaCompra.getjTableFunciones().getSelectedRow();
        int codParking = Integer.valueOf(vistaCompra.getjTableFunciones().getValueAt(fila, 3).toString());
        int codFuncion = Integer.valueOf(vistaCompra.getjTableFunciones().getValueAt(fila, 0).toString());
        int capacidadPark = parking.readCapacidadParking(codParking);
        int ocupadas = entrada.readEntradasDisponibles(codFuncion);
        return capacidadPark <= ocupadas;
    }

    public int cantidadEntradasDisponibles(FuncionModelo funcion) {
        ParkingModelo parking = new ParkingModelo();
        int codParking = funcion.getParking().getNumero();
        int codFuncion = funcion.getNroFuncion();
        int capacidadPark = parking.readCapacidadParking(codParking);
        int ocupadas = entrada.readEntradasDisponibles(codFuncion);
        return capacidadPark - ocupadas;
    }

    public void resetVista() {
        vistaCompra.getjTFpatente().setText("");
        vistaCompra.getjTFfecha().setText("");
        vistaCompra.getjTFhora().setText("");
        vistaCompra.getjTFparking().setText("");
        vistaCompra.getjTFpelicula().setText("");
    }
    
    public void clearTable() {
        for (int i = 0; i < vistaCompra.getjTableFunciones().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
