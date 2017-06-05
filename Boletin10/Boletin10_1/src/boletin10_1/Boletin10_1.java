/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Boletin10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numeroCorrecto;
       numeroCorrecto=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero a adivinar entre 1 y 50"));
       Adivinar adiv =new Adivinar();
       if(numeroCorrecto>=1&&numeroCorrecto<=50){
        Adivinar.setNumeroCorrecto(numeroCorrecto);
       }
      Adivinar.adivinar(Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de intentos")));
    }
}

    
