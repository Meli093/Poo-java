/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreEscrituraMiembros.Fecha;

/**
 *
 * @author MR
 */
public class TestFecha {
public static void main(String[] args) {
Fecha f=new Fecha();
f.setDia(2);
f.setMes(10);
f.setAnio(1970);
//imprimo el dia,mes,año 
System.out.println("Dia="+f.getDia()+"mes"+f.getMes()+"Añio"+f.getAnio());
//imprimimos la fecha
System.out.println(f);
}}
