package TIPOEXA;

/**
 *
 * @author MR
 */
public class APlFgirasGeo {
    public static void main(String[] args) {
     Cuadrado cuadrado = new Cuadrado(2);   
    Triangulo triángulo = new Triangulo(3);
    
    cuadrado.calcularPerimetro();
    triángulo.calcularPerimetro();
    
    cuadrado.calcularArea();
    triángulo.calcularArea();
    System.out.println(triángulo.calcularArea() + 2) ;
    
    }
    
}
