package Cuadrilato;

/**
 *
 * @author MR
 */
import javax.swing.JOptionPane;
public class Principal {
public static void main(String[] args) {
Cuadrilatedo c1;
float  lado1,lado2;
lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado uno"));
lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado dos"));
    if (lado1==lado2) {
        c1=new Cuadrilatedo();
    }
    else{
    c1=new Cuadrilatedo(lado1, lado2);
    } 
    System.out.println("El area es :"+c1.getArea()+"el perimetro es:"+c1.getPerimetro());


}
    
}
