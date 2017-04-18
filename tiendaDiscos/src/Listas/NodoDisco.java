/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

/**
 * manejara los discos de cada cantante a crear
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class NodoDisco {
    private double precio;
    private String nombreDisco;
    private String año;
    NodoCanciones cancion;
    private NodoCanciones aux;
    /**
     * creacion de la lista de canciones de cada disco
     */
    List <NodoCanciones> canciones = new ArrayList<NodoCanciones>();
    
    /**
     * Llena la lista con esta informacion
     * @param nombreC
     * @param duracion
     * @param prec 
     */
    public void nuevaCancion(String nombreC,String duracion,double prec){
        aux= new NodoCanciones();
        aux.setNombreCancion(nombreC);
        aux.setPrecio(prec);
        aux.setDuracion(duracion);
        canciones.add(aux);
    }
    
    /**
     * con ayuda de un for each busca la cancion en la posicion de la lista deseada
     */
    public void buscarCanciones(){
        for (NodoCanciones ayu: canciones){
            System.out.println(ayu.getNombreCancion());
        }
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public List<NodoCanciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<NodoCanciones> canciones) {
        this.canciones = canciones;
    }
    
    
}
