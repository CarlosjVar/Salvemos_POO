package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Excel{
    
    private String nombre;
    private String autor;
    private double duracion;
    private String genero;
    private String album;
    private String direccion;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Excel(String nombre, String autor, double duracion, String genero, String album, String direccion) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.direccion = direccion;
    }
        public Excel() {
        this.nombre = "";
        this.autor = "";
        this.duracion = 0.0;
        this.genero = "";
        this.album = "";
        this.direccion = "";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String Genero) {
        this.genero = Genero;
    }
}

public class SPOILER_ExcelMain {
        public static Excel[] lecturaExcel() throws IOException{
        Excel[] ana = null;
            try {
                
            Excel cancion=new Excel();
            
            FileInputStream archivo = new FileInputStream(new File("Canciones.xlsx"));
            XSSFWorkbook documento= new XSSFWorkbook(archivo);
            XSSFSheet pagina= documento.getSheetAt(0);
            int numFilas=pagina.getLastRowNum();
            ana=new Excel[numFilas];
            for(int contFila=0; contFila<=numFilas; contFila++)
            {
                Row fila=pagina.getRow(contFila);
                Cell celda;
                celda = fila.getCell(0);
                //System.out.println(celda);
                cancion.setNombre(celda.getStringCellValue());
                celda = fila.getCell(1);
                //System.out.println(celda);
                cancion.setAutor(celda.getStringCellValue());
                celda = fila.getCell(2);
                //System.out.println(celda);
                cancion.setDuracion(celda.getNumericCellValue());
                celda = fila.getCell(3);
                //System.out.println(celda);
                //System.out.println("\n");
                cancion.setgenero(celda.getStringCellValue());
                if(contFila<numFilas)
                    ana[contFila]=cancion;
            }
            return ana;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);//Quitar
            System.out.println("Archivo no pudo ser cargado");
            return ana;
        }
    }
        
        public static Excel[] lecturaAlbumExcel() throws IOException{
        Excel[] ana = null;
            try {
                
            Excel cancion=new Excel();
            
            FileInputStream archivo = new FileInputStream(new File("C:\\Users\\carlo\\OneDrive\\Escritorio\\POO\\Salvemos_POO\\POO_Emi\\src\\Clases\\Albumes.xlsx"));
            XSSFWorkbook documento= new XSSFWorkbook(archivo);
            XSSFSheet pagina= documento.getSheetAt(0);
            int numFilas=pagina.getLastRowNum();
            ana=new Excel[numFilas];
            for(int contFila=0; contFila<=numFilas; contFila++)
            {
                Row fila=pagina.getRow(contFila);
                Cell celda;
                celda = fila.getCell(0);
                System.out.println(celda);
                cancion.setAlbum(celda.getStringCellValue());
                celda = fila.getCell(1);
                System.out.println(celda);
                cancion.setNombre(celda.getStringCellValue());
                celda = fila.getCell(2);
                System.out.println(celda);
                cancion.setAutor(celda.getStringCellValue());
                celda = fila.getCell(3);
                System.out.println(celda);
                cancion.setDuracion(celda.getNumericCellValue());
                celda = fila.getCell(4);
                System.out.println(celda);
                cancion.setgenero(celda.getStringCellValue());
                celda = fila.getCell(5);
                System.out.println(celda);
                cancion.setDireccion(celda.getStringCellValue());
                if(contFila<numFilas)
                    ana[contFila]=cancion;
                System.out.println("\n");
            }
            return ana;
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no pudo ser cargado");
            return ana;
        }
    }
       
       public static void main(String[] args) throws IOException {
       Excel[] canciones;
       canciones=lecturaAlbumExcel();
       if(canciones!=null)//Se necesita if de si el array es vacio o no como en este ejemplo
        System.out.print(canciones[0].getDireccion());
       
        }
    }