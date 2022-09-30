/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados Centigrados: ");
        int celsius = leer.nextInt(); 
        
        System.out.println("El equivalente en Fahrenheit es " + (1.8*celsius+32));
    }
    
}
