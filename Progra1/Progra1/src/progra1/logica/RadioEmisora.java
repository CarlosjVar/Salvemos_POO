/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Alejandro, Randall
 */
public class RadioEmisora {
    private String nombre;
    private String DFisica;
    private float frequencia;
    private String DInternet;
    private ArrayList<Programa> Programas;
    private ArrayList<Sencillo> Sencillos;
    private ArrayList<Disco> Discos;
    private ArrayList<Locutor> Locutores;
    
    
    public RadioEmisora() {
    }
    
    /**
     * Contructor de RadioEmisora
     * @param nombre
     * @param DFisica
     * @param frequencia
     * @param DInternet 
     */
    public RadioEmisora(String nombre, String DFisica, float frequencia, String DInternet) {
        this.nombre = nombre;
        this.DFisica = DFisica;
        this.frequencia = frequencia;
        this.DInternet = DInternet;
        this.Sencillos = new ArrayList<Sencillo>();
        this.Locutores = new ArrayList<Locutor>();
        this.Programas = new ArrayList<Programa>();
        this.Discos = new ArrayList<Disco>();
    }
    
    //Administracion de datos---------------------------------------------------
    
    //Administracion de discos
    
    /**
     * Funcion para agregar discos a la emisora.
     * @param Ubicacion
     * @param Nombre
     * @param Cantante
     * @param Anho
     * @param Genero
     * @param Portada
     * @param Canciones 
     */
    public void Agregar_D(String Ubicacion, String Nombre, String Cantante, int anho, String Genero, String Portada){
        boolean Bandera=false;
        Disco disco_n=new Disco(Ubicacion, Nombre, Cantante, anho, Genero, Portada);
        if(Discos.isEmpty()){
            Discos.add(disco_n);
        }
        else{
            for(int x=0;x<Discos.size();x++){
                Disco actual=Discos.get(x);
                if(actual.getNombre()==disco_n.getNombre()){
                    JOptionPane.showMessageDialog(null, "Ya existe un disco con ese nombre");
                    Bandera=true;
                    break;
                }
            }
            if (Bandera==false){
                Discos.add(disco_n);
            }
        }
    }
    
    public void Agregar_D(Disco d){
        Discos.add(d);
    }
    
    /**
     * Funcion que modifica un disco existente de la emisora.
     * Recibe el nombre del disco que se desea modificar.
     * @param Ubicacion
     * @param Nombre
     * @param Cantante
     * @param Anno
     * @param Genero
     * @param Portada
     * @param Canciones 
     */
    public void Modificar_D(String Ubicacion, String Nombre, String Cantante, int Anno, String Genero, String Portada, ArrayList Canciones){
        Disco actual;
        boolean flag = false;
        for(int x=0;x<Discos.size();x++){
            actual=Discos.get(x);
            if(actual.getNombre()==Nombre){
                actual.setNombre(Nombre);
                actual.setCantante(Cantante);
                actual.setAnho(Anno);
                actual.setGenero(Genero);
                actual.setPortada(Portada);
                actual.setCanciones(Canciones);
                Discos.set(x, actual);
                flag = true;
                break;
            }
        }
        
        if(flag==false){
            JOptionPane.showMessageDialog(null, "No existe ese disco");
        }
        
    }
    
    /**
     * Elimina un disco de la radio emisora.
     * Recibe el nombre del disco que se desea eliminar.
     * @param Nombre 
     */
    public void Eliminar_D(String Nombre){
        Disco Actual;
        boolean Bandera=false;
        for(int x=0;x<Discos.size();x++){
            Actual=Discos.get(x);
            if(Actual.getNombre()==Nombre){
                Discos.remove(x);
                
                Bandera=true;
                break;
            }
        }
        if (Bandera==false){
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
            
        }
    }
    
    //Administracion de locturores
    
