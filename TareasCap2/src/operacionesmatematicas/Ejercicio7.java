package operacionesmatematicas;

// Calcular media geometrica
public class Ejercicio7 {

    public static void main(String[] args) {
        final var x1 = 75.12;
        final var x2 = 19.25;
        final var x3 = 10.38;
        final var x4 = 85.12;

        final var producto = x1 * x2 * x3 * x4;
        final var mediaGeometrica = Math.pow(producto, 0.25);

        System.out.printf("La media geométrica de %.2f, %.2f, %.2f y %.2f es %.5f",
                x1, x2, x3, x4, mediaGeometrica);
    }
}
