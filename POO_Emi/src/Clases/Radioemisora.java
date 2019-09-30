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
        
        public static PlayList genplay(String gen,Programa progra){
            //System.out.println(gen);
            PlayList playlist = new PlayList();
            ArrayList <Cancion> lisCanciones = new ArrayList <Cancion>();
            float duraActual=0.0f;
            while(duraActual<=progra.getDuracion()){
                int elec1 = (int)(Math.random()*((2-1)+1))+1;
                if(elec1==1){
                    //System.out.println("entro 1");
                    ArrayList <Digital> digi=MainWindow.getEmisora().getDigitales();
                    for(int i=0; i<digi.size();i++){
                        //System.out.print("el i es ");
                        //System.out.print(digi.get(i));
                    }
                    int elec2 = (int)(Math.random()*(((digi.size()-1)-0)+1))+0;
                    //System.out.println(elec2);
                    //System.out.println(digi.get(elec2).nombre);
                    duraActual=duraActual+(digi.get(elec2).getDuracion());
                    if(duraActual<=progra.getDuracion()&&(digi.get(elec2).getGeneroMus() == null ? gen == null : digi.get(elec2).getGeneroMus().equals(gen))){
                        //System.out.println("Entro");
                        lisCanciones.add(digi.get(elec2));
                    }   
                    else
                      duraActual=duraActual-(digi.get(elec2).getDuracion());  
                    if(duraActual>=progra.getDuracion()-5&&duraActual<=progra.getDuracion())
                        break;
                }
                else{
                    //System.out.println("entro 2");
                    ArrayList <Disco> disco=MainWindow.getEmisora().getDisc();
                    int elec3 = (int)(Math.random()*(((disco.size()-1)-0)+1))+0;
                    ArrayList <Cancion>discEleg=disco.get(elec3).getCanciones();
                    //System.out.println(elec3);
                    //System.out.println(disco.get(elec3).getNombre());
                    int elec4 = (int)(Math.random()*(((discEleg.size()-1)-0)+1))+0;
                    //System.out.println(elec4);
                    //System.out.println(discEleg.get(elec4).getNombre());
                    duraActual=duraActual+(discEleg.get(elec4).getDuracion());
                    if(duraActual<=progra.getDuracion()&&(discEleg.get(elec4).getGeneroMus() == null ? gen == null : discEleg.get(elec4).getGeneroMus().equals(gen))){
                        //System.out.println("Entro del  2");
                        lisCanciones.add(discEleg.get(elec4));
                    }
                    else
                      duraActual=duraActual-(discEleg.get(elec4).getDuracion());  
                    if(duraActual>=progra.getDuracion()-5&&duraActual<=progra.getDuracion())
                        break;
                }
  
            }
            playlist.setCanciones(lisCanciones);
            playlist.setDuracion(duraActual);
            playlist.setNombre("playlist");
            return playlist;
        }
}
    
