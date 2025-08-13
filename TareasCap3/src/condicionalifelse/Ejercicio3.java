package condicionalifelse;

import utilidades.RandomUtilities;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var random = new Random();

        final var episodios = RandomUtilities.generarRandomInt(50, 450, random);

        imprimirMensaje(validarNuevaTemporada(episodios));
    }

    static String validarNuevaTemporada(int episodios){
        if ((episodios % 5 == 0) || (episodios < 300)){
            return "Va salir una nueva temporada";
        }
        return "No saldrá una nueva temporada";
    }

    static void imprimirMensaje(String mensaje){
        System.out.printf("%s%n", mensaje);
    }
}

