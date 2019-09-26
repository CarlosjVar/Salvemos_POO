package Clases;

public class Digital extends Cancion {
    private string album;
    private string path;

        public string getAlbum() {
            return album;
        }

        public void setAlbum(string album) {
            this.album = album;
        }

        public string getPath() {
            return path;
        }

        public void setPath(string path) {
            this.path = path;
        }

        @Override
        public String toString() {
            return "Digital{" + "album=" + album + ", path=" + path + "nombre=" + nombre + ", duracion=" + duracion + ", cantante=" + cantante + ", generoMus=" + generoMus + '}';
        }
}