package Clases;
import java.util.ArrayList;


public class Disco {

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    private String nombre;
    private String cantante;
    private int AnoEdicion;
    private String direccion;
    private String genero;
    private ArrayList <Cancion> canciones;
    

    @Override
    public String toString() {
        return "Disco{" + "nombre=" + nombre + ", cantante=" + cantante + ", AnoEdicion=" + AnoEdicion + ", direccion=" + direccion + ", genero=" + genero + '}';
    }

    public Disco(String nombre, String cantante, int AnoEdicion, String direccion, String genero, String imagen) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.AnoEdicion = AnoEdicion;
        this.direccion = direccion;
        this.genero = genero;
        this.imagen = imagen;
        this.canciones=new ArrayList <Cancion>();
    }
    public Disco(String nombre, String cantante, int AnoEdicion, String direccion, String genero) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.AnoEdicion = AnoEdicion;
        this.direccion = direccion;
        this.genero = genero;
        this.canciones=new ArrayList <Cancion>();
    }
    public Disco()
    {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getAnoEdicion() {
        return AnoEdicion;
    }

    public void setAnoEdicion(int AnoEdicion) {
        this.AnoEdicion = AnoEdicion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    private String imagen;
        public void addSong(Cancion song)
{
    this.canciones.add(song);
}
}



