package ar.com.xeven;

public class Mamifero extends Animal{
    //atributos
    private String tipo;
    private String nombre;
    private Integer edad;
    private  boolean vacunado;

    //constructor
    public Mamifero(String tipo, String nombre, Integer edad, boolean vacunado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    //getters y setters
    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", vacunado=" + vacunado +
                '}';
    }
}
