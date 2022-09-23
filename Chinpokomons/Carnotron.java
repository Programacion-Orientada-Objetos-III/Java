package Chinpokomons;

import Ataques.Ataque;
import Ataques.CañonConico;
import Ataques.RayoVeloz;
import Chinpokomons.Naturaleza.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carnotron extends Chinpokomon implements ChinpokomonActions{

    public Carnotron() {
        this.setVida(20);
        this.setNombre("Carnotron");
        this.setNaturaleza(new Robot());
        final List<Ataque> ataques = new ArrayList<>();
        final CañonConico cañonConico = new CañonConico();
        final RayoVeloz rayoVeloz = new RayoVeloz();
        ataques.add(cañonConico);
        ataques.add(rayoVeloz);
        this.setAtaques(ataques);
    }

}
