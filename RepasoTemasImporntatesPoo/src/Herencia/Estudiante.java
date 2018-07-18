/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
