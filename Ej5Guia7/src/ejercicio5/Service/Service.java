/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Service;

import ejercicio5.Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta c = new Cuenta();
    double saldo, retiro, ingreso, n20;
    String op;
    
    public void crearCuenta() {

        System.out.println("Ingrese el número de cuenta a crear: ");
        c.setNroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI: ");
        c.setDNI(leer.nextLong());
        System.out.println("Ingrese su saldo actual: ");
        c.setSaldo(leer.nextInt());
               
    }       

    public void ingresar() {
        
        System.out.println("Ingrese el saldo: ");
        ingreso = leer.nextDouble();
        c.setSaldo(c.getSaldo() + (int)ingreso);

    }
    
    public void retirar(){
        System.out.println("Ingrese la cantidad a retirar: ");
        retiro = leer.nextDouble();
        if(retiro > c.getSaldo()){
            System.out.println("Usted retiro "+c.getSaldo() + "y tu cuenta quedo en 0.");
            c.setSaldo(0);
        }else{
            System.out.println("Usted retiro: "+retiro);
            c.setSaldo(c.getSaldo()-(int)retiro);
        }
    }
    
    public void extraccionRapida(){
        n20 = c.getSaldo()*0.20;
        System.out.println("El limite a retirar es: "+n20);
        System.out.println("Desea retirarlos? S/N");
        op = leer.next();
        op = op.toUpperCase();
        if(op.equals("S")){
            System.out.println("Usted solo puede retirar el 20% = "+(c.getSaldo()*0.20));
            n20 = c.getSaldo()*0.20;
            c.setSaldo(c.getSaldo()-(int)n20);
        }else{
            System.out.println("---Operacion cancelada---");
        }
        
    }
    
    public void consultarSaldo(){
        System.out.println("Tu saldo actual es: "+c.getSaldo());
    }
    
    public void consultarDatos(){
        System.out.println("Tu numero de cuenta es: "+c.getNroCuenta());
        System.out.println("Tu DNI es: "+c.getDNI());
    }
}
