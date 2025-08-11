package comparacionnumeros;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var capturador =  new Scanner(System.in);

        final var edad = ScannerManager.leerInt(capturador, "Ingrese la edad del consumidor");

        capturador.close();

        final var cumpleCondicion = validarDescuento(edad);

        imprimirMensaje(edad, cumpleCondicion);
    }

    static boolean validarDescuento(int edad){ return (edad > 20) && (edad < 50); }

    static void imprimirMensaje(int edad, boolean cumpleCondicion){
        System.out.printf("Tines una edad %d cumples con la condicion? %b%n", edad, cumpleCondicion);
    }
}
