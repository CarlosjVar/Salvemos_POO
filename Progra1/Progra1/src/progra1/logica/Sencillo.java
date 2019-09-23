/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

/**
 *
 * @author Alejo
 */
public class Sencillo extends Cancion{
    
    private String album;
    private String ruta; //En el UML dice enum pero no supe por que
    
   

    public Sencillo(String album, String ruta, String nombre, float duracion, String cantante, String genero) {
        super(nombre, duracion, cantante, genero);
        this.album = album;
        this.ruta = ruta;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
