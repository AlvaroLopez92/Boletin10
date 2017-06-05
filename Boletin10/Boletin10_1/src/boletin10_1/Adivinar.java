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
public class Adivinar {
    private int numeroCorrecto;
    private int esMayor;
    private int esMenor;

    public Adivinar(int numeroCorrecto, int esMayor, int esMenor) {
        this.numeroCorrecto = numeroCorrecto;
        this.esMayor = esMayor;
        this.esMenor = esMenor;
    }
    public Adivinar(){
        }

    public int getNumeroCorr() {
        return numeroCorrecto;
    }

    public void setNumeroCorrecto(int numeroCorrecto) {
        this.numeroCorrecto = numeroCorrecto;
    }

    public int getPistaMayor() {
        return esMayor;
    }

    public void setPistaMayor(int pistaMayor) {
        this.esMayor = esMayor;
    }

    public int getPistaMenor() {
        return esMenor;
    }

    public void setPistaMenor(int pistaMenor) {
        this.esMenor = esMenor;
    }
    public void adivinar(int numInt){
        int numPru=0;
        int i=0;
        while(i<numInt){
            numPru=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
            
            if(numPru==numeroCorrecto){
                System.out.println("Es correcto"); 
                break;
            }
            else if(numPru>numeroCorrecto&&numPru!=numeroCorrecto){
                this.esMenor=numPru;
                System.out.println("Es menor que "+esMenor);
            }
            if(numPru<numeroCorrecto&&numPru!=numeroCorrecto){
                this.esMayor=numPru;
                System.out.println("Es mayor que "+esMayor);
            }
            i++;
        }
    }
}