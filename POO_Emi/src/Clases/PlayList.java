package Clases;
import java.util.ArrayList;

public class PlayList {
    private float duracion;
    private string  nombre;
    private ArrayList <Cancion> canciones;

        public PlayList(string nombre) {
            this.nombre = nombre;
        }

        public string getNombre() {
            return nombre;
        }

        public void setNombre(string nombre) {
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