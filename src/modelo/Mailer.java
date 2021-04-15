/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author IanSamuels
 */
public class Mailer {
    
  public static void sendMail(String correoRemitente, String pNombre){
      try {
          String emisor = "primerproyectodepootec2021@gmail.com";
          String claveCorreo = "soyunaclave123";
          String destino = correoRemitente; //La cuenta a la que se envia
          
          Properties props= new Properties();
          props.put("mail.smtp.host","smtp.gmail.com");
          props.put("mail.smtp.port","587");
          props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.starttls.enable","true");
          props.put("mail.smtp.ssl.trust","smtp.gmail.com");
          props.put("mail.smtp.user", emisor);
          props.put("mail.smtp.password",claveCorreo);
          
          Session session = Session.getDefaultInstance(props);
          MimeMessage mensaje = new MimeMessage(session);
          
          mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
          mensaje.setText("Bienvenido a nuestra aplicación "+ pNombre);
          Transport transport = session.getTransport("smtp");
          transport.connect("smtp.gmail.com", emisor, claveCorreo);
          transport.sendMessage(mensaje,mensaje.getAllRecipients());
          transport.close();
          System.out.println("Correo Enviado");
          
      } catch (AddressException ex) {
          Logger.getLogger(Mailer.class.getName()).log(Level.SEVERE, null, ex);
      } catch (MessagingException ex) {
          Logger.getLogger(Mailer.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}
