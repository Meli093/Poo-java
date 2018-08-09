package FigurasGeometrica;
public class Cuadrado implements Figuritas{
private int longitudLado;    

    public Cuadrado() {
    }

    public Cuadrado(int longitudLado) {
        this.longitudLado = longitudLado;
    }
    public int getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(int longitudLado) {
        this.longitudLado = longitudLado;
    
    }

    @Override
    public double CalcularArea() {
longitudLado = (longitudLado* longitudLado);
        return longitudLado;
    }
public float getPerimetro(){
    float perimetro =2*(longitudLado+longitudLado);
    return perimetro;
   }
}

   
    
    

