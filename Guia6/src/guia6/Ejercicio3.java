/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio3 {

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

	System.out.print("Ingrese una frase: ");
	String frase = sc.nextLine();
	
	String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        
	System.out.println(fraseMayus);
        System.out.println(fraseMinus);
        
    }  
}
