package Chinpokomons;

import Ataques.Ataque;
import Ataques.Zapatazo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zapato extends Chinpokomon implements ChinpokomonActions{
    public Zapato(){
        this.setVida(20);
        this.setNombre("Zapato");
        final List<Ataque> ataques = new ArrayList<>();
        final Ataque zapatazo = new Zapatazo();
        ataques.add(zapatazo);
        this.setAtaques(ataques);
    }

}
