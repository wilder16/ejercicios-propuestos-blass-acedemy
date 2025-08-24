package buclewhiledowhile;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var contidadDolares = ScannerManager.leerDouble(capturador, "Ingrese su cantidad de dolares");

        char opcion;

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(capturador, "Ingrese la opción que desea hacer");
            if (opcion != 'D' && opcion != 'd'){
                ejecutarOpcion(opcion, contidadDolares);
            }
            System.out.println();
        }while (opcion != 'D' && opcion != 'd');
        capturador.close();
    }

    static void mostrarMenu(){
        System.out.println("A/a: Convertir a soles");
        System.out.println("B/b: Convertir a euros");
        System.out.println("C/c: Convertir a yenes");
        System.out.println("D/d: Salir del programa");
    }

    static void ejecutarOpcion(char opcion, double contidadDolares){
        switch (opcion){
            case 'A', 'a' ->{
                System.out.printf("Los %.2f dolares a soles es: %.2f%n",
                        contidadDolares, convertirSoles(contidadDolares));
            }
            case 'B', 'b' -> {
                System.out.printf("Los %.2f dolares a soles es: %.2f%n",
                        contidadDolares, convertirEuros(contidadDolares));
            }
            case 'C', 'c' ->{
                System.out.printf("Los %.2f dolares a soles es: %.2f%n",
                        contidadDolares, convertirYenes(contidadDolares));
            }
            default -> System.out.println("Opcion no valida");
        }
    }
    static double convertirSoles(double contidadDolares){ return contidadDolares * 3.90; }
    static double convertirEuros(double contidadDolares){ return contidadDolares * 0.99; }
    static double convertirYenes(double contidadDolares){ return contidadDolares * 145.66; }

}
