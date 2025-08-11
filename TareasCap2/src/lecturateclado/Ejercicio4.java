package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calcular el periodo de un pendulo
public class Ejercicio4 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var longitud = ScannerManager.leerDouble(capturador, "Ingrese la longitud del pendulo");
        capturador.close();
        final var gravedad = 9.81;

        final var periodo = calcularPeriodoPendulo(longitud, gravedad);
        impirmirResultados(longitud, periodo);

    }

    static double calcularPeriodoPendulo(double longitud, double gravedad){
        return 2 * Math.PI * Math.sqrt(longitud/gravedad);
    }

    static void impirmirResultados(double longitud, double periodo){
        System.out.printf("Para un pendulo de longitud %.2f tendra un periodo de %.3f", longitud, periodo);
    }
}