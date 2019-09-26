/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

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
}
    
