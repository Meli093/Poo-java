package Abstracto.FiguraGeometrica;
public class Circulo extends FiguraGeometrica{
private int radio;    

    public Circulo(int r) {
    radio =r;
    }
    public double area(){
    //retorno"Pi por radio al cuadrado"
  return Math.PI*Math.pow(radio, 2);
    }
}
    