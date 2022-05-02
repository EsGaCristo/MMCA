/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Ivanr
 */
public class Pagos {
    private int idPagos;
    private BigDecimal monto;
    private BigDecimal restante;
    private Date fecha;

    public Pagos( BigDecimal monto, BigDecimal restante, Date fecha) {
        this.monto = monto;
        this.restante = restante;
        this.fecha = fecha;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public String getMonto() {
        return monto.toString();
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getRestante() {
        
        return restante.toString();
    }

    public void setRestante(BigDecimal restante) {
        this.restante = restante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
