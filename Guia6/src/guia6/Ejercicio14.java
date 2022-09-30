/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros(€) ");
        double euro = leer.nextDouble();
        
        System.out.println("El cambio de divisas es:\n"
                    + "0.86 libras es un 1 €\n"
                    + "1.28611 dolares es un 1 €\n"
                    + "129.852 yenes es un 1 €");

        System.out.println("Ingrese la moneda a cambiar: ");
        String moneda = leer.next();

        conversion(moneda, euro);      
    }

    public static void conversion(String moneda, double euro) {
        
        switch (moneda) {
            case "libras":
                {
                    double cambio = euro * 0.86;
                    System.out.println("El cambio a de euros a libras es "+cambio);
                    break;
                }
        
            case "dolares":
                {
                    double cambio = euro * 1.28611;
                    System.out.println("El cambio a de euros a dolares es: "+cambio);
                    break;
                }
            case "yenes":
                {
                    double cambio = euro * 129.852;
                    System.out.println("El cambio a de euros a yenes es: "+cambio);
                    break;
                }
            default:
                break;
        }
        /*
        if (moneda.equals("libras")){
            double cambio = euro * 0.86;
            System.out.println("El cambio a de euros a libras es "+cambio);
        }else if(moneda.equals("dolares")){
            double cambio = euro * 1.28611;
            System.out.println("El cambio a de euros a dolares es: "+cambio);
        }else if(moneda.equals("yenes")){
            double cambio = euro * 129.852;
            System.out.println("El cambio a de euros a yenes es: "+cambio);
        }
         */
    }
}
