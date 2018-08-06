package TIPOEXA;

/**
 *
 * @author MR
 */
public class Triangulo extends Figura{
 private int base;   
 public Triangulo() {
    }
    public Triangulo(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public void calcularPerimetro() {
		int perimetro = base * 3;
		System.out.println("El perimetro del triangulo es :" + perimetro);
	}

   
}