    /**
     * Funcion para agregar nuevos locutores a la emisora.
     * @param ident
     * @param nombre
     * @param Correo
     * @param telefono
     * @param direcion
     * @param sexo
     * @param fNacimiento 
     */
    public void Agregar_L(int ident,String nombre,String Correo,int telefono,String direcion,String sexo,Date fNacimiento){
        boolean Bandera=false;
        Locutor locutor_n=new Locutor(ident, nombre, Correo, telefono, direcion, sexo, fNacimiento);
        if(validar_C(Correo)&&validar_N(telefono)){
            if(Locutores.isEmpty()){
                Locutores.add(locutor_n);
            }
            else{
                for(int x=0;x<Locutores.size();x++){
                    Locutor actual=Locutores.get(x);
                    if(actual.getIdentificador()==ident){
                        JOptionPane.showMessageDialog(null, "Ya existe un locutor con ese ID");
                        Bandera = true;
                        break;
                    }
                }
                if(Bandera==false){
                    Locutores.add(locutor_n);
                }
            }
            
        }
        else{
            if(validar_C(Correo)==false){
                JOptionPane.showMessageDialog(null, "Correo invalido");
            }
            if(validar_N(telefono)==false){
                JOptionPane.showMessageDialog(null, "Telefono invalido");
            }
        }
    }
    
    /**
     * Modifica un locutor existente en la emisora.
     * Realiza la busqueda mediante el ID del locutor.
     * @param IDActual
     * @param ident
     * @param nombre
     * @param Correo
     * @param telefono
     * @param direcion
     * @param sexo
     * @param fNacimiento 
     */
    public void Modificar_L(int IDActual,int ident,String nombre,String Correo,int telefono,String direcion,String sexo,Date fNacimiento){  //SEPARAR ERROR DE NUM O CORREO
        Locutor actual;
        if(validar_C(Correo)&&validar_N(telefono)){
            boolean flag = false;
            for(int x=0;x<Locutores.size();x++){
                actual=Locutores.get(x);
                if(actual.getIdentificador()==IDActual){
                    actual.setIdentificador(ident);
                    actual.setNombre(nombre);
                    actual.setCorreo(Correo);
                    actual.setTelefono(telefono);
                    actual.setDireccion(direcion);
                    actual.setSexo(sexo);
                    actual.setfNacimiento(fNacimiento); 
                    Locutores.set(x, actual);
                    flag = true;
                    break;
                }
            }   
            if(flag==false){
                JOptionPane.showMessageDialog(null, "No existe el locutor buscado");
            }
        }
        else{
            if(validar_C(Correo)==false){
                JOptionPane.showMessageDialog(null, "El correo es invalido");
            }
            if(validar_N(telefono)==false){
                JOptionPane.showMessageDialog(null, "El numero es invalido");
            }
        }
    }
    
    public Locutor Buscar_L(int id){
        boolean Bandera=false;
        Locutor Actual;
        for(int i=0;i<Locutores.size();i++){
            Actual = Locutores.get(i);
            if(Actual.getIdentificador()==id){
                Locutores.remove(i);
                Bandera=true;
                return Actual;
            }
          
        }
        if(Bandera==false){
            JOptionPane.showMessageDialog(null, "No existe el locutor buscado");
        }
        return null;
    }
    
    /**
     * Elimina un locutor de la radio emisora.
     * @param id : ID del locutor que se desea borrar.
     */
    public  void Eliminar_L(int id){
        boolean Bandera=false;
        Locutor Actual;
        for(int i=0;i<Locutores.size();i++){
            Actual = Locutores.get(i);
            if(Actual.getIdentificador()==id){
                Locutores.remove(i);
                Bandera=true;
                break;
            }
          
        }
        if(Bandera==false){
            JOptionPane.showMessageDialog(null, "No existe el locutor buscado");
        }
    }
    
    //Administracion de programas
    
