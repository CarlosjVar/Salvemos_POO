package Clases;

public class Digital extends Cancion {
    private String album;
    private String path;
    public Digital(String nombre,String autor,float duracion,String genero,String album,String path)
    {
        super(nombre,duracion,autor,genero);
        this.path=path;
        this.album=album;
    }
    public Digital()
    {
        
    }
        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Override
        public String toString() {
            return "Digital{" + "album=" + album + ", path=" + path + "nombre=" + nombre + ", duracion=" + duracion + ", cantante=" + cantante + ", generoMus=" + generoMus + '}';
        }
}