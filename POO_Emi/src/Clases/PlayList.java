package Clases;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class PlayList {
    private float duracion;
    private String  nombre;
    private ArrayList <Cancion> canciones;

        public PlayList() {
            
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

        public ArrayList <Cancion> getCanciones() {
            return canciones;
        }

        public void setCanciones(ArrayList <Cancion> canciones) {
            this.canciones = canciones;
        }
        public void agregarCancion(Cancion pCancion){
            (this.canciones).add (pCancion);
        }

        @Override
        public String toString() {
            return "PlayList{" + "duracion=" + duracion + ", nombre=" + nombre +'}';
        }
        
    }