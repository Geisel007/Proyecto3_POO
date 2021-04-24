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
    private int monto;
    
    public TiqueteRetiro(Date pFechaRetiro, int pEntregable, int pMonto){
        fechaRetiro = pFechaRetiro;
        entregable = pEntregable;
        monto = pMonto;
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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
