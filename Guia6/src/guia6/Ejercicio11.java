/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos número: ");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        String respuesta = "N";
        int opcion=0;
        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("SUMA = "+n1 + n2);
                    break;
                case 2:
                    System.out.println("RESTA = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION = "+n1 * n2);
                    break;
                case 4:
                    System.out.println("DIVISION = "+n1 / n2);
                    break;
                case 5:
                    leer.nextLine();//limpia buffer
                    System.out.println("¿Esta seguro que quiero salir?(S/N)");
                    respuesta = leer.nextLine();
            }
        } while (respuesta.equalsIgnoreCase("N"));

    }

}
