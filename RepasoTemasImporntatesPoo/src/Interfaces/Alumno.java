/*Abtraccion a traves de interface
 * las interface ayudan a incrementar el nivel de abstraccion tanto como sea necesario
permita en tener multiples "vistas" de una misma clase.
 * http://puntocomnoesunlenguaje.blogspot.com/2014/04/java-excepciones.html
 * 
 */
package Interfaces;

/**
 *
 * @author MR
 */
public class Alumno implements Comparable<Alumno>{
private String nombre;
private int edad;
private double notaPromedio;

    public Alumno(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }
    //metodo heredado de la interface Comparable
    
    public int compareTo(Alumno otroAlumno) {
    return this.edad-otroAlumno.edad;
    }
    public String toString(){
    return nombre+","+edad+","+notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }
}
