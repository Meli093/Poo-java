/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructoresAbstractas;

/**
 *
 * @author MR
 */
public class Circulo extends FiguraGeometrica{
private int radio;    

    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
    //retorno"Pi por radio al cuadrado"
  return Math.PI*Math.pow(radio, 2);
    }
    
}
