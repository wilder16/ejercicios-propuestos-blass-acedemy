package comparacionnumeros;

import utilidades.RandomUtilities;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var random = new Random();
        final var numero = RandomUtilities.generarRandomInt(50, 300, random);

        final var cumpleCondicion = validarAltoChance(numero);

        imprimirMensaje(numero, cumpleCondicion);


    }
    static boolean validarAltoChance(int numero){ return (numero > 100) || (numero % 5 == 0) || (numero % 2 != 0); }

    static void imprimirMensaje(int numero, boolean cumpleCondicion){
        System.out.printf("Tienes un numero %d, tienes un alto chance? %b%n", numero, cumpleCondicion);
    }
}
