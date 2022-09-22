package Ataques;

import Chinpokomons.Chinpokomon;

import java.util.Random;

public class CañonConico extends Ataque{
    public CañonConico() {
        this.setDamage(4);
        this.setAddsHealth2attacker(false);
        this.setExtraDamage(1);
    }
    @Override
    public void realizarAtaque(Chinpokomon chinpokomonAtacante,Chinpokomon chinpokomonDefensor){
        final Random random = new Random();
        //1 Posibilidad entre 10 de que sea true (10%)
        final Boolean golpeCritico = random.nextInt(11) == 5;

        if(golpeCritico){
            chinpokomonDefensor.dealDamage(chinpokomonDefensor.getVida()/2);
        }
        super.realizarAtaque(chinpokomonAtacante,chinpokomonDefensor);

    }
}
