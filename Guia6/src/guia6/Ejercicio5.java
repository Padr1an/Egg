/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n1 = leer.nextInt(); 
       
        System.out.println("El doble de "+n1+" es "+n1*2);
        System.out.println("El triple de "+n1+" es "+n1*3);
        System.out.println("El triple de "+n1+" es "+Math.sqrt(n1));
        
        
    }
    
}
