package ejercicio2;

import ejercicio2.Chinpokomons.Carnotron;
import ejercicio2.Chinpokomons.Chinpokomon;
import ejercicio2.Chinpokomons.Gallotronix;
import ejercicio2.Chinpokomons.Zapato;

public class main {

    //Campo de batalla
    public static void main(String[] args) {
        try{
            final Chinpokomon carnotron = new Carnotron();
            final Chinpokomon zapato = new Zapato();
            final Chinpokomon gallotronix = new Gallotronix();

            final CampoBatalla campoBatalla = new CampoBatalla(carnotron, zapato);
//            final CampoBatalla campoBatalla = new CampoBatalla(carnotron, gallotronix);

            campoBatalla.comenzarPelea();
        }catch (Error err){
            System.out.println("Error en batalla " + err.getMessage());
        }

    }
}
