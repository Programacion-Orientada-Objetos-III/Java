package Chinpokomons.Naturaleza;

import Chinpokomons.Chinpokomon;

public class Animal extends Naturaleza implements  INaturaleza{
    private String name = "Animal";
    public boolean tieneVentajaContra(Naturaleza naturaleza){
        return naturaleza.getName() == "Cosa";
    }
    public String getName(){
        return this.name;
    }
}
