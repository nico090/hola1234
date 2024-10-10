
package modelo;

import excepciones.ExcepcionAtributoInvalido;
import excepciones.ExcepcionTipoVehiculoInvalido;


public class Moto extends VehiculoTerrestre {
    private short cilindrada;

    public Moto(short cantidadRuedas, short cantidadPuertas, Colores color, short cilindrada) throws ExcepcionAtributoInvalido, ExcepcionTipoVehiculoInvalido {
        super(cantidadRuedas, cantidadPuertas, color);

         
        if (cantidadRuedas < 2) {
            throw new ExcepcionAtributoInvalido("Una moto debe tener al menos 2 ruedas.");
        }
        if (cantidadPuertas != 0) {
            throw new ExcepcionTipoVehiculoInvalido("Una moto no debe tener puertas.");
        }
        if (cilindrada <= 0) {
            throw new ExcepcionAtributoInvalido("La cilindrada debe ser positiva.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + " cc";
    }
}
