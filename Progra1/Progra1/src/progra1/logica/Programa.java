/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

import java.util.ArrayList;

/**
 *
 * @author Alejo
 */
public class Programa {
    
    private String nombre;
    private int horario; //SE PUEDE CAMBIAR TAL VEZ
    private int duracion;
    private String genero; // TAMBIEN SE PUEDE HACER UN ENUM
    private Locutor locutor;
    private ArrayList playlist;

    public Programa(String nombre, int horario, int duracion, String genero, Locutor locutor) {
        this.nombre = nombre;
        this.horario = horario;
        this.duracion = duracion;
        this.genero = genero;
        this.locutor = locutor;
        this.playlist = new ArrayList();
    }

    public void Agregar_C(Cancion c){
        playlist.add(c);
    }
    
    public void LimpiarPlaylist(){
        playlist.clear();
    }
    
    //SETTERS AND GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Locutor getLocutor() {
        return locutor;
    }

    public void setLocutor(Locutor locutor) {
        this.locutor = locutor;
    }

    public ArrayList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList playlist) {
        this.playlist = playlist;
    }
    
    
    
}
