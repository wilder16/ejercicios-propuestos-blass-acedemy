package aplicacionesalgoritmicasbucles;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el numero hasta donde quiere saber la suma");
        capturador.close();

        imprimirResultado(n, calcularSuma(n));
    }

    static int calcularSuma(int n){
        var suma = 0;
        for (int i = 1; i < n; i++) {
            suma+=i;
        }
        return suma;
    }

    static void imprimirResultado(int n, int suma){
        System.out.printf("La suma de números entre el 1 y %d es %d", n, suma);
    }
}