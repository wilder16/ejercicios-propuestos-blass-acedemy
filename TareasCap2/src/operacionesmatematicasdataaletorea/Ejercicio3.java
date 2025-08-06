package operacionesmatematicasdataaletorea;

import java.util.Random;

// Calcular el area de un trapecio
public class Ejercicio3 {

    public static void main(String[] args) {
        final var random = new Random();
        final var a = RandomUtilities.generarRandomDouble(5,13, random);
        final var b = RandomUtilities.generarRandomDouble(10,26, random);
        final var h = RandomUtilities.generarRandomDouble(2,8, random);

        final var area = 0.5 * (a + b) * h;
        System.out.printf("El area del trapecio con lado 1 %.2f, lado 2 %.2f, y altura %.2f es %.2f", a, b, h, area);
    }
}