    /**
     * Agrega un programa nuevo a la radioemisora. Verifica que no exista otro              //PENDIENTE LO DE CHOQUE HORARIO
     * con el mismo nombre y ademas verifica que no haya choque de horario.
     * @param nombre
     * @param horario
     * @param duracion
     * @param genero
     * @param locutor 
     */
    public void agregarPrograma(String nombre, int horario, int duracion, String genero, Locutor locutor){
        Programa programa_n = new Programa(nombre, horario, duracion, genero, locutor);
        if(Programas.isEmpty()){
            Programas.add(programa_n);
        }
        else{
            boolean repetido = false;
            boolean choque = false;
            Programa actual;
            for(int i=0; i<Programas.size(); i++){
                actual = Programas.get(i);
                if(actual.getNombre().equals(nombre)){
                    JOptionPane.showMessageDialog(null, "Ya hay un programa con ese nombre");
                    repetido = true;
                    break;
                }
                if(horario==actual.getHorario()){
                    JOptionPane.showMessageDialog(null, "Hay choque de horario");
                }
                
                if(horario<actual.getHorario()){
                    System.out.println(horario);
                    System.out.println(actual.getHorario());
                    int finnew = horario + (duracion/60);
                    System.out.println(finnew);
                    
                    if(finnew>actual.getHorario()){
                        JOptionPane.showMessageDialog(null, "Hay choque de horario");
                        choque = true;
                        break;
                    }
                }
                if(horario>actual.getHorario()){
                    System.out.println(horario);
                    System.out.println(actual.getHorario());
                    int finCurrent = (actual.getDuracion()/60) + actual.getHorario();
                     System.out.println(finCurrent);
                    
                    if(horario<finCurrent){
                        JOptionPane.showMessageDialog(null, "Hay choque de horario");
                        choque = true;
                        break;
                    }
                }
                
            }
            
            if(repetido==false && choque==false){
                Programas.add(programa_n);  
            }
        }
        
    }
    
    /**
     * Esta funcion modifica los atributos de un programa de la emisora.
     * Recibe el nombre a buscar y los nuevos valores.
     * @param nombreActual
     * @param nombre
     * @param horario
     * @param duracion
     * @param genero
     * @param locutor 
     */
    public void modificarPrograma(String nombreActual, String nombre, int horario, int duracion, String genero, Locutor locutor){
        
        boolean flag = false;
        Programa actual;
        for(int i=0; i<Programas.size(); i++){
            actual = Programas.get(i);
            if(actual.getNombre() == nombreActual){
                actual.setNombre(nombre);
                actual.setHorario(horario);
                actual.setDuracion(duracion);
                actual.setGenero(genero);
                actual.setLocutor(locutor);
                Programas.set(i, actual);
                flag = true;
                break;
            }
        }
        if(flag==false){
            JOptionPane.showMessageDialog(null, "No existe el programa buscado");
        }
        
    }
    
    /**
     * Funcion que elimina un programa de la radio emisora
     * @param nombre : nombre del programa que desea eliminar
     */
    public void eliminarPrograma(String nombre){
        
        boolean flag = false;
        
        for(int i=0; i<Programas.size(); i++){
            
            if(Programas.get(i).getNombre() == nombre){
                Programas.remove(i);
                flag = true;
                break;
            }
        }
        
        if(flag==false){
            JOptionPane.showMessageDialog(null, "No existe el programa buscado");
        }
    }
    
    //Administracion sencillos
    
    /**
     * Funcion que agrega canciones (singles) a la lista de sencillos de la emisora.
     * @param album
     * @param ruta
     * @param nombre
     * @param duracion
     * @param cantante
     * @param genero 
     */
    public void agregarSencillo(String album, String ruta, String nombre, float duracion, String cantante, String genero){
        Sencillo c_new = new Sencillo(album, ruta, nombre, duracion, cantante, genero);
        
        boolean repetido = false;
        for(int i=0; i<Sencillos.size();i++){
            if(Sencillos.get(i).getNombre()==nombre){
                repetido = true;
                JOptionPane.showMessageDialog(null, "El single ya esta en la lista");
                break;
            }
        }
        if(repetido == false){
            Sencillos.add(c_new);
        }
    
    }

    
    //Fin administracion--------------------------------------------------------
    
    /**
     * Funcion que verifica si un correo tiene formato valido o no
     * @param Correo
     * @return Boolean: true si es correcto y false si es invalido
     */
    private boolean validar_C(String Correo){
        int longitud = Correo.length();
        char valor;
        for(char i = 0; i < longitud; i++){
            valor = Correo.charAt(i);
            if(valor == '@' && i == 0){
                
                return false;
            }
            if(valor == '@'){
                
                return true;
            }
            else if(i == longitud-1){
                	
                return false;
            }
        }	
        return false;   
    }
    
