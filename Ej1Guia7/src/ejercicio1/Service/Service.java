/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Service;

import ejercicio1.Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Service {
    
    public Libro CargarDatos(){
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");//
        
        Libro libroCompleto = new Libro();
        
        System.out.println("Ingrese el ISBN: ");
        libroCompleto.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el titulo del libro: ");
        libroCompleto.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor del libro: ");
        libroCompleto.setAutor(leer.next());
        
        System.out.println("Ingrese el Nº de paginas: ");
        libroCompleto.setNropag(leer.nextInt());
        
        return libroCompleto;
    }
    
}
