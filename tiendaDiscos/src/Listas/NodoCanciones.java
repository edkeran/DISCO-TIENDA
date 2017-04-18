/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
/**
 * clase que manejara los datos de las canciones de cada disco de cada cantante
 * get y set para obtener la informacion de cada disco y setear la informacion
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class NodoCanciones {
      private String nombreCancion;
      private String duracion;
      private double precio;
/**
 * Constructor vacio
 */
      public NodoCanciones() {
        }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
      
}
