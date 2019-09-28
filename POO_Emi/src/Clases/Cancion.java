package Clases;

public class Cancion {

    public Cancion(String nombre, float duracion, String cantante, String generoMus) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cantante = cantante;
        this.generoMus = generoMus;
    }
    protected String nombre;
    protected float duracion;
    protected String cantante;
    protected String generoMus;

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

        public String getGeneroMus() {
            return generoMus;
        }

        public void setGeneroMus(String generoMus) {
            this.generoMus = generoMus;
        }

        @Override
        public String toString() {
            return "Cancion{" + "nombre=" + nombre + ", duracion=" + duracion + ", cantante=" + cantante + ", generoMus=" + generoMus + '}';
        }
}