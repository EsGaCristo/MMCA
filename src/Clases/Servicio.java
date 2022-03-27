
package Clases;

/**
 *
 * @author Ivanr
 */
public class Servicio {
    private int CodServicio;
    private String Consepto;
    private double precio;
    private String Provedor;

    public Servicio(int CodServicio, String Consepto, double precio, String Provedor) {
        this.CodServicio = CodServicio;
        this.Consepto = Consepto;
        this.precio = precio;
        this.Provedor = Provedor;
    }
    
    
    public int getCodServicio() {
        return CodServicio;
    }

    public void setCodServicio(int CodServicio) {
        this.CodServicio = CodServicio;
    }

    public String getConsepto() {
        return Consepto;
    }

    public void setConsepto(String Consepto) {
        this.Consepto = Consepto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProvedor() {
        return Provedor;
    }

    public void setProvedor(String Provedor) {
        this.Provedor = Provedor;
    }
    
    
}
