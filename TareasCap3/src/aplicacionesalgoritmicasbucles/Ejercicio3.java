package aplicacionesalgoritmicasbucles;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el numero desde donde quiere visualizar la serie");
        capturador.close();

        imprimirSerie(n);
    }

    static void imprimirSerie(int n){
        for (int i = n; i >= 3; i--) {
            System.out.printf("%d ", i);
        }
    }
}

