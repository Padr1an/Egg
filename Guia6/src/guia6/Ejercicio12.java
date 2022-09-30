/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;
        int incorrec = 0, correc = 0, longitud;

        do {
            System.out.println("-- Maximo 5 caracteres --");
            System.out.print("Ingrese una frase: ");
            
            frase = sc.nextLine();
            
            longitud=frase.length();//guardo la longitud de la frase
            
            if (frase.substring(0, 1).equalsIgnoreCase("X") && frase.substring(longitud-1).equalsIgnoreCase("O") && frase.length() <= 5) { //nombreDelString.substring (carácter Inicial Incluido, carácter Final Excluido)
                
                correc++; // correc = correc + 1;
                
                
            } else if (!"&&&&&".equals(frase)) {
                
                incorrec++;
                
            }
        } while (!"&&&&&".equals(frase));//Dentro del bucle no se puede definir variables
        
        System.out.println("Lecturas correctas: "+correc);
        System.out.println("Lecturas incorrectas: "+incorrec);
    }

}
