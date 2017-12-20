/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo3;

/**
 *
 * @author Ing. Abdon Cruz
 */
public class Constructores {

    public Constructores() {
        System.out.println("Hola soy el constructor");
    }

    public Constructores(int a, int b) {
        int suma = a + b;
        System.out.println("la suma es: " + suma);
    }

    //constructor copia
    public Constructores(final Constructores c) {

    }

    public static void main(String[] args) {
        Constructores obj = new Constructores();
        Constructores obj2 = new Constructores(5, 6);
        Constructores obj3 = new Constructores(obj2);
    }
}
