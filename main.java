import Chinpokomons.Carnotron;
import Chinpokomons.Chinpokomon;
import Chinpokomons.Gallotronix;
import Chinpokomons.Zapato;

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
