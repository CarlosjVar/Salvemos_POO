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
        public void enviarCorreo(){
            Timer tiempo=new Timer();
            
            TimerTask tarea= new TimerTask(){
                @Override
                public void run() {
                    JOptionPane.showMessageDialog(null, "Se termino la playlist y el correo fue enviado"); 

                }
            };
            
            long delay=(long)(getDuracion()*60000);
            tiempo.schedule(tarea, delay);
        }
    }