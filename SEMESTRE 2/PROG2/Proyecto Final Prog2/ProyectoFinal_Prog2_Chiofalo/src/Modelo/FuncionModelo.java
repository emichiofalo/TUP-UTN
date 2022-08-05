/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import Datos.*;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;

/**
 *
 * @author Emi Chiófalo
 */
public class FuncionModelo {
    
    private int nroFuncion;
    private LocalDate fecha; 
    private LocalTime horario; 
    private ParkingModelo parking; 
    private PeliculaModelo pelicula; 
    private FuncionDAO funcionDAO = new FuncionDAO();

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public ParkingModelo getParking() {
        return parking;
    }

    public void setParking(ParkingModelo parking) {
        this.parking = parking;
    }

    public PeliculaModelo getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaModelo pelicula) {
        this.pelicula = pelicula;
    }

    public int getNroFuncion() {
        return nroFuncion;
    }

    public void setNroFuncion(int nroFuncion) {
        this.nroFuncion = nroFuncion;
    }
    
    //CRUD
    //CREATE
    public boolean createFuncion(FuncionModelo funcion) {
        return funcionDAO.create(funcion);
    }

    //READ
    public List<FuncionModelo> readFunciones() {
        return funcionDAO.read();
    }

    //UPDATE
    public boolean updateFuncion(FuncionModelo funcion) {
        return funcionDAO.update(funcion);
    }

    //DELETE
    public boolean deleteFuncion(int funcionCod) {
        return funcionDAO.delete(funcionCod);
    }

    public boolean findFuncion(int funcionCod) {
        return funcionDAO.find(funcionCod);
    }
    
    public FuncionModelo findFuncionCod(int funcionCod) {
        return funcionDAO.findFuncion(funcionCod);
    }

    public boolean funcionExist(int funcionCod) {
        return funcionDAO.exist(funcionCod);
    }
}
