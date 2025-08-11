package comparacionnumeros;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var edad = ScannerManager.leerInt(capturador, "Ingrese su edad");
        final var ingresos = ScannerManager.leerInt(capturador, "Ingrese sus ingresos totales");

        capturador.close();

        final var cumpleCondicion = validarJubilacion(edad, ingresos);
        imprimirMensaje(edad, ingresos, cumpleCondicion);

    }

    static boolean validarJubilacion(int edad, int ingresos){ return (edad >= 65) && (ingresos < 2000); }

    static void imprimirMensaje(int edad, int ingresos, boolean cumpleCondicion){
        System.out.printf("Tu edad es de %d%n", edad);
        System.out.printf("Tus ingresos son %d%n", ingresos);
        System.out.printf("Puedes jubilarte? %b", cumpleCondicion);
    }
}
