package ar.com.xeven;

public class Reptil extends Animal{
    //atributos
    private String tipo;
    private String nombre;
    private String tamanio;
    private  Integer edadEstimada;

    //constructor
    public Reptil(String tipo, String nombre, String tamanio, Integer edadEstimada) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.edadEstimada = edadEstimada;
    }

    //getters y setters
    public Integer getEdadEstimada() {
        return edadEstimada;
    }

    public void setEdadEstimada(Integer edadEstimada) {
        this.edadEstimada = edadEstimada;
    }
}
