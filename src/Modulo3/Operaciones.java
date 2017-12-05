/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo3;

//Metodos y Variables

import java.util.Scanner;

/**
 *
 * @author Abdon Cruz
 */
public class Operaciones {

    int numero1;
    int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;

    //Este metodo pedira al usuario escribir los numeros con los que se haran las operaciones
    public void leerNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segfundo numero: ");
        numero2 = sc.nextInt();
    }

    //metodo de suma
    public void sumar() {
        sumar = numero1 + numero2;
    }

    //metodo de resta
    public void restar() {
        restar = numero1 - numero2;
    }
    
    //metodo de multiplicacion
    public void multiplicar() {
        multiplicar = numero1 * numero2;
    }

    //metodo de dividir
    public void dividir() {
        dividir = numero1 / numero2;
    }

    //metodo que imprimira el resultado en las respectivas variables
    public void imprimirResultados() {
        System.out.println("El resultado de la suma es: " + sumar);
        System.out.println("El resultado de la resta es: " + restar);
        System.out.println("El resultado de la multiplicacion es: " + multiplicar);
        System.out.println("El resultado de la division es: " + dividir);
    }

    // metodo main que hara todas las operaciones
    public static void main(String[] args) {
        //objeto que contendra toda los metodos dentro de la clase Operaciones
        Operaciones op = new Operaciones();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.imprimirResultados();
    }
}
