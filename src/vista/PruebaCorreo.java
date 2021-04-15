/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Mailer;

/**
 *
 * @author IanSamuels
 */
public class PruebaCorreo {
    
    public static void main(String[] args) {
        
        Mailer.sendMail("friedsofa@gmail.com", "Ian");
    }
}
