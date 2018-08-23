//PREGUNTAR SI  ES IGUAL A CERP
package EstructuraDeDeciscion;

import java.util.Scanner;

public class ParOImpar2 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Ingresa un valor");
int v=scanner.nextInt();
//vamos a dividir por 2
int resto= v % 2;
//utilizaremos un if in-line
String mssg =(resto==0)?"ES PAR":"ES IMPAR";
//MUESTRO RESULTADO
System.out.println(v+""+mssg);
}
    
}
