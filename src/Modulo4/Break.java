/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo4;

/**
 *
 * @author Ing. Abdon Cruz
 */
public class Break {

    public static void main(String[] args) {
        int cuenta; //la variable de control tambien se usa cuando termian el ciclo
        for (cuenta = 0; cuenta < 10; cuenta++) {
            if (cuenta == 5) {
                break;
            }
            System.out.println("Cuenta es: " + cuenta);
        }
        System.out.println("Salio del ciclo cuenta = " + cuenta);
    }
}
