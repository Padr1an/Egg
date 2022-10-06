/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.Entidad.Circunferencia;
import ejercicio2.Service.Service;

/**
 *
 * @author Pablo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Service sc = new Service();
        Circunferencia primerCirculo = sc.crearCircunferencia();
        System.out.println("Area: "+sc.Area(primerCirculo));
        System.out.println("Perimetro: "+sc.perimetro(primerCirculo));
        
    }
    
}
