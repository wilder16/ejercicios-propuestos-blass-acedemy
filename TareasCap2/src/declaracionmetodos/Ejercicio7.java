package declaracionmetodos;

import operacionesmatematicasdataaletorea.RandomUtilities;

import java.util.Random;

// Calcular media geometrica
public class Ejercicio7 {

    public static void main(String[] args) {
        final var random = new Random();
        final var x1 = RandomUtilities.generarRandomDouble(10,76, random);
        final var x2 = RandomUtilities.generarRandomDouble(1,20, random);
        final var x3 = RandomUtilities.generarRandomDouble(1,11, random);
        final var x4 = RandomUtilities.generarRandomDouble(10,86, random);;


        final var mediaGeometrica = calcularMediaGeometrica(x1, x2, x3, x4);
        imprimirResultado(x1, x2, x3, x4, mediaGeometrica);


    }

    static double calcularMediaGeometrica(double x1, double x2, double x3, double x4){
        final var producto = x1 * x2 * x3 * x4;
        return Math.pow(producto, 0.25);
    }

    static void imprimirResultado(double x1, double x2, double x3, double x4, double mediaGeometrica){
        System.out.printf("La media geométrica de %.2f, %.2f, %.2f y %.2f es %.5f",
                x1, x2, x3, x4, mediaGeometrica);
    }
}