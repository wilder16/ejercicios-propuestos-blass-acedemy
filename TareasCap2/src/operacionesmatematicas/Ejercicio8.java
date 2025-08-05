package operacionesmatematicas;

// Calular el numero total de cabezas y patas
public class Ejercicio8 {

    public static void main(String[] args) {
        final var gallinas = 25;
        final var vacas = 12;

        final var totalCabezas = gallinas + vacas;
        final var totalPatas = gallinas * 2 + vacas * 4;

        System.out.printf("En %d vacas & %d gallinas hay %d cabezas%n", vacas, gallinas, totalCabezas);
        System.out.printf("En %d vacas & %d gallinas hay %d patas", vacas, gallinas, totalPatas);

    }
}
