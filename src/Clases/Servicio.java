
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
    private String nomtipoServicio;
    private String Provedor;
    private  int cantidad;

      

public Servicio(int CodServicio,String Concepto,BigDecimal precio,int tipoServicio,String Provedor){
this.CodServicio = CodServicio;
        this.Concepto = Concepto;
        this.precio = precio;
        this.tipoServicio = tipoServicio;
        this.Provedor = Provedor;
        
}

    public Servicio(int CodServicio, String Concepto, BigDecimal precio, String Provedor,String nomTipoServicio) {
        this.CodServicio = CodServicio;
        this.Concepto = Concepto;
        this.precio = precio;
        this.nomtipoServicio = nomTipoServicio;
        this.Provedor = Provedor;
        
    }

 public Servicio(int CodServicio, String Concepto, BigDecimal precio, int tipoServicio,String Provedor,int cantidad) {
        this.CodServicio = CodServicio;
        this.Concepto = Concepto;
        this.precio = precio;
        this.tipoServicio = tipoServicio;
        this.Provedor = Provedor;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public String getNomtipoServicio() {
         return nomtipoServicio;
    }

    public void setNomtipoServicio(String nomtipoServicio) {
        this.nomtipoServicio = nomtipoServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "CodServicio=" + CodServicio + ", Concepto=" + Concepto + ", precio=" + precio + ", tipoServicio=" + tipoServicio + ", Provedor=" + Provedor + ", cantidad=" + cantidad + '}';
    }

   
    
}
