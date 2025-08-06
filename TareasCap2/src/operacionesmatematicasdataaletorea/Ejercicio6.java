package operacionesmatematicasdataaletorea;

import java.util.Random;

// Promedio ponderado con peso
public class Ejercicio6 {

    public static void main(String[] args) {
        final var random = new Random();
        final var x = RandomUtilities.generarRandomDouble(10, 26, random);
        final var y = RandomUtilities.generarRandomDouble(15, 33, random);
        final var z = RandomUtilities.generarRandomDouble(2, 13, random);
        final var p1 = RandomUtilities.generarRandomDouble(1, 3, random);
        final var p2 = RandomUtilities.generarRandomDouble(1, 4, random);
        final var p3 = RandomUtilities.generarRandomDouble(1, 3, random);

        final var numerador = x * p1 + y * p2 + z * p3;
        final var denominador = p1 + p2 +p3;

        final var promedioPonderado = numerador / denominador;

        System.out.printf("El promedio ponderado es %.3f", promedioPonderado);
    }
}