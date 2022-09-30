/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package guia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();

        int[] vector = new int[N];//DEFINICION DE VECTOR

        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(99);//Rellena el vector con numeros aleatorios
            System.out.println("Vector"+"["+(i+1)+"]: "+vector[i]);
        }
        System.out.println("");
        System.out.println("Que valor desea buscar en el vector");
        int X = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==X){
                System.out.println("Posicion: "+(i+1));
            }
        }

    }

}
