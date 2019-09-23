/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

import java.util.Date;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


/**
 *
 * @author Alejo
 */
public class Locutor {
    
    private int identificador;
    private String nombre;
    private String correo;
    private int telefono;
    private String direccion;
    private String sexo; //SE PODRIA HACER UN ENUM
    private Date fNacimiento; //Revisar el codigo de la profe a ver como servia date
    
    public Locutor(int identificador, String nombre, String correo, int telefono, String direccion, String sexo, Date fNacimiento) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fNacimiento = fNacimiento;
    }

    
    //SETTERS AND GETTERS
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    
    
    
}
