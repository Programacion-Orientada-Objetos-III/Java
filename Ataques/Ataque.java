package Ataques;

import Chinpokomons.Chinpokomon;

public abstract class Ataque {
    private int damage;
    private boolean addsHealth2attacker;
    private int extraDamage;
    public Ataque(){
    }

    public void setExtraDamage(int extraDamage) {
        this.extraDamage = extraDamage;
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

    public void realizarAtaque(Chinpokomon chinpokomonAtacante, Chinpokomon chinpokomonDefensor ) {
        //Si el atacante tiene ventaja suma daño extra el ataque.
        final int damage = getDamage() + (chinpokomonAtacante.getNaturaleza().tieneVentajaContra(chinpokomonDefensor.getNaturaleza()) ? extraDamage : 0);
        if(addsHealth2attacker){
            chinpokomonAtacante.addLife(damage);
        }else{
            chinpokomonDefensor.dealDamage(damage);
        }
    }
}
