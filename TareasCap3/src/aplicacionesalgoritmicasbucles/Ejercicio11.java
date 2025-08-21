package aplicacionesalgoritmicasbucles;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el número hasta donde quiere saber la suma de los números pares");
        capturador.close();

        imprimirResultado(n, calcularSuma(n));
    }

    static int calcularSuma(int n){
        var suma = 0;
        for (int i = 10; i < n; i++) {
            if (i % 2 == 0){
                suma+=i;
            }
        }
        return suma;
    }

    static void imprimirResultado(int n, int suma){
        System.out.printf("La suma de números pares entre el 10 y %d es %d", n, suma);
    }
}