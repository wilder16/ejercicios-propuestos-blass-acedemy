package operacionesmatematicas;

// Calcular el periodo de un pendulo
public class Ejercicio4 {

    public static void main(String[] args) {
        final var longitud = 15.20;
        final var gravedad = 9.81;

        final var periodo = 2 * Math.PI * Math.sqrt(longitud/gravedad);
        System.out.printf("Para un pendulo de longitud %.2f tendra un periodo de %.3f", longitud, periodo);
    }
}
