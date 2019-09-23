/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author Alejo
 */
public class Disco {
    private String Ubicacion;
    private String Nombre;
    private String Cantante;
    private int anho;
    private String Genero;
    private String Portada;
    private ArrayList<Cancion> Canciones;

    public Disco(String Ubicacion, String Nombre, String Cantante, int anho, String Genero, String Portada) {
        this.Ubicacion = Ubicacion;
        this.Nombre = Nombre;
        this.Cantante = Cantante;
        this.anho = anho;
        this.Genero = Genero;
        this.Portada = Portada;
        this.Canciones = new ArrayList<Cancion>();
    }

    public Disco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Esta funcion agrega canciones al disco.
     * @param Nombre
     * @param Duracion
     * @param Cantante
     * @param Genero 
     */
    public void Agregar_C(String Nombre,float Duracion,String Cantante,String Genero, String disco){
        System.out.println("hola");
        Cancion Cancion_n=new Cancion(Nombre,Duracion, Cantante, Genero, disco);
        System.out.println(Cancion_n.getCantante());

        boolean bandera=false;
   
        
        for(int x=0;x<Canciones.size();x++){
            Cancion Actual=Canciones.get(x);
            if(Cancion_n.getNombre().equals(Actual.getNombre())){
                bandera=true;
                JOptionPane.showMessageDialog(null, "Ya existe una cancion con ese nombre");
                break;
            }
        }
        if(bandera==false){
            Canciones.add(Cancion_n);
            
            
        }    
    
    }
    

    /**
     * Modifica la cancion de un disco. Recibe un nombre.
     * @param Nombre
     * @param Duracion
     * @param Cantante
     * @param Genero 
     */
    public void Modificar_C(String Nombre,float Duracion,String Cantante,String Genero){
        Cancion Actual;
            for(int i=0;i<Canciones.size();i++){
                Actual=Canciones.get(i);
                if(Actual.getNombre().equals(Nombre)){
                    Actual.setNombre(Nombre);
                    Actual.setGenero(Genero);
                    Actual.setCantante(Cantante);
                    Actual.setDuracion(Duracion);
                    Canciones.set(i, Actual);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "No hay una cancion con ese nombre");
    }
    
    /**
     * Elimina una cancion del disco. Recibe un nombre.
     * @param Nombre 
     */
    public void Eliminar_C(String Nombre){
        Cancion Actual;
        boolean Bandera=false;
        for(int x=0;x<Canciones.size();x++){
            Actual=Canciones.get(x);
            if(Actual.getNombre()==Nombre){
                Canciones.remove(x);
                Bandera=true;
                JOptionPane.showMessageDialog(null, "Archivo eliminado");
                break;
            }   
        }
        if(Bandera==false){
            JOptionPane.showMessageDialog(null, "No existe una cancion con ese nombre");
        }
        
    }
    
   public void Cargarlista_Canciones(String miArchivo, String disco) throws IOException{
        //Se declaran las variables proximas a usarse en el constructor
        String Nombre = "";
        String Artista="";
        float Duracion=0;
        String Genero="";
        try {
            //Se crea Woorbook asignandole de valor el archivo excel previamente creado
            //miArchivo sustituir por Direccion del archivo

            File file = new File(miArchivo);
            Workbook wb= WorkbookFactory.create(new FileInputStream(file));
            Sheet sheet= wb.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            int fila=0;
            
            while(rowIterator.hasNext()){

                Row row=rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                int columna=0;
                while(cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(fila!=0){ 
                        if(cell!=null){
                        
                            switch(columna){
                                case 0:Nombre=cell.getStringCellValue();break;
                                case 1:Artista=cell.getStringCellValue();break;
                                case 2:Duracion=Float.parseFloat(cell.getStringCellValue());break;
                                case 3:Genero=cell.getStringCellValue();break;     
                            }
                        }
                    columna++; 
                    
                    }
                }
                if(fila!=0){

                    Cancion nueva_cancion=new Cancion(Nombre, Duracion, Artista, Genero, disco);  
                    Canciones.add(nueva_cancion);
                }
                fila++;
            } 
        
        } catch (InvalidFormatException ex) {
            Logger.getLogger(ProyectoEmisora.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //GETTERS AND SETTERS
    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantante() {
        return Cantante;
    }

    public void setCantante(String Cantante) {
        this.Cantante = Cantante;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPortada() {
        return Portada;
    }

    public void setPortada(String Portada) {
        this.Portada = Portada;
    }

    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(ArrayList<Cancion> Canciones) {
        this.Canciones = Canciones;
    }
    
}

