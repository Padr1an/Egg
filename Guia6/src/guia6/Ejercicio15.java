/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
 */
package guia6;

/**
 *
 * @author Pablo
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int [100];//DEFINICION DE VECTOR
        
        for (int i = 1; i < vector.length; i++) {
            vector[i] = i;
        }
        
                
        for (int i = 1; i < vector.length; i++) {
            System.out.println("Vector 1:"+vector[i]);
            
        }
        
        System.out.println("=======================");
        
        for (int i = vector.length-1; i >= 1; i--) {
            System.out.println("Vector 2: "+vector[i]);
        }
        
    }
    
}
