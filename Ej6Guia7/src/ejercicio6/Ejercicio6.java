/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.Service.Service;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Service sc = new Service();
        
        int num;
        
        do {            
            System.out.println("----------");
            System.out.println("---MENU---");
            System.out.println("1.Capacidad Maxima \n"
                    + "2.Llenar cafetera \n"
                    + "3.Servir taza \n"
                    + "4.Vaciar cafetera \n"
                    + "5.Rellenar cafetera \n"
                    + "6.Salir");
            System.out.println("----------");
            num = leer.nextInt();
            switch(num){
                case 1:
                    sc.capacidadMax();
                    break;
                case 2:
                    sc.llenarCafetera();
                    break;
                case 3:
                    sc.servirTaza();
                    break;
                case 4:
                    sc.vaciarCafetera();
                    break;
                case 5:
                    sc.agregarCafetera();
                    break;
                case 6:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta.");
            }
                    
        } while (num != 6);
        
    }
    
}
