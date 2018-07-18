package Herencia.Calculadora;

/**
 *
 * @author MR
 */
public class Aplicacion {
public static void main(String[] args) {
int n1=17,n2=6;
Calculadora1 calcu=new Calculadora1();
System.out.println("n1="+n1);
System.out.println("n2="+n2);
 System.out.println("\nSuma"+calcu.suma(n1, n2));    
    System.out.println("\nresta"+calcu.resta(n1, n2));
    System.out.println("facctorial de"+n2+"es"+calcu.factorial(n2));
    System.out.println(n1+"es primo"+calcu.esPrimo(n1));
}
    
}
