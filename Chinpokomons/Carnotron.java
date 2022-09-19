package ejercicio2.Chinpokomons;

import ejercicio2.Ataques.Ataque;
import ejercicio2.Ataques.CañonConico;
import ejercicio2.Ataques.RayoVeloz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carnotron extends Chinpokomon implements ChinpokomonActions{

    public Carnotron() {
        this.setVida(20);
        this.setNombre("Carnotron");
        final List<Ataque> ataques = new ArrayList<>();
        final CañonConico cañonConico = new CañonConico();
        final RayoVeloz rayoVeloz = new RayoVeloz();
        ataques.add(cañonConico);
        ataques.add(rayoVeloz);
        this.setAtaques(ataques);
    }

}
