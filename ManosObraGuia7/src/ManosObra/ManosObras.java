/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Servicio.PersonaService;
import pooej01.Entidad.Persona;

/**
 *
 * @author Pablo
 */
public class ManosObras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService persServicio = new PersonaService();
        
        Persona primeraPersona = persServicio.crearPersona();
        
        Persona segundaPersona = persServicio.crearPersona();
        
        System.out.println(primeraPersona);
        
        System.out.println(segundaPersona);
    }
    
}