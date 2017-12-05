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
public class Continue {
    public static void main(String[] args) {
        for (int cuenta = 0; cuenta <= 10; cuenta++) {
            if (cuenta == 5) {
                continue;
            }
            System.out.println("La cuenta es: " + cuenta);
            System.out.println("Impresion despues del valor");
        }
    }
}
