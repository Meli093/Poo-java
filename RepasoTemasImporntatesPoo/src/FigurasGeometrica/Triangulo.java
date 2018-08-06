
package FigurasGeometrica;

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


    //Càlcul àrea
    public double calculArea()
    {
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double CalcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    

