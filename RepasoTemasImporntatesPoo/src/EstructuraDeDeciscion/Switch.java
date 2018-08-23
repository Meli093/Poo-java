/*switch
 * sirve para saber cuyo valor sea igual y se accionardesde un punto  de sentencia
 *break es el que lleva el control del programa hasta la llave de switch
*el break sirve para finalizar cada case
 */
package EstructuraDeDeciscion;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Ingesa un dia de la semana(numero):");    
int v=scanner.nextInt();
String dia;
switch (v){//switch permite decidir entre diferentes opciones(siempre deben de ser numericas
case 1:
dia="lunes";
break;
case 2:
dia="Martes";
break;
case 3:
dia="Miercoles";
break;
case 4:
dia="Jueves";
break;
case 5:
dia="Viernes";
break;
case 6:
dia="Sabado";
break;
case 7:
dia="Domingo";
break;
default:
dia="Dia incorrecto..el valor debe de ser entre 1 y 7";    
}
    System.out.println(dia);
}
    
}
