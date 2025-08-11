package comparacionnumeros;

import utilidades.RandomUtilities;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var random = new Random();

        final var episodios = RandomUtilities.generarRandomInt(50, 450, random);
        final var cumpleCondicion = validarNuevaTemporada(episodios);

        imprimirMensaje(episodios, cumpleCondicion);

    }

    static boolean validarNuevaTemporada(int episodios){ return (episodios % 5 == 0) || (episodios < 300); }

    static void imprimirMensaje(int episodios, boolean cumpleCondicion){
        System.out.printf("Cantidad de episodios: %d%n", episodios);
        System.out.printf("Nueva temporada? %b%n", cumpleCondicion);
    }
}
