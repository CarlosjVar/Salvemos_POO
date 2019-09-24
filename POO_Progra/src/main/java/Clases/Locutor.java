/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author carlo
 */
public class Locutor{
    
    private String identificacion;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String sexo;
    private String fechaNacimiento;

     public Locutor(String identificacion, String nombre, String telefono, String direccion, String sexo, String fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
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

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString (){
        return "Locutor{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", correo=" + correo + ", telefono=" + telefono + ", sexo=" + sexo + ", Fecha de nacimiento=" + fechaNacimiento + ", direccion="+direccion+'}';
    }
}

