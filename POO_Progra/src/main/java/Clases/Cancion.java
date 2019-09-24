package Clases;

public class Cancion {
    protected string nombre;
    protected float duracion;
    protected string cantante;
    protected string generoMus;

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

        public string getCantante() {
            return cantante;
        }

        public void setCantante(string cantante) {
            this.cantante = cantante;
        }

        public string getGeneroMus() {
            return generoMus;
        }

        public void setGeneroMus(string generoMus) {
            this.generoMus = generoMus;
        }

        @Override
        public String toString() {
            return "Cancion{" + "nombre=" + nombre + ", duracion=" + duracion + ", cantante=" + cantante + ", generoMus=" + generoMus + '}';
        }
}