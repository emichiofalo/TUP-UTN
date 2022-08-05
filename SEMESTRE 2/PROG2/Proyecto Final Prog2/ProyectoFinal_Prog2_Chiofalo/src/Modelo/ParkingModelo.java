/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import Datos.*;

/**
 *
 * @author Emi Chiófalo
 */
public class ParkingModelo {
    
    private int numero; 
    private int capacidadAutos; 
    private ParkingDAO parkingDAO = new ParkingDAO();
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadAutos() {
        return capacidadAutos;
    }

    public void setCapacidadAutos(int capacidadAutos) {
        this.capacidadAutos = capacidadAutos;
    }

    //CRUD
    //CREATE
    public boolean createParking(ParkingModelo parking) {
        return parkingDAO.create(parking);
    }

    //READ
    public List<ParkingModelo> readParking() {
        return parkingDAO.read();
    }
    
    public int readCapacidadParking(int codParking) {
        return parkingDAO.readCapacidad(codParking);
    }

    //UPDATE
    public boolean updateParking(ParkingModelo parking) {
        return parkingDAO.update(parking);
    }

    //DELETE
    public boolean deleteParking(int parkingCod) {
        return parkingDAO.delete(parkingCod);
    }

    public boolean findParking(int parkingCod) {
        return parkingDAO.find(parkingCod);
    }
    
    public ParkingModelo findParkingCod(int parkingCod) {
        return parkingDAO.findParking(parkingCod);
    }

    public boolean parkingExist(int parkingCod) {
        return parkingDAO.exist(parkingCod);
    }
    
}
