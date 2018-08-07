package FigurasGeometrica;

import java.util.ArrayList;

/**
 *
 * @author MR
 */
public class AplicacionFiguritasGeometrica {
    public static void main(String[] args) {
        
    
	
	//ver area circulo     
        Circulo c = new Circulo();
       c.setRadio(3);
       Triangulo t=new Triangulo(2, 3);
       Cuadrado cu=new Cuadrado();
       cu.setLongitudLado(2);
        ArrayList<Figuritas> figuras=new ArrayList<Figuritas>();
        figuras.add(c);
        figuras.add(t);
        figuras.add(cu);
        for(Figuritas f:figuras){
            
                    System.out.println("Area "+f.CalcularArea());
        }
     
    }    
}
