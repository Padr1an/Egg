/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.Service;

import ejercicio4.Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Service {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese altura del Rectangulo");
        rec.setAltura(leer.nextInt());
        System.out.println("Ingrese base del Rectangulo");
        rec.setBase(leer.nextInt());
        
        return rec;
    }
    
    public void superficie(Rectangulo rec){
        System.out.println("La superficie del rectangulo es: "+(rec.getAltura()*rec.getBase()));
    }
    
    public void perimetro(Rectangulo rec){
        System.out.println("El perimetro del rectangulo es: "+((rec.getBase()+rec.getAltura())*2));
    }
    
    public void dibujar(Rectangulo rec){
        
        for (int i = 0; i <rec.getBase(); i++) {
            for (int j = 0; j <rec.getAltura(); j++) {
                if ((i==0 || i==rec.getBase()-1) || (j==0 || j==rec.getAltura()-1)){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
