/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.Service.Service;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Service cuenta = new Service();
        
        int num;
        
        do {            
            System.out.println("----------");
            System.out.println("---MENU---");
            System.out.println("1.Crear Cuenta \n"
                    + "2.Ingresar Saldo \n"
                    + "3.Retirar \n"
                    + "4.Extracion Rapida \n"
                    + "5.Consultar Saldo \n"
                    + "6.Consultar Datos \n"
                    + "7.Salir");
            System.out.println("----------");
            num = leer.nextInt();
            switch(num){
                case 1:
                    cuenta.crearCuenta();
                    break;
                case 2:
                    cuenta.ingresar();
                    break;
                case 3:
                    cuenta.retirar();
                    break;
                case 4:
                    cuenta.extraccionRapida();
                    break;
                case 5:
                    cuenta.consultarSaldo();
                    break;
                case 6:
                    cuenta.consultarDatos();
                    break;
                case 7:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta.");
            }
                    
        } while (num != 7);
        
    }
    
}
