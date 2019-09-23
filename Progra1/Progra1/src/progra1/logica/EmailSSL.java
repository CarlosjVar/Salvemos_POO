/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.logica;

/**
 *
 * @author Alejandro
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


public class EmailSSL {
    
    private String dest;
    private String asunto;
    private String mensaje;
    public EmailSSL(String dest, String asunto, String mensaje){
           this.dest = dest;
           this.asunto = asunto;
           this.mensaje = mensaje;
    }
    
    public void send(){
          Properties props = new Properties();
          props.put("mail.smtp.host", "smtp.gmail.com");
          props.put("mail.smtp.socketFactory.port", "465");
          props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
          props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.port", "465");
          
          Session session  = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("freex.prueba@gmail.com", "patosaurio");
                }
            });
          
          try{
              MimeMessage message = new MimeMessage(session);
              message.setFrom(new InternetAddress("freex.prueba@gmail.com"));
              message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.dest));
              message.setSubject(this.asunto);
              message.setText(this.mensaje);
              
              Transport.send(message);
              System.out.println("Mensaje enviado");
          
          }catch(MessagingException e){
              throw new RuntimeException(e);
              
          }
    }
    
    
}
