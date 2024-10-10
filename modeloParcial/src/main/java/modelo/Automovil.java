 
package modelo;

import excepciones.ExcepcionAtributoInvalido;
import excepciones.ExcepcionTipoVehiculoInvalido;

public class Automovil extends VehiculoTerrestre {
    private short cantidadMarchas;
    private int cantidadPasajeros;

    public Automovil(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int cantidadPasajeros) throws ExcepcionAtributoInvalido, ExcepcionTipoVehiculoInvalido {
        super(cantidadRuedas, cantidadPuertas, color);

        // Validaciones de atributos
        if (cantidadRuedas <= 3) {
            throw new ExcepcionAtributoInvalido("Un automóvil debe tener al menos 4 rueda.");
        }
        if (cantidadPuertas <= 0) {
            throw new ExcepcionAtributoInvalido("Un automóvil debe tener al menos 1 puerta.");
        }
        if (cantidadMarchas <= 0) {
            throw new ExcepcionAtributoInvalido("El número de marchas debe ser positivo.");
        }
        if (cantidadPasajeros <= 0) {
            throw new ExcepcionAtributoInvalido("La cantidad de pasajeros debe ser positiva.");
        }

        // Validación de tipo de vehículo
        if (cantidadPuertas > 5) {
            throw new ExcepcionTipoVehiculoInvalido("Un automóvil no puede tener más de 5 puertas.");
        }

        this.cantidadMarchas = cantidadMarchas;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de marchas: " + cantidadMarchas + ", Cantidad de pasajeros: " + cantidadPasajeros;
    }
}
