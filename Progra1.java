package progra.pkg1;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

class Radioemisora{
    
    private String nombre;
    private String direccion;
    private float frecuencia;
    private String linkWeb;
    private int cantCanciones;

    @Override
    public String toString() {
        return "Radioemisora{" + "nombre=" + nombre + ", direccion=" + direccion + ", frecuencia=" + frecuencia + ", linkWeb=" + linkWeb + ", cantCanciones=" + cantCanciones + '}';
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Radioemisora(String nombre, String direccion, float frecuencia, String linkWeb) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.frecuencia = frecuencia;
        this.linkWeb = linkWeb;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getLinkWeb() {
        return linkWeb;
    }

    public void setLinkWeb(String linkWeb) {
        this.linkWeb = linkWeb;
    }
    
}

class Locutor{
    
    private String identificacion;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private boolean sexo;
    private String nacimiento;

     public Locutor(String identificacion, String nombre, String telefono, String direccion, boolean sexo, String nacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
     }
     
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
}

class programas{

    @Override
    public String toString() {
        return "programas{" + "nombre=" + nombre + ", horario=" + horario + ", duracion=" + duracion + ", genero=" + genero + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public programas(String nombre, String horario, float duracion, String genero) {
        this.nombre = nombre;
        this.horario = horario;
        this.duracion = duracion;
        this.genero = genero;
    }
    
    private String nombre;
    private String horario;
    private float duracion;
    private String genero;
            
}





public class Progra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
