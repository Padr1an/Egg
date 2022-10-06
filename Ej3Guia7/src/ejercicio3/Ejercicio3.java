/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidad.Operacion;
import ejercicio3.service.Service;

/**
 *
 * @author Pablo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Service Op = new Service(); 
        
        Operacion primerCalculo = Op.crearOperacion();
        
        System.out.println("Suma: "+Op.sumar(primerCalculo));
        System.out.println("Resta: "+Op.restar(primerCalculo));
        System.out.println("Multiplicación: "+Op.multiplicar(primerCalculo));
        System.out.println("División: "+Op.dividir(primerCalculo));
        
    }
    
}
