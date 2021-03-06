/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que manejara la lista de artista y sus datos
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class NodoArtista {
        private String direccionImagen;
        private String nombreArtista;
        private String generos;
        private String nacionalidad;
        private NodoDisco aux;
        /**
         * Creacion de la lista de discos
         */
        public List<NodoDisco> discos = new ArrayList<NodoDisco>();

        
        /**
         * llena la lista con los datos del disco 
         */
    public NodoArtista() {
    }
    public void nuevoDisco (String nombreD, String año, double precio ){
        aux = new NodoDisco();
        aux.setPrecio(precio);
        aux.setNombreDisco(nombreD);
        aux.setAño(año);
        discos.add(aux);
    }
    /**
     * con ayuda de un for each busca los discos en las posiciones de la lista
     */
    public void buscarDiscos(){
        for (NodoDisco ayu: discos){
            System.out.println(ayu.getNombreDisco());
        }
    }
    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<NodoDisco> getDiscos() {
        return discos;
    }

    public void setDiscos(List<NodoDisco> discos) {
        this.discos = discos;
    }
        
}
