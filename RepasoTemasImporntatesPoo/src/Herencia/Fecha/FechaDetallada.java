package Herencia.Fecha;
public class FechaDetallada extends Fecha{
private static String meses[]={"enero","Febrero","Marzo","Abril","Mayo",
    "Junio","julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    @Override
    public String toString() {//retorna su presentacionmas detallada que la de su padre
        return getDia()+"de"+meses[getMes()-1]+"de"+getAno();
    }


}

