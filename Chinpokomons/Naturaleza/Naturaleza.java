package Chinpokomons.Naturaleza;

import Chinpokomons.Chinpokomon;

public abstract class Naturaleza implements INaturaleza{
    private String name;
    public abstract String getName();
    public abstract boolean tieneVentajaContra(Naturaleza naturaleza);

}
