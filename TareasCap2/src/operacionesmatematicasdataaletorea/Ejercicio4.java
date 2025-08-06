package operacionesmatematicasdataaletorea;

import java.util.Random;

// Calcular el periodo de un pendulo
public class Ejercicio4 {

    public static void main(String[] args) {
        final var random = new Random();
        final var longitud = RandomUtilities.generarRandomDouble(5,16,random);
        final var gravedad = 9.81;

        final var periodo = 2 * Math.PI * Math.sqrt(longitud/gravedad);
        System.out.printf("Para un pendulo de longitud %.2f tendra un periodo de %.3f", longitud, periodo);
    }
}
