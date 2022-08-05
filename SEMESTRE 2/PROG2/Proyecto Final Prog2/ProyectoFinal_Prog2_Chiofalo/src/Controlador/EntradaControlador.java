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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emi Chiófalo
 */
public class EntradaControlador implements ActionListener {

    private EntradaModelo entrada = new EntradaModelo();
    private ComprarEntradaVista comprarEntrada = new ComprarEntradaVista();
    private ComprarEntradaControlador contComp;
    private FuncionVistaAdmin funcionAdmin = new FuncionVistaAdmin();
    private FuncionControlador contFunc;
    private PeliculaVistaAdmin peliculaAdmin = new PeliculaVistaAdmin();
    private PeliculaControlador contPeli;
    private ParkingVistaAdmin parkingAdmin = new ParkingVistaAdmin();
    private ParkingControlador contPark;
    private EntradaVistaAdmin vistaEntrada;
    private DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public EntradaControlador(EntradaVistaAdmin vistaEntrada) {
        this.vistaEntrada = vistaEntrada;
        vistaEntrada.getjTFprecio().setText("$" + String.valueOf(entrada.getPrecio()));
        listarEntradas(vistaEntrada.getjTableEntradas());
        this.vistaEntrada.getjBcancelarCompra().addActionListener(this);
        this.vistaEntrada.getjBmodificar().addActionListener(this);
        this.vistaEntrada.getjBvolver().addActionListener(this);
        this.vistaEntrada.getjTableEntradas().getRowSelectionAllowed();
        this.vistaEntrada.getjBfuncion().addActionListener(this);
        this.vistaEntrada.getjBparking().addActionListener(this);
        this.vistaEntrada.getjBpelicula().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaEntrada.getjBmodificar()) {
            modificar();
            vistaEntrada.getjTFprecio().setText("$" + String.valueOf(entrada.getPrecio()));
        } else if (e.getSource() == vistaEntrada.getjBcancelarCompra()) {
            eliminar();
        } else if (e.getSource() == vistaEntrada.getjBvolver()) {
            this.contComp = new ComprarEntradaControlador(comprarEntrada);
            comprarEntrada.setVisible(true);
            vistaEntrada.dispose();
        } else if (e.getSource() == vistaEntrada.getjBparking()) {
            this.contPark = new ParkingControlador(parkingAdmin);
            parkingAdmin.setVisible(true);
            vistaEntrada.dispose();
        } else if (e.getSource() == vistaEntrada.getjBfuncion()) {
            this.contFunc = new FuncionControlador(funcionAdmin);
            funcionAdmin.setVisible(true);
            vistaEntrada.dispose();
        } else if (e.getSource() == vistaEntrada.getjBpelicula()) {
            this.contPeli = new PeliculaControlador(peliculaAdmin);
            peliculaAdmin.setVisible(true);
            vistaEntrada.dispose();
        }
    }

    public void modificar() {
        
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else if (precioContieneLetras(vistaEntrada.getjTFprecio().getText()) == false) {
            JOptionPane.showMessageDialog(null, "El precio solo puede contener numeros.");
        } else {
            EntradaModelo.setPrecio(Float.parseFloat(vistaEntrada.getjTFprecio().getText()));
        }
    }

    public boolean validarCampos() {
        if (vistaEntrada.getjTFprecio().getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean precioContieneLetras(String precio) {
        try {
            Float.parseFloat(precio);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public void resetVista() {
        vistaEntrada.getjTFprecio().setText("");
    }

    public void listarEntradas(JTable table) {
        modelo = (DefaultTableModel) table.getModel();
        table.setRowHeight(20);
        List<EntradaModelo> lista = entrada.readEntradas();
        Object[] fila = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getNumero();
            fila[1] = lista.get(i).getPatente();
            fila[2] = lista.get(i).getFuncion().getFecha();
            fila[3] = lista.get(i).getFuncion().getHorario();
            fila[4] = lista.get(i).getFuncion().getPelicula().getTitulo();
            fila[5] = lista.get(i).getFuncion().getParking().getNumero();
            fila[6] = lista.get(i).getPrecioComprado();
            modelo.addRow(fila);
        }
        table.setModel(modelo);
    }

    public void eliminar() {
        int fila = vistaEntrada.getjTableEntradas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            int id = Integer.parseInt((String) vistaEntrada.getjTableEntradas().getValueAt(fila, 0).toString());
            entrada.deleteEntrada(id);
            clearTable();
            listarEntradas(vistaEntrada.getjTableEntradas());
            JOptionPane.showMessageDialog(null, "Compra cancelada.");
        }
    }

    public void clearTable() {
        for (int i = 0; i < vistaEntrada.getjTableEntradas().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
