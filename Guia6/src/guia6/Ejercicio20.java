/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero, x=0;
        
        int matriz[][] = new int[3][3];
        
        int[] vectorf = new int[3];
        int[] vectorc = new int[3];
        
            
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese 9 numeros: ");
                do { 
                    System.out.println("Numero "+(x+1));
                    numero = leer.nextInt();
                    matriz[i][j]=numero;
                } while (numero < 0 && numero > 10);
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        int sumaf, sumac;
        
        //sumas filas y columnas
        for (int i = 0; i < 3; i++) {
            sumaf=0;
            sumac=0;
            for (int j = 0; j < 3; j++) {
                sumaf = sumaf + matriz[i][j];
                sumac = sumac + matriz[i][j];
                if (i==j) {
                    
                }
            }
            vectorf[i] = sumaf;
            vectorc[i] = sumac;
            System.out.println(" ");
        }
        
        
        
    }
    
}
