package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Refugio {
    //atributos
    private List<Mamifero> mamiferos;
    private List<Reptil> reptiles;

    //constructor
    public Refugio(){
        mamiferos = new ArrayList<>();
        reptiles = new ArrayList<>();
    }

    //getters y setters
    //mamiferos
    public List<Mamifero>  getMamiferos(){
        return mamiferos;
    }
    public void setMamiferos(List<Mamifero> mamiferos){
        this.mamiferos = mamiferos;
    }

    //reptiles
    public List<Reptil> getReptiles(){
        return reptiles;
    }
    public void setReptiles(List<Reptil> reptiles){
        this.reptiles = reptiles;
    }


    public void agregarMamifero(Mamifero mamifero) {
        mamiferos.add(mamifero);
    }


}
