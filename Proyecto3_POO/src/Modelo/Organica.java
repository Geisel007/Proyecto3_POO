/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author IanSamuels
 */
public class Organica extends NoReciclable{
    
    public Organica(String pNombre, String pTratamiento, 
            String pTiempoDescomposicion, String pImagen){
        nombre = pNombre;
        tratamiento = pTratamiento;
        tiempoDescomposicion = pTiempoDescomposicion;
        imagen = pImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getTiempoDescomposicion() {
        return tiempoDescomposicion;
    }

    public void setTiempoDescomposicion(String tiempoDescomposicion) {
        this.tiempoDescomposicion = tiempoDescomposicion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
