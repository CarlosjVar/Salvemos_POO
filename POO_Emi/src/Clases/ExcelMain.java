package progra.pkg1;
import java.util.Scanner;
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
    private String Genero;
    
    public Excel(String nombre, String autor, double duracion, String Genero) {
    this.nombre = nombre;
    this.autor = autor;
    this.duracion = duracion;
    this.Genero = Genero;
    }
    
    public Excel() {
    this.nombre = "";
    this.autor = "";
    this.duracion = 0.0;
    this.Genero = "";
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

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}

public class ExcelMain {
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
                cancion.setGenero(celda.getStringCellValue());
                if(contFila<numFilas)
                    ana[contFila]=cancion;
            }
            return ana;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no pudo ser cargado");
            return ana;
        }
    }
       public static void main(String[] args) throws IOException {
       Excel[] canciones;
       canciones=lecturaExcel();
       System.out.print(canciones[0].getNombre());
       System.out.println("\n");
       
        }
    }
    

