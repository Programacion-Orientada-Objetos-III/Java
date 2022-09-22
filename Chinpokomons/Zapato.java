package Chinpokomons;

import Ataques.Ataque;
import Ataques.PomadaWassington;
import Ataques.Zapatazo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zapato extends Chinpokomon implements ChinpokomonActions{
    public Zapato(boolean isMultiAtacks){
        final int random = new Random().nextInt(10);
        this.setVida(20);
        this.setNombre("Zapato #"+ random);
        final List<Ataque> ataques = new ArrayList<>();
        ataques.add(new Zapatazo());
        if(isMultiAtacks)
            ataques.add(new PomadaWassington());
        this.setAtaques(ataques);
    }
}
