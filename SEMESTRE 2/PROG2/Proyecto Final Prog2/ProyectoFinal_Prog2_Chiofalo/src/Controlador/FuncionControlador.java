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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emi Chiófalo
 */
public class FuncionControlador implements ActionListener {

    private FuncionModelo funcion = new FuncionModelo();
    private EntradaVistaAdmin entradaAdmin = new EntradaVistaAdmin();
    private EntradaControlador contEntr;
    private ComprarEntradaVista comprarEntrada = new ComprarEntradaVista();
    private ComprarEntradaControlador contComp;
    private PeliculaVistaAdmin peliculaAdmin = new PeliculaVistaAdmin();
    private PeliculaControlador contPeli;
    private ParkingVistaAdmin parkingAdmin = new ParkingVistaAdmin();
    private ParkingControlador contPark;
    private FuncionVistaAdmin vistaFunc;
    private DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public FuncionControlador(FuncionVistaAdmin vistaFunc) {
        this.vistaFunc = vistaFunc;
        listarFunciones(vistaFunc.getjTableFunciones());
        agregarDatosComboBox();
        this.vistaFunc.getjBagregar().addActionListener(this);
        this.vistaFunc.getjBeliminar().addActionListener(this);
        this.vistaFunc.getjBmodificar().addActionListener(this);
        this.vistaFunc.getjBvolver().addActionListener(this);
        this.vistaFunc.getjBeditar().addActionListener(this);
        this.vistaFunc.getjTableFunciones().getRowSelectionAllowed();
        this.vistaFunc.getjBparking().addActionListener(this);
        this.vistaFunc.getjBentrada().addActionListener(this);
        this.vistaFunc.getjBpelicula().addActionListener(this);
        this.vistaFunc.getjBlimpiar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaFunc.getjBagregar()) {
            agregar();
        } else if (e.getSource() == vistaFunc.getjBeditar()) {
            editar();
        } else if (e.getSource() == vistaFunc.getjBmodificar()) {
            modificar();
        } else if (e.getSource() == vistaFunc.getjBeliminar()) {
            eliminar();
        } else if (e.getSource() == vistaFunc.getjBlimpiar()) {
            resetVista();
        } else if (e.getSource() == vistaFunc.getjBvolver()) {
            this.contComp = new ComprarEntradaControlador(comprarEntrada);
            comprarEntrada.setVisible(true);
            vistaFunc.dispose();
        } else if (e.getSource() == vistaFunc.getjBentrada()) {
            this.contEntr = new EntradaControlador(entradaAdmin);
            entradaAdmin.setVisible(true);
            vistaFunc.dispose();
        } else if (e.getSource() == vistaFunc.getjBparking()) {
            this.contPark = new ParkingControlador(parkingAdmin);
            parkingAdmin.setVisible(true);
            vistaFunc.dispose();
        } else if (e.getSource() == vistaFunc.getjBpelicula()) {
            this.contPeli = new PeliculaControlador(peliculaAdmin);
            peliculaAdmin.setVisible(true);
            vistaFunc.dispose();
        }
    }

    public void agregar() {
        ParkingModelo parking = new ParkingModelo();
        PeliculaModelo pelicula = new PeliculaModelo();
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else if (funcion.funcionExist(funcion.getNroFuncion())) {
            JOptionPane.showMessageDialog(null, "La pelicula ya ha sido cargada.");
        } else {
            Date date = vistaFunc.getjDateChooser1().getDate();
            LocalDate ldate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            funcion.setFecha(ldate);
            funcion.setHorario(LocalTime.parse(vistaFunc.getjCBhorario().getSelectedItem().toString()));
            funcion.setParking(parking.findParkingCod(Integer.valueOf(vistaFunc.getjCBparking().getSelectedItem().toString())));
            funcion.setPelicula(pelicula.findPeliculaCodPorNombre(vistaFunc.getjCBpelicula().getSelectedItem().toString()));

            if (funcion.createFuncion(funcion) == true) {
                clearTable();
                listarFunciones(vistaFunc.getjTableFunciones());
                JOptionPane.showMessageDialog(null, "Funcion cargada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay una funcion cargada para ese parking y horario.");
            }

        }
    }

    public boolean validarCampos() {
        if (vistaFunc.getjDateChooser1().getDate() == null
                || vistaFunc.getjCBhorario().getSelectedIndex() == 0
                || vistaFunc.getjCBparking().getSelectedIndex() == 0
                || vistaFunc.getjCBpelicula().getSelectedIndex() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void agregarDatosComboBox() {
        PeliculaModelo pelicula = new PeliculaModelo();
        List<PeliculaModelo> listaPelis = pelicula.readPelicula();
        for (PeliculaModelo peli : listaPelis) {
            vistaFunc.getjCBpelicula().addItem(peli.getTitulo().toString());
        }
        ParkingModelo parking = new ParkingModelo();
        List<ParkingModelo> listaParks = parking.readParking();
        for (ParkingModelo park : listaParks) {
            vistaFunc.getjCBparking().addItem(String.valueOf(park.getNumero()));
        }
    }

    public void listarFunciones(JTable table) {
        modelo = (DefaultTableModel) table.getModel();
        table.setRowHeight(20);
        List<FuncionModelo> lista = funcion.readFunciones();
        Object[] fila = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getNroFuncion();
            fila[1] = lista.get(i).getFecha().toString();
            fila[2] = lista.get(i).getHorario().toString();
            fila[3] = lista.get(i).getParking().getNumero();
            fila[4] = lista.get(i).getPelicula().getTitulo();
            modelo.addRow(fila);
        }
        table.setModel(modelo);
    }

    public void editar() {
        int fila = vistaFunc.getjTableFunciones().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(vistaFunc.getjTableFunciones().getValueAt(fila, 1).toString());
                vistaFunc.getjDateChooser1().setDate(date);
            } catch (Exception e) {
                e.getMessage();
            }
            String horario = vistaFunc.getjTableFunciones().getValueAt(fila, 2).toString();
            vistaFunc.getjCBhorario().setSelectedItem(horario + ":00");
            vistaFunc.getjCBparking().setSelectedItem(vistaFunc.getjTableFunciones().getValueAt(fila, 3).toString());
            vistaFunc.getjCBpelicula().setSelectedItem(vistaFunc.getjTableFunciones().getValueAt(fila, 4).toString());
        }
    }

    public void modificar() {
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else {
            int fila = vistaFunc.getjTableFunciones().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt((String) vistaFunc.getjTableFunciones().getValueAt(fila, 0).toString());
                FuncionModelo funcion = new FuncionModelo();
                ParkingModelo parking = new ParkingModelo();
                PeliculaModelo pelicula = new PeliculaModelo();
                funcion.setNroFuncion(id);
                if (funcion.findFuncion(id)) {
                    Date date = vistaFunc.getjDateChooser1().getDate();
                    LocalDate ldate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    funcion.setFecha(ldate);
                    funcion.setHorario(LocalTime.parse(vistaFunc.getjCBhorario().getSelectedItem().toString()));
                    funcion.setParking(parking.findParkingCod(Integer.valueOf(vistaFunc.getjCBparking().getSelectedItem().toString())));
                    funcion.setPelicula(pelicula.findPeliculaCodPorNombre(vistaFunc.getjCBpelicula().getSelectedItem().toString()));

                    if (funcion.updateFuncion(funcion) == true) {
                        clearTable();
                        resetVista();
                        listarFunciones(vistaFunc.getjTableFunciones());
                        JOptionPane.showMessageDialog(null, "Funcion modificada con exito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya hay una funcion cargada para ese parking y horario.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR. No se encontró la pelicula a modificar.");
                }
            }
        }
    }

    public void eliminar() {
        int fila = vistaFunc.getjTableFunciones().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            int id = Integer.parseInt((String) vistaFunc.getjTableFunciones().getValueAt(fila, 0).toString());
            funcion.deleteFuncion(id);
            clearTable();
            listarFunciones(vistaFunc.getjTableFunciones());
            JOptionPane.showMessageDialog(null, "Pelicula eliminada");
        }
    }

    public void clearTable() {
        for (int i = 0; i < vistaFunc.getjTableFunciones().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public void resetVista() {
        vistaFunc.getjDateChooser1().setCalendar(null);
        vistaFunc.getjCBhorario().setSelectedIndex(0);
        vistaFunc.getjCBparking().setSelectedIndex(0);
        vistaFunc.getjCBpelicula().setSelectedIndex(0);
    }
}
