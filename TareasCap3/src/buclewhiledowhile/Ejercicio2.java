package buclewhiledowhile;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var lado = ScannerManager.leerDouble(capturador, "Ingrese el lado");
        char opcion;

        do{
            mostrarMenu();
            opcion = ScannerManager.leerChar(capturador, "Ingrese la opción que desea realizar");
            if (opcion != 'C' && opcion != 'c'){
                imprimirMensaje(ejecutarOpcion(opcion, lado));
            }
            System.out.println();

        }while (opcion != 'C' && opcion != 'c');
        capturador.close();
    }

    static void mostrarMenu(){
        System.out.println("A/a: Calcular el area");
        System.out.println("B/b: Calcular el perimetro");
        System.out.println("C/c: Salir del programa");
    }

    static double ejecutarOpcion(char opcion, double lado){
        return switch (opcion){
            case 'A', 'a' -> (Math.sqrt(3)/4) * Math.pow(lado, 2);
            case 'B', 'b' -> 3 * lado;
            default -> -1.0;
        };
    }

    static void imprimirMensaje(double resultado){
        if (resultado != -1.0 ){
            System.out.printf("El resultado es: %.2f%n", resultado);
        }else {
            System.out.println("Opcion no valida");
        }
    }
}
