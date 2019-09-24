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
public class programa{

    @Override
    public String toString() {
        return "programas{" + "nombre=" + nombre + ", horario=" + horario + ", duracion=" + duracion + ", genero=" + genero + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public programa(String nombre, String horario, float duracion, String genero) {
        this.nombre = nombre;
        this.horario = horario;
        this.duracion = duracion;
        this.genero = genero;
    }
    
    private String nombre;
    private String horario;
    private float duracion;
    private String genero;            
}