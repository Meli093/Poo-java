/*Clase y Objetos
 *Todos los objetos de una misma clase podran almacenar el mismo tipo de informacion
 * y tendran la misma capacidad para manipular
 */
package ClasesyObjetos;

/**
 *
 * @author MR
 */
public class Fecha {
private int dia;
private int mes;
private int anio;

    public int getDia() {
        return dia;//retorna el valor de la varible dia
    }

    public void setDia(int dia){
        this.dia = dia;//asigna el valor del parametro a la variable dia
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
