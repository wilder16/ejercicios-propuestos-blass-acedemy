package operacionesmatematicasdataaletorea;

import java.util.Random;

// Calcular area de un paralelogramo
public class Ejercicio1 {

    public static void main(String[] args) {
        final var random = new Random();
        final var b = RandomUtilities.generarRandomDouble(5, 26, random);
        final var h = RandomUtilities.generarRandomDouble(10,33, random);

        final var area = b * h;
        System.out.printf("El area del paralelogramo con base %.2f y altura %.2f es %.2f", b, h, area);

    }
}
