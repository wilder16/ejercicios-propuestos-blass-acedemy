package aplicacionesalgoritmicasbucles;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el numero hasta donde quiere visualizar la serie");
        capturador.close();

        imprimirSerie(n);
    }

    static void imprimirSerie(int n){
        for (int i = 14; i <= n; i++) {

            if(i % 2 == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}

