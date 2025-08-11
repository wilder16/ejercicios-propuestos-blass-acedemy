package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calculo del IMC (Inidece de masa corporal)
public class Ejercicio5 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var peso = ScannerManager.leerDouble(capturador, "Ingrese el peso");
        final var altura = ScannerManager.leerDouble(capturador, "Ingrese la altura");
        capturador.close();
        final var nombre = "Jorge";

        final var imc = calcularImc(peso, altura);
        impirmirResultados(nombre, peso, altura, imc);

    }

    static double calcularImc(double peso, double altura){
        return peso / Math.pow(altura, 2);
    }
    static void impirmirResultados(String nombre, double peso, double altura, double imc){
        System.out.printf("%s tiene un peso de %.3fkg y una altura de %.3fm entonces su IMC es de %.3f",
                nombre, peso, altura, imc);
    }
}
