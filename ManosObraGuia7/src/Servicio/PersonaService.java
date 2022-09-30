/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import pooej01.Entidad.Persona;

/**
 *
 * @author Pablo
 */
public class PersonaService {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        Persona personaCompleta = new Persona();

        System.out.println("Ingrese el nombre de la persona");

        personaCompleta.setNombre(leer.next());
        
        System.out.println("Ingrese el apellido de la persona");

        personaCompleta.setApellido(leer.next());
        
        System.out.println("Ingrese la edad de la persona");

        personaCompleta.setEdad(leer.nextInt());
        
        return personaCompleta;
    }

}
