/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Datos .*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class PeliculaModelo {
    
    private int codigo;
    private String titulo; 
    private int anio; 
    private String director; 
    private String genero;
    private PeliculaDAO peliculaDAO = new PeliculaDAO();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //CRUD
    //CREATE
    public boolean createPelicula(PeliculaModelo pelicula) {
        return peliculaDAO.create(pelicula);
    }

    //READ
    public List<PeliculaModelo> readPelicula() {
        return peliculaDAO.read();
    }

    //UPDATE
    public boolean updatePelicula(PeliculaModelo pelicula) {
        return peliculaDAO.update(pelicula);
    }

    //DELETE
    public boolean deletePelicula(int peliculaCod) {
        return peliculaDAO.delete(peliculaCod);
    }

    public boolean findPelicula(int peliculaCod) {
        return peliculaDAO.find(peliculaCod);
    }
    
    public PeliculaModelo findPeliculaCod(int peliculaCod) {
        return peliculaDAO.findPelicula(peliculaCod);
    }
    
    public PeliculaModelo findPeliculaCodPorNombre(String nombre) {
        return peliculaDAO.findPeliculaporNombre(nombre);
    }

    public boolean peliculaExist(int peliculaCod) {
        return peliculaDAO.exist(peliculaCod);
    }
    
}
