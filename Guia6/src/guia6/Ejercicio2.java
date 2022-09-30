/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
 pantalla
 */
package guia6;

import java.util.Scanner;


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");/*Mensaje en pantalla*/
        String nombre /*define la variable*/ = leer.nextLine(); /*lee lo que nosotros escribir por teclado*/
        
        System.out.println("Ingrese su apellido: ");
        String apellido = leer.nextLine();
        
        System.out.println(apellido + ", " + nombre);
    }
}
