/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.Entidad.Libro;
import ejercicio1.Service.Service;

/**
 *
 * @author Pablo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Service cargar = new Service();
        Libro primerLibro = cargar.CargarDatos();
        System.out.println(primerLibro);
        
    }
}
