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
import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emi Chiófalo
 */
public class PeliculaControlador implements ActionListener {

    private PeliculaModelo pelicula = new PeliculaModelo();
    private EntradaVistaAdmin entradaAdmin = new EntradaVistaAdmin();
    private EntradaControlador contEntr;
    private ComprarEntradaVista comprarEntrada = new ComprarEntradaVista();
    private ComprarEntradaControlador contComp;
    private FuncionVistaAdmin funcionAdmin = new FuncionVistaAdmin();
    private FuncionControlador contFunc;
    private ParkingVistaAdmin parkingAdmin = new ParkingVistaAdmin();
    private ParkingControlador contPark;
    private PeliculaVistaAdmin vistaPeli;
    private DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public PeliculaControlador(PeliculaVistaAdmin vistaPeli) {
        this.vistaPeli = vistaPeli;
        listarPeliculas(vistaPeli.getjTablePeliculas());
        this.vistaPeli.getjBagregar().addActionListener(this);
        this.vistaPeli.getjBeliminar().addActionListener(this);
        this.vistaPeli.getjBmodificar().addActionListener(this);
        this.vistaPeli.getjBvolver().addActionListener(this);
        this.vistaPeli.getjBeditar().addActionListener(this);
        this.vistaPeli.getjBlimpiar().addActionListener(this);
        this.vistaPeli.getjTablePeliculas().getRowSelectionAllowed();
        this.vistaPeli.getjBvolver().addActionListener(this);
        this.vistaPeli.getjBparking().addActionListener(this);
        this.vistaPeli.getjBfuncion().addActionListener(this);
        this.vistaPeli.getjBentradas().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPeli.getjBagregar()) {
            agregar();
        } else if (e.getSource() == vistaPeli.getjBeditar()) {
            editar();
        } else if (e.getSource() == vistaPeli.getjBmodificar()) {
            modificar();
        } else if (e.getSource() == vistaPeli.getjBeliminar()) {
            eliminar();
        } else if (e.getSource() == vistaPeli.getjBlimpiar()) {
            resetVista();
        } else if (e.getSource() == vistaPeli.getjBvolver()) {
            this.contComp = new ComprarEntradaControlador(comprarEntrada);
            comprarEntrada.setVisible(true);
            vistaPeli.dispose();
        } else if (e.getSource() == vistaPeli.getjBentradas()) {
            this.contEntr = new EntradaControlador(entradaAdmin);
            entradaAdmin.setVisible(true);
            vistaPeli.dispose();
        } else if (e.getSource() == vistaPeli.getjBfuncion()) {
            this.contFunc = new FuncionControlador(funcionAdmin);
            funcionAdmin.setVisible(true);
            vistaPeli.dispose();
        } else if (e.getSource() == vistaPeli.getjBparking()) {
            this.contPark = new ParkingControlador(parkingAdmin);
            parkingAdmin.setVisible(true);
            vistaPeli.dispose();
        }
    }

    public void agregar() {
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else if (validarTitulo(vistaPeli.getjTFtitulo().getText()) == false) {
            JOptionPane.showMessageDialog(null, "El titulo no puede tener más de 50 caracteres.");
        } else if (validarGenero(vistaPeli.getjTFgenero().getText()) == false) {
            JOptionPane.showMessageDialog(null, "El genero no puede tener más de 20 caracteres.");
        } else if (validarDirector(vistaPeli.getjTFdirector().getText()) == false) {
            JOptionPane.showMessageDialog(null, "El nombre del director no puede tener más de 30 caracteres.");
        } else if (anioContieneLetras(vistaPeli.getjTFanio().getText()) == false) {
            JOptionPane.showMessageDialog(null, "El año no puede contener letras.");
        } else if (validarAnioLength(vistaPeli.getjTFanio().getText()) == false) {
            JOptionPane.showMessageDialog(null, "El año debe tener 4 numeros.");
        } else if (validarAnioActual(Integer.parseInt(vistaPeli.getjTFanio().getText())) == false) {
            JOptionPane.showMessageDialog(null, "No se pueden cargar pre-estrenos.");
        } else if (pelicula.peliculaExist(pelicula.getCodigo())) {
            JOptionPane.showMessageDialog(null, "La pelicula ya ha sido cargada.");
        } else {
            pelicula.setTitulo(vistaPeli.getjTFtitulo().getText());
            pelicula.setDirector(vistaPeli.getjTFdirector().getText());
            pelicula.setGenero(vistaPeli.getjTFgenero().getText());
            pelicula.setAnio(Integer.valueOf(vistaPeli.getjTFanio().getText()));

            if (pelicula.createPelicula(pelicula) == true) {
                resetVista();
                clearTable();
                listarPeliculas(vistaPeli.getjTablePeliculas());
                JOptionPane.showMessageDialog(null, "Pelicula cargada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR.");
            }
        }
    }

    public boolean validarCampos() {
        if (vistaPeli.getjTFtitulo().getText().isEmpty()
                || vistaPeli.getjTFanio().getText().isEmpty()
                || vistaPeli.getjTFdirector().getText().isEmpty()
                || vistaPeli.getjTFgenero().getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarTitulo(String titulo) {
        if (titulo.length() > 50 || titulo.length() < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarGenero(String genero) {
        if (genero.length() > 20 || genero.length() < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarDirector(String director) {
        if (director.length() > 30 || director.length() < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarAnioActual(int anio) {
        LocalDate fecha = LocalDate.now();
        if (anio > fecha.getYear()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarAnioLength(String anio) {
        if (anio.length() > 4) {
            return false;
        } else {
            return true;
        }
    }

    public boolean anioContieneLetras(String dni) {
        try {
            Integer.parseInt(dni);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void resetVista() {
        vistaPeli.getjTFanio().setText("");
        vistaPeli.getjTFdirector().setText("");
        vistaPeli.getjTFgenero().setText("");
        vistaPeli.getjTFtitulo().setText("");
    }

    public void listarPeliculas(JTable table) {
        modelo = (DefaultTableModel) table.getModel();
        table.setRowHeight(20);
        List<PeliculaModelo> lista = pelicula.readPelicula();
        Object[] fila = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getCodigo();
            fila[1] = lista.get(i).getTitulo();
            fila[2] = lista.get(i).getAnio();
            fila[3] = lista.get(i).getDirector();
            fila[4] = lista.get(i).getGenero();
            modelo.addRow(fila);
        }
        table.setModel(modelo);
    }

    public void editar() {
        int fila = vistaPeli.getjTablePeliculas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            vistaPeli.getjTFtitulo().setText(vistaPeli.getjTablePeliculas().getValueAt(fila, 1).toString());
            vistaPeli.getjTFanio().setText(vistaPeli.getjTablePeliculas().getValueAt(fila, 2).toString());
            vistaPeli.getjTFdirector().setText(vistaPeli.getjTablePeliculas().getValueAt(fila, 3).toString());
            vistaPeli.getjTFgenero().setText(vistaPeli.getjTablePeliculas().getValueAt(fila, 4).toString());
        }
    }

    public void modificar() {
        if (validarCampos() == false) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
        } else {
            PeliculaModelo pelicula = new PeliculaModelo();
            int fila = vistaPeli.getjTablePeliculas().getSelectedRow();
            int id = Integer.parseInt((String) vistaPeli.getjTablePeliculas().getValueAt(fila, 0).toString());
            pelicula.setCodigo(id);
            if (pelicula.findPelicula(id)) {
                if (validarTitulo(vistaPeli.getjTFtitulo().getText()) == false) {
                    JOptionPane.showMessageDialog(null, "El titulo no puede tener más de 50 caracteres.");
                } else if (validarGenero(vistaPeli.getjTFgenero().getText()) == false) {
                    JOptionPane.showMessageDialog(null, "El genero no puede tener más de 20 caracteres.");
                } else if (validarDirector(vistaPeli.getjTFdirector().getText()) == false) {
                    JOptionPane.showMessageDialog(null, "El nombre del director no puede tener más de 30 caracteres.");
                } else if (anioContieneLetras(vistaPeli.getjTFanio().getText()) == false) {
                    JOptionPane.showMessageDialog(null, "El año no puede contener letras.");
                } else if (validarAnioLength(vistaPeli.getjTFanio().getText()) == false) {
                    JOptionPane.showMessageDialog(null, "El año debe tener 4 numeros.");
                } else if (validarAnioActual(Integer.parseInt(vistaPeli.getjTFanio().getText())) == false) {
                    JOptionPane.showMessageDialog(null, "No se pueden cargar pre-estrenos.");
                } else {
                    pelicula.setTitulo(vistaPeli.getjTFtitulo().getText());
                    pelicula.setDirector(vistaPeli.getjTFdirector().getText());
                    pelicula.setGenero(vistaPeli.getjTFgenero().getText());
                    pelicula.setAnio(Integer.valueOf(vistaPeli.getjTFanio().getText()));

                    if (pelicula.updatePelicula(pelicula) == true) {
                        resetVista();
                        clearTable();
                        listarPeliculas(vistaPeli.getjTablePeliculas());
                        JOptionPane.showMessageDialog(null, "Pelicula actualizada con exito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR.");
                    }
                }
            }
        }
    }

    public void eliminar() {
        int fila = vistaPeli.getjTablePeliculas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            int id = Integer.parseInt((String) vistaPeli.getjTablePeliculas().getValueAt(fila, 0).toString());
            pelicula.deletePelicula(id);
            resetVista();
            clearTable();
            listarPeliculas(vistaPeli.getjTablePeliculas());
            JOptionPane.showMessageDialog(null, "Pelicula eliminada");
        }
    }

    public void clearTable() {
        for (int i = 0; i < vistaPeli.getjTablePeliculas().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
