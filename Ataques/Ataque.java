package ejercicio2.Ataques;

import ejercicio2.Chinpokomons.Chinpokomon;

public abstract class Ataque {
    private int damage;

    public Ataque() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void realizarAtaque(Chinpokomon chinpokomon) {
        chinpokomon.dealDamage(this.getDamage());
    }
}
