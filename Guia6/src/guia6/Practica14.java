/*
 Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package guia6;

import java.util.Scanner;



/**
 *
 * @author Pablo
 */
public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de compañeros: ");
        int N = leer.nextInt();
        
        String vector[] = new String[N];              
        
        System.out.println("Ingrese los nombres de sus compañeros");
        for (int i = 0; i < N; i++) {
            System.out.println("Nombre Nº"+i+": ");
            String nombre = leer.next();
            vector[i] = nombre;
        }
        System.out.println("Nombres: ");
        for (int i = 0; i < N; i++) {
            System.out.println("-"+vector[i]);
        }
    }
    
}
