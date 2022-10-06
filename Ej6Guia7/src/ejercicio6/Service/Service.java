/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.

 */
package ejercicio6.Service;

import ejercicio6.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Service {
    
    Scanner leer = new Scanner(System.in);
    Cafetera hacerCafe = new Cafetera();
    
    public Cafetera capacidadMax() {
        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        hacerCafe.setCapacidadMaxima(leer.nextInt());
        
        return hacerCafe;
    }
    
    public void llenarCafetera() {
        
        hacerCafe.setCantidadActual(hacerCafe.getCapacidadMaxima());
        
    }
    
    public void servirTaza() {
        
        System.out.println("Ingrese capacidad de la taza: ");
        int taza = leer.nextInt();
        
        if (hacerCafe.getCantidadActual() > taza) {
            hacerCafe.setCantidadActual(hacerCafe.getCantidadActual() - taza);
            System.out.println("Su cafe esta listo.");
        } else {
            System.out.println("La cantidad no alcanza para llenar la taza.");
            System.out.println("La taza se cargo con " + hacerCafe.getCantidadActual() + " ml.");
            hacerCafe.setCantidadActual(0);
        }
        
    }
    
    public void vaciarCafetera() {
        hacerCafe.setCantidadActual(0);
    }
    
    public void agregarCafetera() {
        System.out.println("Cantidad de cafe en la Cafetera " + hacerCafe.getCantidadActual());
        System.out.println("Ingrese cantidad de café:");
        int cafe = leer.nextInt();
        if (hacerCafe.getCapacidadMaxima() < (hacerCafe.getCantidadActual() + cafe)) {
            System.out.println("Se excede la capacidad máxima de la Cafetera");
        } else {
            hacerCafe.setCantidadActual(hacerCafe.getCantidadActual() + cafe);
        }
        
    }
}
