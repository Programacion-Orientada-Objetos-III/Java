package Chinpokomons.Naturaleza;

import Chinpokomons.Chinpokomon;

public class Cosa extends Naturaleza implements INaturaleza{
    public boolean tieneVentajaContra(Naturaleza naturaleza){
        return naturaleza.getName() == "Robot";
    }
    public String getName(){
        return "Cosa";
    }
}
