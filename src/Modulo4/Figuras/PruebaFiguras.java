/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo4.Figuras;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author Ing. Abdon Cruz
 */
public class PruebaFiguras {

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Escribe 1 para dibujar un rectangulo \n Escribe 2 para dibujar un ovalo.");
        int opcion = Integer.parseInt(entrada);
        Figuras fig = new Figuras(opcion);
        
        JFrame ventana = new JFrame();
        
        ventana.add(fig);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300,300);
        ventana.setVisible(true);
    }

}
