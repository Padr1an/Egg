/*
  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
 */

/**
 *
 * @author Pablo
 */
public class Ejercicio15_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[] = new int[101];
        
        //int cont = 1;
        
        for (int i = 1; i <= 100; i++) {
            vector[i] = i;
            System.out.println(vector[i]);
        }
        
        for (int i = 100; i > 0; i--) {
            System.out.println(vector[i]);
        }
        
    }
    
}
