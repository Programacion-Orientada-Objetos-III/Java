package ejercicio2;

import ejercicio2.Chinpokomons.Chinpokomon;

public class CampoBatalla {
    final Chinpokomon peleador1;
    final Chinpokomon peleador2;
    Chinpokomon nextPeleador;
    Chinpokomon nextDefensor;

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
        while (!nextDefensor.getDeath() && !nextPeleador.getDeath()){
            nextPeleador.atacar(nextDefensor);
            this.changeRole();
        }
        //El peleador que este muerto en esta instancia sera el perdedor.
        if(peleador1.getDeath()){
            System.out.println("El ganador es "+ peleador2.getNombre() + " con " + peleador2.getVida() +" de vida");
        }else{
            System.out.println("El ganador es "+ peleador1.getNombre() + " con " + peleador1.getVida() +" de vida");
        }
    }
}
