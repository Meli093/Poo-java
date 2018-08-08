
package TIPOEXA;

import FigurasGeometrica.*;

/**
 *
 * @author MR
 */
public class Triangulo implements Figuritas{
//Atributoss
    private double base;
    private double altura;
    private double area;


    //Constructor
    public Triangulo (double base, double altura)
    {
        this. base = base;
        this.altura = altura;
    }


    //Càlcular àrea
    public double calculArea()
    {
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double CalcularArea() {
  return calculArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

   
}    

