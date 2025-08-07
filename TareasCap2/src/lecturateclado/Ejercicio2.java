package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calcular el area de un triangulo
public class Ejercicio2 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var b = ScannerManager.leerDouble(capturador, "Ingrese la base del triangulo");
        final var h = ScannerManager.leerDouble(capturador, "Ingrese la altura del triangulo");

        final var area = calcularAreaTriangulo(b,h);
        impirmirResultados(b,h, area);

    }

    static double calcularAreaTriangulo(double base, double altura){
        return  0.5 * base * altura;
    }
    static void impirmirResultados(double base, double altura, double area){
        System.out.printf("El area del triangulo con base %.2f y altura %.2f es %.2f", base, altura, area);
    }
}