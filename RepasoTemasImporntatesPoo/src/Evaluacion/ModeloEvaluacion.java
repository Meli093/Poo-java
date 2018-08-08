package Evaluacion;
public class ModeloEvaluacion {
    
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws ValidarPorcentaje{
        float pParcial=cParcial.getPorcentaje();
        float pFinal=cFinal.getPorcentaje();
        
        if ((pParcial+pFinal)!=1.0f) throw new ValidarPorcentaje();
        
       
        
        float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+cFinal.getCalificacion()*cFinal.getPorcentaje();
        return calificacionFinal;
    }
    
}
