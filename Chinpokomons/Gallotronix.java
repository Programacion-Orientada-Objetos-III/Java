package Chinpokomons;

import Ataques.Ataque;
import Ataques.GarraMecanica;

import java.util.ArrayList;
import java.util.List;

public class Gallotronix extends Chinpokomon implements ChinpokomonActions{

    public Gallotronix(){
        this.setVida(25);
        this.setNombre("Gallotronix");
        final List<Ataque> ataques = new ArrayList<>();
        final GarraMecanica garraMecanica = new GarraMecanica();
        ataques.add(garraMecanica);
        this.setAtaques(ataques);
    }

}
