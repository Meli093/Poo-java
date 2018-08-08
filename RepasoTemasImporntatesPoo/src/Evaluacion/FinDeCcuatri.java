package Evaluacion;
public class FinDeCcuatri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ValidarPorcentaje {
        //creamos un objeto de tipo examen parcial
        ExamenParcial eParcial=new ExamenParcial();
                    eParcial.setCalificacion(4);
                    eParcial.setPorcentaje(0.4f);
        ExamenFinal eFinal=new ExamenFinal();
                    eFinal.setCalificacion(4);
                    eFinal.setPorcentaje(0.6f);
        //creamos el modelo de evaluacion
                    ModeloEvaluacion modelo=new ModeloEvaluacion ();
                    System.out.println(modelo.evaluar(eParcial, eFinal));
                    
                    
    }
    
}
