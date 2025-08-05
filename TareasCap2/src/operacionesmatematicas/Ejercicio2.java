package operacionesmatematicas;

// Calcular el area de un triangulo
public class Ejercicio2 {

    public static void main(String[] args) {
        final var b = 25.12;
        final var h = 32.32;

        final var area = 0.5 * b * h;
        System.out.printf("El area del triangulo con base %.2f y altura %.2f es %.2f", b, h, area);
    }
}
