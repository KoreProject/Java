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
public class Operaciones1 {

    int numero1;
    int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;

    //Este metodo pedira al usuario escribir los numeros con los que se haran las operaciones
    //metodo de suma
    public void sumar(int numero1, int numero2) {
        sumar = numero1 + numero2;
    }

    //metodo de resta
    public void restar(int numero1, int numero2) {
        restar = numero1 - numero2;
    }

    //metodo de multiplicacion
    public void multiplicar(int numero1, int numero2) {
        multiplicar = numero1 * numero2;
    }

    //metodo de dividir
    public void dividir(int numero1, int numero2) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

        Operaciones1 op = new Operaciones1();
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

        op.imprimirResultados();
    }
}
