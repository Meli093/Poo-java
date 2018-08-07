package FigurasGeometrica;

/**
 *
 * @author MR
 */
public class Circulo implements Figuritas{
private int radio;    

    public Circulo(int r) {
    radio =r;
    }

    Circulo() {
        }
    public double area(){
    //retorno"Pi por radio al cuadrado"
  return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double CalcularArea() {
        System.out.println("el area es:");    
    return area();
    
} 

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}     