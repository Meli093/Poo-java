/*Para finalizar podemos hacer un programa donde definamos un array
 *de alumnoslo ordenamos y lo mostramos por pantalla ordenado.
 */
package Interfaces;
public class TestOrdenar {
public static void main(String[] args) {
//definamos un array alumnos
Alumno arr[]={new Alumno("juan", 20,8.5)
        ,new Alumno("Pedro",18, 5.3)
                ,new Alumno("Alberto",19,4.6)
                        };
Util.ordenar(arr);//lo ordeno
//lo nuestro ordenado
for (int i = 0; i <arr.length; i++) {
    System.out.println(arr[i]);        
    }
}
}
