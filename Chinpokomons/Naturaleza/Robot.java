package Chinpokomons.Naturaleza;

import Chinpokomons.Chinpokomon;

public class Robot extends  Naturaleza implements INaturaleza{
    private String name = "Robot";
    public boolean tieneVentajaContra(Naturaleza naturaleza){
        return naturaleza.getName() == "Animal";
    }
    public String getName(){
        return this.name;
    }
}
