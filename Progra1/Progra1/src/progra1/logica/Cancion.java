/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

/**
 *
 * @author Alejo
 */
public class Cancion {

    protected String nombre;
    protected float duracion;
    protected String cantante;
    protected String genero; 
    private String disco;
    
    public Cancion() {
    }

    public Cancion(String nombre, float duracion, String cantante, String genero, String disco) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cantante = cantante;
        this.genero = genero;
        this.disco = disco;
    }
    
    public Cancion(String nombre, float duracion, String cantante, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cantante = cantante;
        this.genero = genero;
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

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisco() {
        return disco;
    }
    

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", duracion=" +
                duracion + ", cantante=" + cantante + ", genero=" + genero + '}';
    }
    
}
