/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Ivanr
 */
public class tipoServicio {
    private int id_tipoServicio;
    private String nombre;

    public tipoServicio(int id_tipoServicio, String nombre) {
        this.id_tipoServicio = id_tipoServicio;
        this.nombre = nombre;
    }
    
    
    public int getId_tipoServicio() {
        return id_tipoServicio;
    }

    public void setId_tipoServicio(int id_tipoServicio) {
        this.id_tipoServicio = id_tipoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
