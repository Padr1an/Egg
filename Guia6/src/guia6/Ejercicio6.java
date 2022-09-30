/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n1 = leer.nextInt(); 

        if (n1%2==0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar");
        }
        
    }
    
}
