import Chinpokomons.*;
import Logger.Logger;
import Logger.Level;


public class Main {
    //Campo de batalla
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setLevel(Level.DEBUG);
        try{
            final Chinpokomon carnotron = new Carnotron();
            final Chinpokomon zapato = new Zapato(false);
            final Chinpokomon gallotronix = new Gallotronix();
            final Chinpokomon zapatovPOWER = new Zapato(true);
            final CampoBatalla campoBatalla = new CampoBatalla(zapatovPOWER, zapato);
            campoBatalla.comenzarPelea();
        }catch (Error err){
            logger.error("Error en batalla " + err.getMessage());
        }
    }
}
