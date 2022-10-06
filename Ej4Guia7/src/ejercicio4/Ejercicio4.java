/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.Entidad.Rectangulo;
import ejercicio4.Service.Service;

/**
 *
 * @author Pablo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Service hacerRec = new Service();
        
        Rectangulo primerRec = hacerRec.crearRectangulo();
        
        hacerRec.superficie(primerRec);
        hacerRec.perimetro(primerRec);
        hacerRec.dibujar(primerRec);
        
    }
    
}
