package ar.com.xeven;

import java.util.List;

public abstract class Animal {
    //atributos
    protected String collar;
    protected Integer numeroCollar;
    protected  List<Integer> horarioDeComidas;


    //getters y setters
    //collar
    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    //numeroCollar
    public Integer getNumeroCollar() {
        return numeroCollar;
    }

    public void setNumeroCollar(Integer numeroCollar) {
        this.numeroCollar = numeroCollar;
    }

    //horarioDeComidas
    public List<Integer> getHorarioDeComidas() {
        return horarioDeComidas;
    }

    public void setHorarioDeComidas(List<Integer> horarioDeComidas) {
        this.horarioDeComidas = horarioDeComidas;
    }
}
