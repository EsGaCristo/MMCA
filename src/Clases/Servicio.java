
package Clases;

import java.math.BigDecimal;

/**
 *
 * @author Ivanr
 */

public class Servicio {
    private int CodServicio;
    private String Concepto;
    private BigDecimal precio;
    private int tipoServicio;
    private String Provedor;

    public Servicio(int CodServicio, String Concepto, BigDecimal precio,int tipoServicio, String Provedor) {
        this.CodServicio = CodServicio;
        this.Concepto = Concepto;
        this.precio = precio;
        this.tipoServicio=tipoServicio;
        this.Provedor = Provedor;
    }
    
    
    public int getCodServicio() {
        return CodServicio;
    }

    public void setCodServicio(int CodServicio) {
        this.CodServicio = CodServicio;
    }

    public String getConsepto() {
        return Concepto;
    }

    public void setConsepto(String Consepto) {
        this.Concepto = Consepto;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getProvedor() {
        return Provedor;
    }

    public void setProvedor(String Provedor) {
        this.Provedor = Provedor;
    }

    @Override
    public String toString() {
        return "Servicio{" + "CodServicio=" + CodServicio + ", Concepto=" + Concepto + ", precio=" + precio + ", tipoServicio=" + tipoServicio + ", Provedor=" + Provedor + '}';
    }
    
    
}
