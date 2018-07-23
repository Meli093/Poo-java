/*Una clase Abstracta no puede ser instanciada no implica que 
 *no pueda tener constructores.Si no definimosun constructor explicitamente
*igual exite un constructor nulo.
 */
package ConstructoresAbstractas;

/**
 *
 * @author MR
 */
public abstract class FiguraGeometrica {
 private String nombre;
 //metodo abstracto
 public abstract double area();
 //agregamos un constructor 
 public FiguraGeometrica(String nom){
 nombre=nom;    
 }
//ahora en el toString muestro tambien el nombre
 @Override
 public String toString(){
return nombre+"(area="+area()+")";
}
public String getNombre(){
return nombre;
}
public void setNombre(){
this.nombre=nombre;    
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
