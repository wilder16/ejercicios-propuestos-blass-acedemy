package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calcular area de un paralelogramo
public class Ejercicio1 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var b = ScannerManager.leerDouble(capturador, "Ingrese la base del paralelogramo");
        final var h = ScannerManager.leerDouble(capturador, "Ingrese la altura del paralelogramo");

        final var area = calcularAreaParalelogramo(b,h);
        impirmirResultados(b, h, area);

    }

    static double calcularAreaParalelogramo(double base, double altura){
        return base * altura;
    }
    static void impirmirResultados(double base, double altura, double area){
        System.out.printf("El area del paralelogramo con base %.2f y altura %.2f es %.2f", base, altura, area);
    }
}
