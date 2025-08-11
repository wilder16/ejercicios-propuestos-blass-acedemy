package comparacionnumeros;

import utilidades.RandomUtilities;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var random = new Random();

        final var nota1 = RandomUtilities.generarRandomInt(0, 20, random);
        final var nota2 = RandomUtilities.generarRandomInt(0, 20, random);

        final var cumpleCondicion = validarAprobacion(nota1, nota2);

        imprimirMensaje(nota1, nota2, cumpleCondicion);

    }

    static boolean validarAprobacion(int nota1, int nota2){ return (nota1 > 10) && (nota2 > 15); }

    static void imprimirMensaje(int nota1, int nota2, boolean cumpleCondicion){
        System.out.printf("Tu primera nota es de %d%n", nota1);
        System.out.printf("Tu segunda nota es de %d%n", nota2);
        System.out.printf("Aprobaste? %b ", cumpleCondicion);
    }

}
