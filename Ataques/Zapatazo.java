package ejercicio2.Ataques;

import ejercicio2.Chinpokomons.Chinpokomon;

import java.util.Random;

public class Zapatazo extends Ataque{
    public Zapatazo() {
        this.setDamage(1);
    }
    @Override
    public void realizarAtaque(Chinpokomon chinpokomon){
        final Random random = new Random();
        //El metodo nextBoolean nos da un 50% de probabilidad de que salga true o false.
        if(random.nextBoolean()){
            chinpokomon.dealDamage(this.getDamage());
        }
        super.realizarAtaque(chinpokomon);

    }

}
