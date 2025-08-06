package operacionesmatematicasdataaletorea;

import java.util.Random;

// Calculo del IMC (Inidece de masa corporal)
public class Ejercicio5 {
    public static void main(String[] args) {
        final var random = new Random();
        final var peso = RandomUtilities.generarRandomDouble(50, 90, random);
        final var altura = RandomUtilities.generarRandomDouble(1,2, random);
        final var nombre = "Jorge";

        final var imc = peso / Math.pow(altura, 2);
        System.out.printf("%s tiene un peso de %.3fkg y una altura de %.3fm entonces su IMC es de %.3f",
                nombre, peso, altura, imc);
    }
}