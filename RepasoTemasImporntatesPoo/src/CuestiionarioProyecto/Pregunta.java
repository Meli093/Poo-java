package CuestiionarioProyecto;

import java.util.ArrayList;

public class Pregunta {
 private String titulo; 
 private ArrayList<Opcion>opciones;

    public Pregunta(String titulo) {
        this.titulo = titulo;
    }

    public Pregunta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
