/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Adivinar {
    Random random=new Random();
    int salir=1;
    
    public void calculo(){
        int intentos=0;
        int numerocorrecto= random.nextInt(49)+1;
        int numero;
        while(salir!=0){
            intentos++;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
            if(numero==numerocorrecto){
                System.out.println("Has acertado en el intento nº "+intentos); 
                salir=Integer.parseInt(JOptionPane.showInputDialog("Para salir introduce el numero 0"));
                numerocorrecto=random.nextInt(49)+1;
            }
            if(((numero-numerocorrecto)>=5||(numerocorrecto-numero)>=5)&&((numero-numerocorrecto)<10||(numerocorrecto-numero)<10)){
                System.out.println("Estas cerca");
            }
            if(((numero-numerocorrecto)>=10||(numerocorrecto-numero)>=10)&&((numero-numerocorrecto)<=20||(numerocorrecto-numero)<=20)){
                System.out.println("Estas lejos");
            }
            if((numero-numerocorrecto)>5||(numerocorrecto-numero)>5){
                System.out.println("Estas muy cerca");
            }
            if((numero-numerocorrecto)>20||(numerocorrecto-numero)>20){
                System.out.println("Estas muy lejos");
            }
            
            System.out.println("el numero es" +numerocorrecto);
        }
    }
}