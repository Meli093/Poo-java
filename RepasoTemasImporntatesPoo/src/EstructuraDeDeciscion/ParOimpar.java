//EL SIGUIENTE CODIGO LE VAMOS A PEDIR AL USUARIO QUE INGRSE
//UN VALOR ENTERO E INDICA SI EL VALOR INGRESO PAR O MIPAR
package EstructuraDeDeciscion;
import java.util.Scanner;

public class ParOimpar {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("ingresa el primer valor :");
int v=scanner.nextInt();
//obtendremos el resto de divir v por 2
int resto=v%2;
//para preguntar por igual utilizamos==
if (resto==0) {
    System.out.println(v+"Es par");        
    }
else{
    System.out.println(v+"es impar");    
}
}
    
}
