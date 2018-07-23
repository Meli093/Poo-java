/*Nota Todos los metodos estaticos pueden invocarse directamente
 *sobre las clases sin necesidad de instancias como vemos en la clase FiguraGeometrica
* Asi para poder asi calcucar del area.
 */
package ConstructoresAbstractas;

/**
 *
 * @author MR
 */
public class TestFigura {
public static void main(String[] args) {
Circulo c=new Circulo(4);
Rectangulo r=new Rectangulo(10, 5);
Triangulo t=new Triangulo(3, 6);
    System.out.println(c);    
    System.out.println(r);
    System.out.println(t);
}        
    }
    

