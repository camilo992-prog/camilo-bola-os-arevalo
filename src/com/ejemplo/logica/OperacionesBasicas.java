
package com.ejemplo.logica;
import javax.swing.JFrame;

public class OperacionesBasicas extends JFrame{

    public OperacionesBasicas(){
        
        this.setSize(500,500);
        
    }
    
    double resultado;

    public double sumar(double numero1, double numero2) {
        resultado = numero1 + numero2;
        return resultado;
    }

    public double restar(double numero1, double numero2) {
        resultado = numero1 - numero2;
        return resultado;
    }

    public double multiplicar(double numero1, double numero2) {
        resultado = numero1 * numero2;
        return resultado;
    }

    public double dividir(double numero1, double numero2) {
        resultado = numero1 / numero2;
        return resultado;
    }

}
