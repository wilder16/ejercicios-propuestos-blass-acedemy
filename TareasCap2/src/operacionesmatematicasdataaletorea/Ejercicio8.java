package operacionesmatematicasdataaletorea;

import utilidades.RandomUtilities;

import java.util.Random;

// Calular el numero total de cabezas y patas
public class Ejercicio8 {

    public static void main(String[] args) {
        final var random = new Random();
        final var gallinas = RandomUtilities.generarRandomInt(1,26,random);
        final var vacas = RandomUtilities.generarRandomInt(1,23,random);;

        final var totalCabezas = gallinas + vacas;
        final var totalPatas = gallinas * 2 + vacas * 4;

        System.out.printf("En %d vacas & %d gallinas hay %d cabezas%n", vacas, gallinas, totalCabezas);
        System.out.printf("En %d vacas & %d gallinas hay %d patas", vacas, gallinas, totalPatas);

    }
}