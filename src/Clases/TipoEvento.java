/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Cristoelateo
 */
public class TipoEvento {
    public String ID_TIPOEVENTO;

    public TipoEvento(String ID_TIPOEVENTO) {
        this.ID_TIPOEVENTO = ID_TIPOEVENTO;
    }

    public String getID_TIPOEVENTO() {
        return ID_TIPOEVENTO;
    }

    public void setID_TIPOEVENTO(String ID_TIPOEVENTO) {
        this.ID_TIPOEVENTO = ID_TIPOEVENTO;
    }

    @Override
    public String toString() {
        return "" + this.ID_TIPOEVENTO ;
    }
    
}
