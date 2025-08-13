package condicionalifelse;

import utilidades.RandomUtilities;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var random = new Random();
        final var numero = RandomUtilities.generarRandomInt(50, 300, random);

        imprimirMensaje(""+numero);
        imprimirMensaje(validarAltoChance(numero));

    }
    static String validarAltoChance(int numero){
        return ((numero > 100) || (numero % 5 == 0) || (numero % 2 != 0)) ?
                "Tienes un alto chance de ganar!":
                "Tienes un chance muy bajo de ganar!";
    }

    static void imprimirMensaje(String mensaje){
        System.out.printf("%s%n", mensaje);
    }
}
