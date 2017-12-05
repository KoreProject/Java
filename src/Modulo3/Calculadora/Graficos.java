/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3.Calculadora;

import javax.swing.JOptionPane;

/**
 * 
 * @author Ing. Abdon Cruz
 */
public class Graficos {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Introduzca el primer numero");
        String n2 = JOptionPane.showInputDialog("Introduzca el segundo numero");       
        
        //Conversion de datos String  Double
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        Operaciones op = new Operaciones();
        double suma = op.sumar(num1,num2);
        double resta = op.restar(num1, num2);
        double mult = op.multiplicar(num1, num2);
        double div = op.division(num1, num2);
        
        JOptionPane.showMessageDialog(null, "Suma: " + suma);
        JOptionPane.showMessageDialog(null, "Resta: " + resta);
        JOptionPane.showMessageDialog(null, "Multiplicacion: " + mult);
        JOptionPane.showMessageDialog(null, "Division: "+ div);        
    }
}
