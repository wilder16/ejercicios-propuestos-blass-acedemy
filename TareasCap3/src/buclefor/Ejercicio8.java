package buclefor;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el numero hasta donde quiere saber cuantos numeros pares hay");
        capturador.close();

        imprimirResultado(n, calcularCantidad(n));
    }

    static int calcularCantidad(int n){
        var contador = 0;
        for (int i = 5; i < n; i++) {
            if (i % 2 == 0){
                contador++;
            }
        }
        return contador;
    }

    static void imprimirResultado(int n, int total){
        System.out.printf("Entre 5 y %d hay %d numeros pares", n, total);
    }
}