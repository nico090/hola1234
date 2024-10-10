
package modelo;

public abstract class VehiculoTerrestre {
    protected short cantidadRuedas;
    protected short cantidadPuertas;
    protected Colores color;

    public VehiculoTerrestre(short cantidadRuedas, short cantidadPuertas, Colores color) {
        this.cantidadRuedas = cantidadRuedas;
        this.cantidadPuertas = cantidadPuertas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" + "cantidadRuedas=" + cantidadRuedas + ", cantidadPuertas=" + cantidadPuertas + ", color=" + color + '}';
    }


}