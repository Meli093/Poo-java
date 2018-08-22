/*Entrada y Salida de datos por consoloa
*Esta compuesto por el modo text y el teclado que se ejecutara nuestro programa 
 *EL SIGUIENTE PROGRAMA NOS PIDE INGRESARSU NOMBREY LEER EL DATO POR TECLADO Y CONSOLA
 */
package EstructuraDeControl;

import java.util.Scanner;

public class HolaMundoNOmbre {
public static void main(String[] args) {
//esta clase permite ller datos por teclado
Scanner scanner=new Scanner(System.in);//la clase Scanner sirve para leer datos a traves del teclado
//mensaje para el usuario
System.out.println("ingresa su nombre:");
//leemos un valor entero por teclado
String nom= scanner.nextLine();
//mostramos un mensaje y luego el valor liedo
System.out.println("Hola mundo :"+nom);

}
    
}
