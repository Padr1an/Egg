/*
  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.
 */
package guia6;

import java.util.Scanner;

/**
 * * @author Pablo
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	System.out.print("Ingrese una frase: ");
	String frase = sc.nextLine();
        
        if (frase.substring(0,1).equals("A")){ //nombreDelString.substring (carácter Inicial Incluido, carácter Final Excluido)
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
