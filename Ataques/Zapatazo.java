package Ataques;

import Chinpokomons.Chinpokomon;

import java.util.Random;

public class Zapatazo extends Ataque{
    public Zapatazo() {
        this.setDamage(1);
        this.setAddsHealth2attacker(false);
        this.setExtraDamage(3);
    }
    @Override
    public void realizarAtaque(Chinpokomon chinpokomonAtacante,Chinpokomon chinpokomonDefensor){
        final Random random = new Random();
        //El metodo nextBoolean nos da un 50% de probabilidad de que salga true o false.
        if(random.nextBoolean()){
            chinpokomonDefensor.dealDamage(this.getDamage());
        }
        super.realizarAtaque(chinpokomonAtacante,chinpokomonDefensor);

    }

}
