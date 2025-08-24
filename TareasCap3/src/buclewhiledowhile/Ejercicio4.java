package buclewhiledowhile;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var n = ScannerManager.leerInt(capturador,
                "Ingrese el valor hasta donde quiere sumar o multiplicar");
        char opcion;
        do {
            mostrarMenu(n);
            opcion = ScannerManager.leerChar(capturador, "Ingrese la opción que desea hacer");
            if (opcion != 'D' && opcion != 'd'){
                ejecutarOpcion(opcion, n);
            }
            System.out.println();

        }while (opcion != 'D' && opcion != 'd');
        capturador.close();
    }

    static void mostrarMenu(int n){
        System.out.printf("A/a: Calcular suma desde 1 hasta %d%n", n);
        System.out.printf("B/b: Calcular multiplicación desde 1 hasta %d%n", n);
        System.out.printf("C/c: Mostrar números desde 1 hasta %d%n", n);
        System.out.println("D/d: Salir del programa");
    }

    static void ejecutarOpcion(char opcion, int n){
        switch (opcion){
            case 'A', 'a' -> calcularSuma(n);
            case 'B', 'b' -> calcularMultiplicacion(n);
            case 'C', 'c' -> imprimirSerie(n);
            default -> System.out.println("Opcion no valida");
        }
    }
    static void calcularSuma(int n){
        var suma = 0;
        for (int i = 1; i <= n; i++) {
            suma+=i;
        }
        System.out.printf("La suma desde 1 hasta %d es %d%n", n, suma);

    }

    static void calcularMultiplicacion(int n){
        var multiplicacion = 1.0;
        for (int i = 1; i <= n; i++) {
            multiplicacion*=i;

        }
        System.out.printf("La multiplicacion desde 1 hasta %d es %.2f%n", n, multiplicacion);
    }

    static void imprimirSerie(int n){
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
    }

}
