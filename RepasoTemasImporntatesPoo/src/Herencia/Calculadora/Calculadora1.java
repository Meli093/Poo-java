package Herencia.Calculadora;
/**
 *
 * @author MR
 */
//extends permite inmplementar la herencia de las clases.
public class Calculadora1 extends CalculadoraBase{
public int factorial(int n){
int f=1;
while(n>1){
f=f*n--;    
}
return f;
}
public boolean esPrimo(int n){
boolean primo=true;
int k=1;
while(n>1){
if (n%k<n) {
primo=false;
break;
    }
    }
return primo;
}
}
