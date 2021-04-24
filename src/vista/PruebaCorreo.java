/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Mailer;

/**
 *
 * @author IanSamuels
 */
public class PruebaCorreo {
    
    public static void main(String[] args) throws ParseException {
        Date fecha = new Date();
        SimpleDateFormat fechaPara = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = fechaPara.format(fecha);
        System.out.println(fechaString);
    }
}
