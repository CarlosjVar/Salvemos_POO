/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Programa{
    private String nombre;
    private String horario;
    private float duracion;
    private String genero;
    private Locutor locutor;
    private PlayList playlist;

        public Programa(String nombre, String horario, String genero) {
            this.nombre = nombre;
            this.horario = horario;
            this.genero = genero;
        }

    
        public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }

        public Locutor getLocutor() {
            return locutor;
        }

        public void setLocutor(Locutor locutor) {
            this.locutor = locutor;
        }

        public PlayList getPlaylist() {
            return playlist;
        }

        public void setPlaylist(PlayList playlist) {
            this.playlist = playlist;
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
    
     @Override
    public String toString() {
        return "programas{" + "nombre=" + nombre + ", horario=" + horario + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
}