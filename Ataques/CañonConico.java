package ejercicio2.Ataques;

import ejercicio2.Chinpokomons.Chinpokomon;

import java.util.Random;

public class CañonConico extends Ataque{
    public CañonConico() {
        this.setDamage(4);
    }
    @Override
    public void realizarAtaque(Chinpokomon chinpokomon){
        final Random random = new Random();
        //1 Posibilidad entre 10 de que sea true (10%)
        final Boolean golpeCritico = random.nextInt(11) == 5;

        if(golpeCritico){
            chinpokomon.dealDamage(chinpokomon.getVida()/2);
        }
        super.realizarAtaque(chinpokomon);

    }
}
