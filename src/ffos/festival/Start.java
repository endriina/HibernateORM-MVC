/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival;

import ffos.festival.pomocno.HibernateUtil;
import ffos.festival.view.Izbornik;

/**
 *
 * @author Endrina
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // HibernateUtil.getSession(); 
       new Izbornik().setVisible(true);
    }
    
}
