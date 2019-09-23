/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

/**
 *
 * @author Randall-Pc
 */
public class ProyectoEmisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EmailSSL correo = new EmailSSL("alee.pq@live.com", "Hola", "Este es un mensaje");
        correo.send();

    }
    
}