    /**
     * Funcion que verifica si la cantidad de digitos de un numero es valida
     * @param Numero
     * @return Boolean: true si es correcta y false si es incorrecta
     */
    private boolean validar_N(int Numero){
        int largo=0;
        while (Numero!=0){
            largo++;
            Numero=Numero/10;
        }
        if(largo==8){
            return true;
        }
        else{
            return false;
        }
    } 
    
    public void Cargarlista_de_todo(String direccion) throws IOException{
        //Se declaran las variables proximas a usarse en el constructor
        String Nombre = "";
        String Cantante="";
        float Duracion=0;
        String Genero="";
        String Album="";
        String Path="";
                
        try {
            //Se crea Woorbook asignandole de valor el archivo excel previamente creado
            File miArchivo=new File(direccion);
            Workbook wb= WorkbookFactory.create(new FileInputStream(miArchivo));
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
                                case 0:Album=cell.getStringCellValue();break;
                                case 1:Nombre=cell.getStringCellValue();break;
                                case 2:Cantante=cell.getStringCellValue();break;
                                case 3:Duracion=Float.parseFloat(cell.getStringCellValue());break;
                                case 4:Genero=cell.getStringCellValue();break;
                                case 5:Path=cell.getStringCellValue();break;
                            }
                        }
                    columna++; 
                    
                    }
                }
                if(fila!=0){
                    Sencillo nuevo_sencillo=new Sencillo(Album, Path, Nombre, Duracion, Cantante, Genero);
                    Sencillos.add(nuevo_sencillo);
                }
                fila++;
            } 
        
        } catch (InvalidFormatException ex) {
            Logger.getLogger(ProyectoEmisora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void escribirExel_Albunes(String path) throws IOException, InvalidFormatException{
        ArrayList<Cancion> Lista_Canciones=new ArrayList();
        
        for(int x=0;x<Discos.size();x++){
            Disco disco_A=Discos.get(x);
            for(int y=0;y<(disco_A.getCanciones().size());y++){
                Lista_Canciones.add(disco_A.getCanciones().get(y));
            }
        }
       File Prueba=new File(path);
       XSSFWorkbook wb = new XSSFWorkbook();
       Sheet sheet= wb.createSheet();
       try{
           for(int x=0;x<Sencillos.size();x++){
                   Row fila = sheet.createRow(x);
                   for(int y=0;y<6;y++){
                   Cell cell=fila.createCell(y);
                   if(x==0){
                       switch(y){
                       case 0:cell.setCellValue("Album");break;
                       case 1:cell.setCellValue("Nobre de la Cancion");break;
                       case 2:cell.setCellValue("Cantante");break;
                       case 3:cell.setCellValue("Duracion");break;
                       case 4:cell.setCellValue("Genero Musical");break;
                       case 5:cell.setCellValue("Path");break;
                       }
                   }
                   else if(Sencillos.get(x) instanceof Sencillo){  
                        switch(y){
                        case 0:cell.setCellValue(Sencillos.get(x).getAlbum());break;
                        case 1:cell.setCellValue(Sencillos.get(x).nombre);break;
                        case 2:cell.setCellValue(Sencillos.get(x).cantante);break;
                        case 3:cell.setCellValue(Sencillos.get(x).duracion);break;
                        case 4:cell.setCellValue(Sencillos.get(x).genero);break;
                        case 5:cell.setCellValue(Sencillos.get(x).getRuta());break;
                        }
                   }
                   }
           wb.write(new FileOutputStream(Prueba));
           }
           
           for(int x=Sencillos.size();x<(Lista_Canciones.size()+Sencillos.size());x++){
                   Row fila = sheet.createRow(x);
                        for(int y=0;y<6;y++){
                            Cell cell=fila.createCell(y);
                                switch(y){
                                    case 0:cell.setCellValue(" ");break;
                                    case 1:cell.setCellValue(Lista_Canciones.get(x).nombre);break;
                                    case 2:cell.setCellValue(Lista_Canciones.get(x).cantante);break;
                                    case 3:cell.setCellValue(Lista_Canciones.get(x).duracion);break;
                                    case 4:cell.setCellValue(Lista_Canciones.get(x).genero);break;
                                    case 5:cell.setCellValue(" ");break;
                                }
                        }
                        wb.write(new FileOutputStream(Prueba));
       }
       }
       catch(Exception e){
               }
       
   }
    
    
    
    
    
    /**
     * Funcion que genera la playlist de un programa. Funciona de manera aleatoria.
     * @param namep : el nombre del programa al que se le va a crear la playlist
     */
    public void generarPlaylist(String namep){                                          
        
        if(this.Sencillos.isEmpty()==true && this.Discos.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "No hay canciones");
        }
        
        else{
            
            float sumatoria = 0;
            int numPrograma = 0;
            Programa current = null;

            for(int i=0; i<this.Programas.size(); i++){
                if(Programas.get(i).getNombre().equals(namep)){
                    numPrograma = i;
                    current = Programas.get(i);
                    break;
                }
            }
            
            Programas.get(numPrograma).LimpiarPlaylist();
            
            String genero = current.getGenero();
            float duracion = current.getDuracion();

            if(this.Sencillos.isEmpty()==false){
                Sencillo c;
                for(int i=0; i<Sencillos.size(); i++){
                    c = Sencillos.get(i);
                    if(c.getGenero().equals(genero)){
                        if((sumatoria+c.getDuracion())<duracion){
                            Programas.get(numPrograma).Agregar_C(c);
                            sumatoria = sumatoria + c.getDuracion();
                        }
                    }
                }
            }

            if(this.Discos.isEmpty()==false){
                Disco disk;
                ArrayList<Cancion> listC;
                Random r = new Random();
                for(int i=0; i<Discos.size(); i++){
                    disk = Discos.get(i);
                    listC = disk.getCanciones();
                    int j = r.nextInt(listC.size());
                    if(listC.get(j).getGenero().equals(genero)){
                        if((sumatoria+listC.get(j).getDuracion())<duracion){
                            Programas.get(numPrograma).Agregar_C(listC.get(j));
                            sumatoria = sumatoria + listC.get(j).getDuracion();
                        }
                    }
                }
            }
            
            if(sumatoria>=(duracion-5) && sumatoria<=duracion){
                JOptionPane.showMessageDialog(null, "Se ha creado el playlist");
                String body = "";
                ArrayList lista = Programas.get(numPrograma).getPlaylist();
                Cancion c;
                for(int i=0; i<lista.size(); i++){
                    c = (Cancion)lista.get(i);
                    body = "Duracion total:" + sumatoria + "\n";
                    body = "Genero de la playlist: " + genero;
                    body = body + "Nombre: " + c.getNombre() + " Cantante: " + 
                            c.getCantante() + " Duracion: " + c.getDuracion()
                            + "\n";
                }

                EmailSSL correo = new EmailSSL(Programas.get(numPrograma).getLocutor().getCorreo(), "Se ha creado un playlist!", body);
                correo.send();
                JOptionPane.showMessageDialog(null, "Se ha notificado al locutor por correo");
            }
            else{
                Programas.get(numPrograma).LimpiarPlaylist();
                JOptionPane.showMessageDialog(null, "La cantidad de canciones no es "
                        + "suficiente para cubrir todo el programa");
            }
        }
    }
    
    //STTERS & GETTERS
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDFisica() {
        return DFisica;
    }

    public void setDFisica(String DFisica) {
        this.DFisica = DFisica;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public String getDInternet() {
        return DInternet;
    }

    public void setDInternet(String DInternet) {
        this.DInternet = DInternet;
    }

    @Override
    public String toString() {
        return "RadioEmisora{" + "nombre=" + nombre + ", DFisica=" + DFisica 
              + ", frequencia=" + frequencia + ", DInternet=" + DInternet + '}';
    }

    public ArrayList<Programa> getProgramas() {
        return Programas;
    }

    public ArrayList<Sencillo> getSencillos() {
        return Sencillos;
    }

    public ArrayList<Disco> getDiscos() {
        return Discos;
    }

    public ArrayList<Locutor> getLocutores() {
        return Locutores;
    }
    
    
}
