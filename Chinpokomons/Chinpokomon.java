package Chinpokomons;

import Ataques.Ataque;
import Chinpokomons.Naturaleza.Naturaleza;
import Logger.Logger;

import java.util.List;

public abstract class Chinpokomon implements ChinpokomonActions {
    private Integer vida;
    private String nombre;
    private Boolean isDeath;
    private List<Ataque> ataques;
    private Logger logger = new Logger().getLogger();
    private Naturaleza naturaleza;

    public Chinpokomon() {
        this.isDeath = false;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Boolean getDeath() {
        return isDeath;
    }

    public void setDeath(Boolean death) {
        isDeath = death;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Naturaleza getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(Naturaleza naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void addLife(int life) {
        setVida(getVida() + life);
    }

    //Recibir ataque y si la vida llega a 0 morir.
    public void dealDamage(int damage) {
        if (this.getVida() - damage < 0) {
            setDeath(true);
            this.setVida(0);
            logger.info("El Chinpokomon " + this.getNombre() + " murio");
        } else {
            this.setVida(this.vida - damage);
            logger.debug("El Chinpokomon " + this.getNombre() + " tiene " + this.getVida() + " de vida");
        }
    }

    //Atacar a otro chinpokomon.
    public void atacar(Chinpokomon chinpokomonDefensor) {
        final int max = this.getAtaques().size() - 1;
        final int random = (int) Math.floor(Math.random() * (max + 1));
        final Ataque ataque = this.getAtaques().get(random);

        ataque.realizarAtaque(this, chinpokomonDefensor);
    }
}
