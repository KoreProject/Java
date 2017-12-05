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
public class Operaciones2 {

    //Este metodo pedira al usuario escribir los numeros con los que se haran las operaciones
    //metodo de suma
    public int sumar(int numero1, int numero2) {
        int sumar = numero1 + numero2;
        return sumar;
    }

    //metodo de resta
    public int restar(int numero1, int numero2) {
        int restar = numero1 - numero2;
        return restar;
    }

    //metodo de multiplicacion
    public int multiplicar(int numero1, int numero2) {
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }

    //metodo de dividir
    public int dividir(int numero1, int numero2) {
        int dividir = numero1 / numero2;
        return dividir;
    }

    //metodo que imprimira el resultado en las respectivas variables
    public void imprimirResultados(int suma, int resta, int multiplica, int divide ) {
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplica);
        System.out.println("El resultado de la division es: " + divide);
    }

    // metodo main que hara todas las operaciones
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

        Operaciones2 op = new Operaciones2();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplica = op.multiplicar(n1, n2);
        int divide = op.dividir(n1, n2);
        
        op.imprimirResultados(suma, resta, multiplica, divide);
    }
}
