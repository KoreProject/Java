/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3;

import javax.swing.JOptionPane;

/**
 * 
 * @author Ing. Abdon Cruz
 */
public class Dialogos {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Operacion realizada correctamente");
        //JOptionPane.showMessageDialog(null, "Operacion realizada correctamente", "Titulo Ventana",JOptionPane.WARNING_MESSAGE);
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null,"Hola " +nombre);
    }
}
