package operacionesmatematicas;

// Calcular el area de un trapecio
public class Ejercicio3 {

    public static void main(String[] args) {
        final var a = 12.75;
        final var b = 25.00;
        final var h = 7.5;

        final var area = 0.5 * (a + b) * h;
        System.out.printf("El area del trapecio con lado 1 %.2f, lado 2 %.2f, y altura %.2f es %.2f", a, b, h, area);
    }
}
