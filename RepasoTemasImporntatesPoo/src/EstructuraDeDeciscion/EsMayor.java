/*la estructura de decision que vamos a ver es el if.
 * comenzaremos analizando la setencia if cuya estructura es la siguiente codigo.
 *DETERMINAREMOS EL VALOR  DE EDAD INGRSADO POR EL USUARIO ES MAYOR
* O IGUAL QUE 21
 */
package EstructuraDeDeciscion;

import java.util.Scanner;

/**
 *
 * @author MR
 */
public class EsMayor {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Ingresa a su edad");
int edad=scanner.nextInt();
    if (edad>=22) {
        System.out.println("Ya eres mayor");    
    }
    else
    {
        System.out.println("Eres un niño todabia");    
    }

}
    
}
