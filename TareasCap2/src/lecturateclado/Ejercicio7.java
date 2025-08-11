package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calcular media geometrica
public class Ejercicio7 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var x1 = ScannerManager.leerDouble(capturador, "Ingrese el valor de x1");
        final var x2 = ScannerManager.leerDouble(capturador, "Ingrese el valor de x2");
        final var x3 = ScannerManager.leerDouble(capturador, "Ingrese el valor de x3");
        final var x4 = ScannerManager.leerDouble(capturador, "Ingrese el valor de x4");
        capturador.close();


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