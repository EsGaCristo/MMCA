/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cristoelateo
 */
public class Personal {
    private String nombre;
    private String pass;
    private char rango;

    public Personal(String nombre, String pass, char rango) {
        this.nombre = nombre;
        this.pass = pass;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public char getRango() {
        return rango;
    }

    public void setRango(char rango) {
        this.rango = rango;
    }
    
}
