package ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        Refugio refugio = new Refugio();

        //agrego mamiferos
        refugio.agregarMamifero(new Mamifero("perro","dobby",4,false));
        refugio.agregarMamifero(new Mamifero("perro","fatiga",8,false));
        refugio.agregarMamifero(new Mamifero("gato","tesla",4,true));
        refugio.agregarMamifero(new Mamifero("gato","summer",4,true));

        System.out.println(refugio.getMamiferos());


    }
}
