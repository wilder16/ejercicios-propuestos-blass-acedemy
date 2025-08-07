package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calcular el area de un trapecio
public class Ejercicio3 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var a = ScannerManager.leerDouble(capturador, "Ingrese la longitud del lado 1 del trapecio");
        final var b = ScannerManager.leerDouble(capturador, "Ingrese la longitud del lado 2 del trapecio");
        final var h = ScannerManager.leerDouble(capturador,"Ingrese la altura del trapecio");

        final var area = caluclarAreaTrapecio(a, b, h);
        impirmirResultados(a, b, h, area);

    }

    static double caluclarAreaTrapecio(double lado1, double lado2, double altura){
        return  0.5 * (lado1 + lado2) * altura;
    }
    static void impirmirResultados(double lado1, double lado2, double altura, double area){
        System.out.printf("El area del trapecio con lado 1 %.2f, lado 2 %.2f, y altura %.2f es %.2f", lado1, lado2, altura, area);
    }
}