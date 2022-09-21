import Chinpokomons.Carnotron;
import Chinpokomons.Chinpokomon;
import Chinpokomons.Gallotronix;
import Chinpokomons.Zapato;
import Logger.Logger;
import Logger.Level;


public class Main {
    //Campo de batalla
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setLevel(Level.INFO);
        try{
            final Chinpokomon carnotron = new Carnotron();
            final Chinpokomon zapato = new Zapato();
            final Chinpokomon gallotronix = new Gallotronix();

            final CampoBatalla campoBatalla = new CampoBatalla(carnotron, zapato);
//            final CampoBatalla campoBatalla = new CampoBatalla(carnotron, gallotronix);
            campoBatalla.comenzarPelea();
        }catch (Error err){
            logger.error("Error en batalla " + err.getMessage());
        }
    }
}
