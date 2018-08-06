/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TIPOEXA;

/**
 *
 * @author MR
 */
public class Cuadrado extends Figura{
int longitudLado;    

    public Cuadrado() {
    }

    public Cuadrado(int longitudLado) {
        this.longitudLado = longitudLado;
    }
    @Override
	public Double calcularArea() {
		double area = (double) (longitudLado * longitudLado);
		System.out.println("El area del cuadrado es :" + area);
		return area;
	}
	
	@Override
	public void calcularPerimetro() {
		int perimetro = 2*longitudLado;
		System.out.println("El perimetro del cuadrado es :" + perimetro);
	}
}
