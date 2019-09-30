/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import GUI.MainWindow;
import com.sun.org.apache.xerces.internal.impl.dv.xs.TypeValidator;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

/**
 *
 * @author carlo
 */

public class Radioemisora {
    private String nombre;
    private String direccionFi;
    private float frecuencia;
    private String URL;
    private ArrayList <Locutor> locutores;
    private ArrayList <Programa> programas; 
    private ArrayList <Digital> digitales;
    private ArrayList <Disco> discos;

        public Radioemisora(String nombre, String direccionFi, float frecuencia, String URL) {
            this.nombre = nombre;
            this.direccionFi = direccionFi;
            this.frecuencia = frecuencia;
            this.URL = URL;
            this.locutores=new ArrayList <Locutor>();
            this.programas=new ArrayList <Programa>();
            this.digitales=new ArrayList <Digital>();
            this.discos=new ArrayList <Disco>();
        }

    public ArrayList<Digital> getDigitales() {
        return digitales;
    }

    public void setDigitales(ArrayList<Digital> digitales) {
        this.digitales = digitales;
    }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccionFi() {
            return direccionFi;
        }

        public void setDireccionFi(String direccionFi) {
            this.direccionFi = direccionFi;
        }

        public float getFrecuencia() {
            return frecuencia;
        }

        public void setFrecuencia(float frecuencia) {
            this.frecuencia = frecuencia;
        }

        public String getURL() {
            return URL;
        }

        public void setURL(String URL) {
            this.URL = URL;
        }
        
        public void agregarLocutor(Locutor locutor){
            (this.locutores).add (locutor);
        }
        
        public void agregarPrograma(Programa programa){
            (this.programas).add (programa);
        }
        
        public void agregarDigital(Digital digital){
            (this.digitales).add (digital);
        }
        public void agregatDisco(Disco disco)
        {
            (this.discos).add(disco);
        }
        public ArrayList <Locutor> getLocus()
        {
            return this.locutores;
        }
        public ArrayList <Programa> getProg()
        {
            return this.programas;
        }
        public ArrayList <Disco> getDisc()
        {
            return this.discos;
        }

        @Override
        public String toString() {
            return "Radioemisora{" + "nombre=" + nombre + ", direccionFi=" + direccionFi + ", frecuencia=" + frecuencia + ", URL=" + URL + '}';
        }
        
        public static ArrayList <Cancion> generarPlaylist(String gen){
            PlayList playlist;
            ArrayList <Cancion> lisCanciones=playlist.getCanciones();
            float duraActual=0.0f;
            while(duraActual<=playlist.getDuracion()){
                int elec1 = (int)(Math.random()*((2-1)+1))+1;
                if(elec1==1){
                    ArrayList <Digital> digi=MainWindow.getEmisora().getDigitales();
                    int elec2 = (int)(Math.random()*(((digi.size()-1)-0)+1))+0;
                    duraActual=duraActual+(digi.get(elec2).getDuracion());
                    if(duraActual<=playlist.getDuracion()&&(digi.get(elec2).getGeneroMus() == null ? gen == null : digi.get(elec2).getGeneroMus().equals(gen)))
                        lisCanciones.add(digi.get(elec2));
                    else
                      duraActual=duraActual-(digi.get(elec2).getDuracion());  
                    if(duraActual>=playlist.getDuracion()-5&&duraActual<=playlist.getDuracion())
                        break;
                }
                else{
                    ArrayList <Disco> disco=MainWindow.getEmisora().getDisc();
                    for (Disco disco1 : disco) {
                        if(disco1.getGenero() == null ? gen != null : !disco1.getGenero().equals(gen))
                            disco.remove(disco1); 
                    }
                    int elec3 = (int)(Math.random()*(((disco.size()-1)-0)+1))+0;
                    ArrayList <Cancion>discEleg=disco.get(elec3).getCanciones();
                    int elec4 = (int)(Math.random()*(((discEleg.size()-1)-0)+1))+0;
                    duraActual=duraActual+(discEleg.get(elec4).getDuracion());
                    if(duraActual<=playlist.getDuracion())
                        lisCanciones.add(discEleg.get(elec4));
                    else
                      duraActual=duraActual-(discEleg.get(elec4).getDuracion());  
                    if(duraActual>=playlist.getDuracion()-5&&duraActual<=playlist.getDuracion())
                        break;
                }
  
            }
            return lisCanciones;
        }
        public static void main(String[] args){
            
        }
}
    
