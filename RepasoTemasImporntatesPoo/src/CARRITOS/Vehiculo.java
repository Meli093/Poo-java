package CARRITOS;
public class Vehiculo {
private String marca;
private String modelo;
private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
   
    }
    public String mostrarDatos(){
    return "Marca :"+marca+"Modelo :"+modelo+"\nPrecio:$"+precio+"\n";
    }
}