package declaracionmetodos;

import operacionesmatematicasdataaletorea.RandomUtilities;

import java.util.Random;

// Calular el numero total de cabezas y patas
public class Ejercicio8 {

    public static void main(String[] args) {
        final var random = new Random();
        final var gallinas = RandomUtilities.generarRandomInt(1,26,random);
        final var vacas = RandomUtilities.generarRandomInt(1,23,random);;

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
