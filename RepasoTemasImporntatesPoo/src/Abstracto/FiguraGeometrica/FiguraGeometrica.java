//la clases Abtractas podemo reconocer la exitencia de ciertos objetos que
//que sean el mismo elemento de una clase y que sus opreaciones realiza de manera muy diferente .
package Abstracto.FiguraGeometrica;

public abstract class FiguraGeometrica {

public abstract double area();

    @Override
    public String toString() {
        return "area="+area();
    }

    
    
}

    
    



