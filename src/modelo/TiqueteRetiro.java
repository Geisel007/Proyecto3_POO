/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author IanSamuels
 */
public class TiqueteRetiro {
    private Date fechaRetiro;
    private int entregable;
    private double monto;
    private double descuento;
    private int numCasillero;

    public TiqueteRetiro(Date fechaRetiro, int entregable, double monto,  double descuento, int numCasillero) {
        this.fechaRetiro = fechaRetiro;
        this.entregable = entregable;
        this.monto = monto;
        this.descuento = descuento;
        this.numCasillero = numCasillero;
    }
    
    public TiqueteRetiro(Date pFechaRetiro, int pEntregable, double pMonto){
        fechaRetiro = pFechaRetiro;
        entregable = pEntregable;
        monto = pMonto;
    }

    public double getDescuento() {
        return descuento;
    }
    
    public int getNumCasillero() {
        return numCasillero;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public int getEntregable() {
        return entregable;
    }

    public void setEntregable(int entregable) {
        this.entregable = entregable;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Fecha de Retiro: " + fechaRetiro + ", " + entregable + 
                ", Monto:" + monto +  '.';
    }
    
}
