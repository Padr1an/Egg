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
        
        Service cargarRadio = new Service();
        Circunferencia primerCirculo = cargarRadio.crearCircunferencia();
        System.out.println("Area: "+cargarRadio.Area(primerCirculo));
        System.out.println("Perimetro: "+cargarRadio.perimetro(primerCirculo));
        
    }
    
}
