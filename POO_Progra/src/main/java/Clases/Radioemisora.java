/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author carlo
 */
public class Radioemisora {
    private String nombre;
    private String direccion;
    private float frecuencia;
    private String linkWeb;
    private int cantCanciones;

    @Override
    public String toString() {
        return "Radioemisora{" + "nombre=" + nombre + ", direccion=" + direccion + ", frecuencia=" + frecuencia + ", linkWeb=" + linkWeb + ", cantCanciones=" + cantCanciones + '}';
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Radioemisora(String nombre, String direccion, float frecuencia, String linkWeb) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.frecuencia = frecuencia;
        this.linkWeb = linkWeb;
        this.cantCanciones=0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getLinkWeb() {
        return linkWeb;
    }

    public void setLinkWeb(String linkWeb) {
        this.linkWeb = linkWeb;
    }
    
}
    
