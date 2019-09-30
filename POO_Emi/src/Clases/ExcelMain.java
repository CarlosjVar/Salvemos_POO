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

   


public class ExcelMain {
        public static Cancion[] lecturaExcel(String path) throws IOException{
        Cancion[] ana = null;
            try {
                

            
            FileInputStream archivo = new FileInputStream(new File(path));
            XSSFWorkbook documento= new XSSFWorkbook(archivo);
            XSSFSheet pagina= documento.getSheetAt(0);
            int numFilas=pagina.getLastRowNum();
            ana=new Cancion[numFilas];
            for(int contFila=0; contFila<=numFilas; contFila++)
            {
                Cancion cancion=new Cancion();
                Row fila=pagina.getRow(contFila);
                Cell celda;
                celda = fila.getCell(0);
                //System.out.println(celda);
                cancion.setNombre((String)celda.getStringCellValue());
                celda = fila.getCell(1);
                //System.out.println(celda);
                cancion.setCantante(celda.getStringCellValue());
                celda = fila.getCell(2);
                //System.out.println(celda);
                cancion.setDuracion((float)celda.getNumericCellValue());
                celda = fila.getCell(3);
                //System.out.println(celda);
                //System.out.println("\n");
                cancion.setGeneroMus(celda.getStringCellValue());
                if(contFila<numFilas)
                    ana[contFila]=cancion;
            }
            return ana;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cancion.class.getName()).log(Level.SEVERE, null, ex);//Quitar
            System.out.println("Archivo no pudo ser cargado");
            return ana;
        }
    }
        
        public static Digital[] lecturaAlbumExcel(String path) throws IOException{
        Digital[] ana = null;
            try {
                

            
            FileInputStream archivo = new FileInputStream(new File(path));
            XSSFWorkbook documento= new XSSFWorkbook(archivo);
            XSSFSheet pagina= documento.getSheetAt(0);
            int numFilas=pagina.getLastRowNum();
            ana=new Digital[numFilas];
            for(int contFila=0; contFila<=numFilas; contFila++)
            {
                Row fila=pagina.getRow(contFila);
                Digital cancion=new Digital();
                Cell celda;
                celda = fila.getCell(0);
                cancion.setAlbum(celda.getStringCellValue());
                celda = fila.getCell(1);
                cancion.setNombre(celda.getStringCellValue());
                celda = fila.getCell(2);
                cancion.setCantante(celda.getStringCellValue());
                celda = fila.getCell(3);
                cancion.setDuracion((float)celda.getNumericCellValue());
                celda = fila.getCell(4);
                cancion.setGeneroMus(celda.getStringCellValue());
                celda = fila.getCell(5);
                cancion.setPath(celda.getStringCellValue());
                if(contFila<numFilas)
                    ana[contFila]=cancion;
                System.out.println("\n");
            }
            for(int i = 0; i < ana.length; i++) {
            System.out.print(ana[i].getNombre());
 
            }
            return ana;                 
            }
            catch (FileNotFoundException ex) {
            System.out.println("Archivo no pudo ser cargado");
            return ana;
        }
    }   
    }