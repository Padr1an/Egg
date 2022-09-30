/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();

        int[] vector = new int[N];

        int digitouno = 0, digitodos = 0, digitotres = 0, digitocuatro = 0, digitocinco = 0;

        for (int i = 0; i < N; i++) {
            vector[i] = new Random().nextInt(99999);

            //System.out.println(""+vector[i]);
            
            if (vector[i] < 10){
                digitouno++;
            }else if (vector[i] < 100){
                digitodos++;
            }else if (vector[i] < 1000){
                digitotres++;
            }else if (vector[i] < 10000){
                digitocuatro++;
            }else if (vector[i] < 100000){
                digitocinco++;
            }
            

        }
        System.out.println("Números de 1 digito: "+digitouno);
        System.out.println("Números de 2 digito: "+digitodos);
        System.out.println("Números de 3 digito: "+digitotres);
        System.out.println("Números de 4 digito: "+digitocuatro);
        System.out.println("Números de 5 digito: "+digitocinco);

    }

}
