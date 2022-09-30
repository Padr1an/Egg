/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límete: ");
        int n1 = leer.nextInt(); 
        
        int suma = 0;
        do {
            System.out.println("Ingrese otro número:");
            int n2 = leer.nextInt(); 
            suma = suma + n2;
        } while(suma < n1);
        
        System.out.println("El valor de "+suma+" supero a "+n1);
        
    }
    
}
