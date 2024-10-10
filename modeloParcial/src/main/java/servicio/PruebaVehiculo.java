/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package servicio;
import excepciones.ExcepcionAtributoInvalido;
import excepciones.ExcepcionTipoVehiculoInvalido;
import modelo.Moto;
import modelo.Automovil;
import modelo.Colores;
import modelo.Camion;

public class PruebaVehiculo {
    public static void main(String[] args) {
        try {
             
            Camion camion = new Camion((short) 6, (short) 2, Colores.ROJO, (short) 5, 2000);
            Automovil automovil = new Automovil((short) 4, (short) 4, Colores.BLANCO, (short) 6, 5);
            Moto moto = new Moto((short) 2, (short) 0, Colores.AZUL, (short) 600);

             
            System.out.println(camion);
            System.out.println(automovil);
            System.out.println(moto);
        } catch (ExcepcionAtributoInvalido e) {
            System.out.println("Error de atributo: " + e.getMessage());
        } catch (ExcepcionTipoVehiculoInvalido e) {
            System.out.println("Error de tipo de vehículo: " + e.getMessage());
        }
    }
}