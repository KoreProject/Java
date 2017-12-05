/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo4.Encapsulamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Abdon Cruz
 */
public class Persona {

    private String nombre;
    private String nacionalidad;
    private double altura;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nac) {
        this.nacionalidad = nac;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 3) {
            JOptionPane.showMessageDialog(null, "Altura invalida");
        } else {
            this.altura = altura;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0 || edad>100) {
            JOptionPane.showMessageDialog(null, "Edad invalida");;
        }else{
            this.edad = edad;
        }
    }
}
