/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.Service;

import ejercicio2.Entidad.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Service {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia valorRadio = new Circunferencia();
        System.out.println("Ingrese el radio");
        valorRadio.setRadio(leer.nextDouble());
        
        return valorRadio;
    }
    
    public double Area(Circunferencia valorRadio){
        
        //double area = PI * (valorRadio.getRadio()*valorRadio.getRadio());
        double area = Math.PI * Math.pow(valorRadio.getRadio(), 2);
        return area;
    }
    
    public double perimetro(Circunferencia valorRadio){
        
        double perimetro = 2 * PI * valorRadio.getRadio();
        
        return perimetro;
    }
    
}
