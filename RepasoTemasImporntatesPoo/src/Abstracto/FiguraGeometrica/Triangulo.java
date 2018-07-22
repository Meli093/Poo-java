package Abstracto.FiguraGeometrica;
public class Triangulo extends FiguraGeometrica{
private double base;
private  double altura;

    public Triangulo(double b, double a) {
        base = b;
        altura = a;
    }
    public double area(){
    return base*altura/2;
    }
}
