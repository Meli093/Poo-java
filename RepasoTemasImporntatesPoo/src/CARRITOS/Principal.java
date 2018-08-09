package CARRITOS;

import java.util.Scanner;

public class Principal {//este metodo le pertenece a la clase
public static int indiceCocheMBarato(Vehiculo coches[]){//esto es un arreglo
 float precio;
 int indice=0;
 
 precio = coches[0].getPrecio();
    for (int i = 1; i <coches.length; i++) {
        if (coches[i].getPrecio()<precio) {
        precio =coches[i].getPrecio();
        indice=i;
        }}
    return indice;
}
        
public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    String marca,modelo;
    float precio;
    int numerodeVehiculos,indiceBarato;
    System.out.println("Digite el numero de  Vehiculos:");
    numerodeVehiculos=entrada.nextInt();
    //Creamos los objetos coches 
    Vehiculo Coches[]=new Vehiculo[numerodeVehiculos];
    for (int i = 0; i <Coches.length; i++) {
        entrada.nextLine();
        System.out.println("\n Digite las caracteristicas del coche "+(i+1)+":");     
        System.out.println("Introduzca la marca:");
        marca =entrada.nextLine();
        System.out.println("Introduzca el modelo:");
        modelo =entrada.nextLine();
        System.out.println("Introduzca el precio:");
        precio =entrada.nextFloat();
        
        Coches[i]=new Vehiculo(marca, modelo, precio);
    }
    indiceBarato=indiceCocheMBarato(Coches);
    System.out.println("\nEl coche mas barato es:");
    System.out.println(Coches[indiceBarato].mostrarDatos());
}}
