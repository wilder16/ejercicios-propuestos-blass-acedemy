package aplicacionesalgoritmicasbucles;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el numero hasta donde quiere saber cuantos numeros multiplos de 5 hay");
        capturador.close();

        imprimirResultado(n, calcularCantidad(n));
    }

    static int calcularCantidad(int n){
        var contador = 0;
        for (int i = 10; i < n; i++) {
            if (i % 5 == 0){
                contador++;
            }
        }
        return contador;
    }

    static void imprimirResultado(int n, int total){
        System.out.printf("Entre 10 y %d hay %d numeros multiplos de 5", n, total);
    }
}