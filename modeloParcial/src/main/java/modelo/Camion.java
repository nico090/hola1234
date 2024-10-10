
package modelo;

import excepciones.ExcepcionAtributoInvalido;
import excepciones.ExcepcionTipoVehiculoInvalido;


public class Camion extends VehiculoTerrestre {
    private short cantidadMarchas;
    private int pesoCarga;

    public Camion(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int pesoCarga) throws ExcepcionAtributoInvalido, ExcepcionTipoVehiculoInvalido {
        super(cantidadRuedas, cantidadPuertas, color);

         
        if (cantidadRuedas < 4) {
            throw new ExcepcionAtributoInvalido("Un camión debe tener al menos 4 ruedas.");
        }
        if (cantidadPuertas <= 0) {
            throw new ExcepcionAtributoInvalido("Un camión debe tener al menos 1 puerta.");
        }
        if (cantidadMarchas <= 0) {
            throw new ExcepcionAtributoInvalido("El número de marchas debe ser positivo.");
        }
        if (pesoCarga <= 0) {
            throw new ExcepcionAtributoInvalido("El peso de carga debe ser positivo.");
        }

         
        if (cantidadPuertas > 4) {
            throw new ExcepcionTipoVehiculoInvalido("Un camión no puede tener más de 4 puertas.");
        }

        this.cantidadMarchas = cantidadMarchas;
        this.pesoCarga = pesoCarga;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de marchas: " + cantidadMarchas + ", Peso de carga: " + pesoCarga + " kg";
    }
}