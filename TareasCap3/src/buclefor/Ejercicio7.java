package buclefor;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el numero hasta donde quiere saber cuantos numeros hay");
        capturador.close();

        imprimirResultado(n, calcularCantidad(n));
    }

    static int calcularCantidad(int n){
        var contador = 0;
        for (int i = 1; i <= n; i++) {
           contador++;
        }
        return contador;
    }

    static void imprimirResultado(int n, int total){
        System.out.printf("Entre 1 y %d hay %d numeros", n, total);
    }
}