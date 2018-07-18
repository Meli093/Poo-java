/*
 *  heredan una clase base que heredaremos tanto los atributos como los métodos.
    mientras que los constructores son utilizados, pero no heredados
 */
package Herencia;

/**
 *
 * @author MR
 */
public class Estudiante extends Persona{
 int codigodeestudiante;
 float NotaFinal;

    public Estudiante(int codigodeestudiante, float NotaFinal, String Nombre, String Apellido, int edad) {
        super(Nombre, Apellido, edad);
        this.codigodeestudiante = codigodeestudiante;
        this.NotaFinal = NotaFinal;
    }
public void mostrarDatos(){
    System.out.println("\nNombre"+getNombre()+"\nApellido"+getApellido()+"\nedad"+getEdad()+
            "\nEl codigo de estudiante"+codigodeestudiante+"\nnotaFinal es:"+NotaFinal);    
}
}
