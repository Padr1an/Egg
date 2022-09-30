/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        int numero;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero: ");
                numero = leer.nextInt();
                matriz[i][j]=numero;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("=====================");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matriz[j][i]+" ");
            }
            System.out.println(" ");
        }
        //0 -2 4 / 2 0 2 / -4 -2 0
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matriz[j][i] + matriz[i][j])==0) {
                    cont++;
                } 
            }
            System.out.println(" ");
        }
        if (cont==9){
          System.out.println("La matriz es anti simétrica. ");
        } else{
          System.out.println("La matriz no es anti simétrica. ");
        }
    }
    
}
