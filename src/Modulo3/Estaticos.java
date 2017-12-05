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
public class Estaticos {
    //
    static String atrib = "Atributo";
    public static int sumar(int x, int y){
        int suma = x+y;
        return suma;
    }
    
    public static void main(String[] args) {
        Estaticos est1 =  new Estaticos();
        Estaticos est2 =  new Estaticos();
        
        est1.atrib = "Atributo cambiado";
        est2.atrib = "Valor estatico";
        
        Estaticos est3 = new Estaticos();
        est3.atrib = "Otro cambio";
                
        
        /*String var1 = est1.atrib;
        String var2 = est2.atrib;*/
        
        System.out.println("Variable1 es: " + est1.atrib);
        System.out.println("Variable2 es: " + est2.atrib);
        
        int suma = Estaticos.sumar(5,10);
        System.out.println("El resultado es: " + suma);
        System.out.println("Variable de clase: " + Estaticos.atrib);
    }
}
