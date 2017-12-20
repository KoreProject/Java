/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo6;

/**
 *
 * @author Ing. Abdon Cruz
 */
public class ForEach {
    public static void main(String[] args) {
        int[] arreglo = {87, 64, 94, 100, 83, 78, 85, 91, 78, 87};
        int total = 0;
        for (int numero : arreglo) {
            total += numero;
        }
        System.out.println("El valor de la suma es " + total);
    }
}
