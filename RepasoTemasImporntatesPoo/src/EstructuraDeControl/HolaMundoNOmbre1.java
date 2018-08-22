/*El siguiente programa pide al usaurio su nombre,edad y altura.
 * Estos datos deben ingresar separados por un espacio en blanco.
 * Luego los muestra por consola.
 */
package EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author MR
 */
public class HolaMundoNOmbre1 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
//mensaje para el usuario
System.out.println("ingresa nombre edad altura :");
//leemos el nombre
String nom=scanner.next();
//leemos la edad 
int edad=scanner.nextInt();
//leemos la altura
double altura=scanner.nextDouble();
//mostramos los datos por consola
//Como al final no enseña como concatenar datos de diferentes tipos para emitir la salida del programa
System.out.println("\nNombre :"+nom+"\nEdad"+edad+"\nAltura"+altura);
}
    
}
