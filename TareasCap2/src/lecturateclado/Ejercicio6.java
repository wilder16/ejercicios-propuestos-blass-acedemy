package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Promedio ponderado con peso
public class Ejercicio6 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var x = ScannerManager.leerDouble(capturador, "Ingrese el valor de x");
        final var y = ScannerManager.leerDouble(capturador, "Ingrese el valor de y");
        final var z = ScannerManager.leerDouble(capturador, "Ingrese el valor de z");
        final var p1 = ScannerManager.leerDouble(capturador, "Ingrese el valor de p1");
        final var p2 = ScannerManager.leerDouble(capturador, "Ingrese el valor de p2");
        final var p3 = ScannerManager.leerDouble(capturador, "Ingrese el valor de p3");
        capturador.close();



        final var promedioPonderado = calcularPromedioPonderado(x, y, z, p1, p2, p3);
        impirmirResultados(promedioPonderado);

    }

    static double calcularPromedioPonderado(double x, double y, double z, double p1, double p2, double p3){
        final var numerador = x * p1 + y * p2 + z * p3;
        final var denominador = p1 + p2 +p3;
        return  numerador / denominador;
    }

    static void impirmirResultados(double promedioPonderado){
        System.out.printf("El promedio ponderado es %.3f", promedioPonderado);
    }
}