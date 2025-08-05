package operacionesmatematicas;

// Promedio ponderado con peso
public class Ejercicio6 {

    public static void main(String[] args) {
        final var x = 25.65;
        final var y = 32.75;
        final var z = 12.84;
        final var p1 = 2.5;
        final var p2 = 3.2;
        final var p3 = 2.3;

        final var numerador = x * p1 + y * p2 + z * p3;
        final var denominador = p1 + p2 +p3;

        final var promedioPonderado = numerador / denominador;

        System.out.printf("El promedio ponderado es %.3f", promedioPonderado);
    }
}
