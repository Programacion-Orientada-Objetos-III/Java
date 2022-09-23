import Chinpokomons.Chinpokomon;
import Logger.Logger;


public class CampoBatalla {
    final Chinpokomon peleador1;
    final Chinpokomon peleador2;
    Chinpokomon nextPeleador;
    Chinpokomon nextDefensor;
    private Logger logger = new Logger().getLogger();

    //Metodo para cambiar el rol cuando termina un ataque (El atacante pasa a defender y viceversa)
    public void changeRole(){
        final Chinpokomon nextPeleadorAux = nextDefensor;
        final Chinpokomon nextDefensorAux = nextPeleador;
        this.nextPeleador = nextPeleadorAux;
        this.nextDefensor = nextDefensorAux;
    }
    public CampoBatalla(Chinpokomon peleador1, Chinpokomon peleador2) {
        this.peleador1 = peleador1;
        this.peleador2 = peleador2;
        this.nextPeleador = this.peleador1; //Comienza atacando el peleador 1
        this.nextDefensor = this.peleador2; //Comienza defendiendo el peleador 2
    }
    protected void comenzarPelea(){
        //Bucle que corta cuando uno de los dos peleadores se queda sin vida
        logger.info("La pelea comenzo!");
        while (!nextDefensor.getDeath() && !nextPeleador.getDeath()){
            nextPeleador.atacar(nextDefensor);
            this.changeRole();
        }
        //El peleador que este muerto en esta instancia sera el perdedor.
        if(peleador1.getDeath()){
            logger.info("El ganador es "+ peleador2.getNombre() + " con " + peleador2.getVida() +" de vida");
        }else{
            logger.info("El ganador es "+ peleador1.getNombre() + " con " + peleador1.getVida() +" de vida");
        }
    }
}
