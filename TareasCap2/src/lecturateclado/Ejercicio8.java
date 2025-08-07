package lecturateclado;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

// Calular el numero total de cabezas y patas
public class Ejercicio8 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var gallinas = ScannerManager.leerInt(capturador, "Ingrese el total de gallinas");
        final var vacas = ScannerManager.leerInt(capturador, "Ingrese el total de vacas");

        final var totalCabezas = calcularTotalCabeza(gallinas, vacas);
        final var totalPatas = calcularTotalPatas(gallinas, vacas);

        imprimirResultadosCabezas(gallinas, vacas, totalCabezas);
        imprimirResultadosPatas(gallinas, vacas, totalPatas);

    }

    static int calcularTotalCabeza(int gallinas, int vacas){
        return gallinas + vacas;
    }

    static int calcularTotalPatas(int gallinas, int vacas){
        return gallinas * 2 + vacas * 4;
    }

    static void imprimirResultadosCabezas(int gallinas, int vacas, int totalCabezas){
        System.out.printf("En %d vacas & %d gallinas hay %d cabezas%n", vacas, gallinas, totalCabezas);
    }

    static void imprimirResultadosPatas(int gallinas, int vacas, int totalPatas){
        System.out.printf("En %d vacas & %d gallinas hay %d patas", vacas, gallinas, totalPatas);
    }
}

