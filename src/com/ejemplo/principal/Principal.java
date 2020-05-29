
package com.ejemplo.principal;

import com.ejemplo.logica.OperacionesBasicas;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {


        OperacionesBasicas op = new OperacionesBasicas(); //Instanciamos la clase "OperacionesBasicas"
        Scanner sc = new Scanner(System.in); //Instanciamos la clase Scanner

        double num1, num2; 
        System.out.print("Ingrese numero1: "); 
        num1 = sc.nextDouble(); 
        System.out.print("Ingrese numero2: "); 
        num2 = sc.nextDouble(); 

        System.out.println("La suma es: " + op.sumar(num1, num2));
        System.out.println("La resta es: " + op.restar(num1, num2));
        System.out.println("La multiplicacion es: " + op.multiplicar(num1, num2));
        System.out.println("La division es: " + op.dividir(num1, num2));
        

    }

}
