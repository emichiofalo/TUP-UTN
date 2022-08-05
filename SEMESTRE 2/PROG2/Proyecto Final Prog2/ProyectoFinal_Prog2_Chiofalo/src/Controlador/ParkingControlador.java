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
public class ParkingControlador implements ActionListener {

    private ParkingModelo parking = new ParkingModelo();
    private EntradaVistaAdmin entradaAdmin = new EntradaVistaAdmin();
    private EntradaControlador contEntr;
    private ComprarEntradaVista comprarEntrada = new ComprarEntradaVista();
    private ComprarEntradaControlador contComp;
    private FuncionVistaAdmin funcionAdmin = new FuncionVistaAdmin();
    private FuncionControlador contFunc;
    private PeliculaVistaAdmin peliculaAdmin = new PeliculaVistaAdmin();
    private PeliculaControlador contPeli;
    private ParkingVistaAdmin vistaPark;
    private DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public ParkingControlador(ParkingVistaAdmin vistaPark) {
        this.vistaPark = vistaPark;
        listarParkings(vistaPark.getjTableParking());
        this.vistaPark.getjBagregar().addActionListener(this);
        this.vistaPark.getjBeliminar().addActionListener(this);
        this.vistaPark.getjBmodificar().addActionListener(this);
        this.vistaPark.getjBvolver().addActionListener(this);
        this.vistaPark.getjBeditar().addActionListener(this);
        this.vistaPark.getjBlimpiar().addActionListener(this);
        this.vistaPark.getjTableParking().getRowSelectionAllowed();
        this.vistaPark.getjBfuncion().addActionListener(this);
        this.vistaPark.getjBentrada().addActionListener(this);
        this.vistaPark.getjBpelicula().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPark.getjBagregar()) {
            agregar();
        } else if (e.getSource() == vistaPark.getjBeditar()) {
            editar();
        } else if (e.getSource() == vistaPark.getjBmodificar()) {
            modificar();
        } else if (e.getSource() == vistaPark.getjBeliminar()) {
            eliminar();
        } else if (e.getSource() == vistaPark.getjBlimpiar()) {
            resetVista();
        } else if (e.getSource() == vistaPark.getjBvolver()) {
            this.contComp = new ComprarEntradaControlador(comprarEntrada);
            comprarEntrada.setVisible(true);
            vistaPark.dispose();
        } else if (e.getSource() == vistaPark.getjBentrada()) {
            this.contEntr = new EntradaControlador(entradaAdmin);
            entradaAdmin.setVisible(true);
            vistaPark.dispose();
        } else if (e.getSource() == vistaPark.getjBfuncion()) {
            this.contFunc = new FuncionControlador(funcionAdmin);
            funcionAdmin.setVisible(true);
            vistaPark.dispose();
        } else if (e.getSource() == vistaPark.getjBpelicula()) {
            this.contPeli = new PeliculaControlador(peliculaAdmin);
            peliculaAdmin.setVisible(true);
            vistaPark.dispose();
        }
    }

    public void agregar() {
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else if (Integer.valueOf(vistaPark.getjTFcapacidad().getText()) < 10) {
            JOptionPane.showMessageDialog(null, "No se pueden crear parkings con capacidad menor a 10.");
        } else {
            parking.setCapacidadAutos(Integer.valueOf(vistaPark.getjTFcapacidad().getText()));

            if (parking.createParking(parking) == true) {
                resetVista();
                clearTable();
                listarParkings(vistaPark.getjTableParking());
                JOptionPane.showMessageDialog(null, "Parking cargado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR.");
            }
        }
    }

    public boolean validarCampos() {
        if (vistaPark.getjTFcapacidad().getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void resetVista() {
        vistaPark.getjTFcapacidad().setText("");
    }

    public void listarParkings(JTable table) {
        modelo = (DefaultTableModel) table.getModel();
        table.setRowHeight(20);
        List<ParkingModelo> lista = parking.readParking();
        Object[] fila = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getNumero();
            fila[1] = lista.get(i).getCapacidadAutos();
            modelo.addRow(fila);
        }
        table.setModel(modelo);
    }

    public void editar() {
        int fila = vistaPark.getjTableParking().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            vistaPark.getjTFcapacidad().setText(vistaPark.getjTableParking().getValueAt(fila, 1).toString());
        }
    }

    public void modificar() {
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else {
            ParkingModelo parking = new ParkingModelo();
            int fila = vistaPark.getjTableParking().getSelectedRow();
            int id = Integer.parseInt((String) vistaPark.getjTableParking().getValueAt(fila, 0).toString());
            parking.setNumero(id);
            if (parking.findParking(id)) {
                if (validarCampos() == false) {
                    JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
                } else if (Integer.valueOf(vistaPark.getjTFcapacidad().getText()) < 10) {
                    JOptionPane.showMessageDialog(null, "No se pueden crear parkings con capacidad menor a 10.");
                } else {
                    parking.setCapacidadAutos(Integer.valueOf(vistaPark.getjTFcapacidad().getText()));

                    if (parking.updateParking(parking) == true) {
                        resetVista();
                        clearTable();
                        listarParkings(vistaPark.getjTableParking());
                        JOptionPane.showMessageDialog(null, "Parking actualizado con exito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR.");
                    }
                }
            }
        }
    }

    public void eliminar() {
        int fila = vistaPark.getjTableParking().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            int id = Integer.parseInt((String) vistaPark.getjTableParking().getValueAt(fila, 0).toString());
            parking.deleteParking(id);
            resetVista();
            clearTable();
            listarParkings(vistaPark.getjTableParking());
            JOptionPane.showMessageDialog(null, "Parking eliminado");
        }
    }

    public void clearTable() {
        for (int i = 0; i < vistaPark.getjTableParking().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
