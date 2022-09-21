package Ataques;

import Chinpokomons.Chinpokomon;

public abstract class Ataque {
    private int damage;
    private boolean addsHealth2attacker;
    public Ataque(){
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAddsHealth2attacker(boolean addsHealth2attacker) {
        this.addsHealth2attacker = addsHealth2attacker;
    }

    public boolean isAddsHealth2attacker() {
        return addsHealth2attacker;
    }

    public void realizarAtaque(Chinpokomon chinpokomon) {
        chinpokomon.dealDamage(this.getDamage());
    }
}
