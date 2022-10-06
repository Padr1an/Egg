/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.service;

import ejercicio3.entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Service {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion guardarNumero = new Operacion();
        System.out.println("Ingrese un número: ");
        guardarNumero.setNumero1(leer.nextInt());
        System.out.println("Ingrese otro número: ");
        guardarNumero.setNumero2(leer.nextInt());
        
        return guardarNumero;
    }
    
    public int sumar(Operacion guardarNumero){
        
        int suma = guardarNumero.getNumero1() + guardarNumero.getNumero2();
        
        return suma;
    }
    
    public int restar(Operacion guardarNumero){
        
        int resta = guardarNumero.getNumero1() - guardarNumero.getNumero2();
        
        return resta;
    }
    
    public int multiplicar(Operacion guardarNumero){
        
        if (guardarNumero.getNumero1() == 0 || guardarNumero.getNumero2() == 0){
            
            
            System.out.println("Error - algunos de los números es 0.");
            
            return 0;
            
        }else{
            
            int multip = guardarNumero.getNumero1() * guardarNumero.getNumero2();
            
            return multip;
            
        }
    }
    
    public double dividir(Operacion guardarNumero){
        
        if (guardarNumero.getNumero2() != 0){
            
            int divi = guardarNumero.getNumero1() / guardarNumero.getNumero2();
            
            return divi;
            
        }else{
            
            System.out.println("Error - no existe la division por 0.");
            
            return 0;
            
        }
    }
}
