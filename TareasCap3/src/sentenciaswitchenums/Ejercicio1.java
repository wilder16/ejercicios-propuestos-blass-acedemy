package sentenciaswitchenums;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var numero = ScannerManager.leerInt(capturador, "Ingrese un número");

        mostrarMenu();

        final var opcion = ScannerManager.leerChar(capturador, "Ingrese la opción que desea realizar");

        capturador.close();

        imprimirMensaje(numero, verificarCondicion(opcion, numero));

    }

    static void mostrarMenu(){
        System.out.println("A/a: Verificar si el número es par y mayor que 50");
        System.out.println("B/b: Verificar si el número es múltiplo de 5 y es menor que 30");
        System.out.println("C/c: Verificar si el número termina en 0 y es mayor que 500");
    }

    static void imprimirMensaje(int numero, int cumpleCondicion){
        if(cumpleCondicion == 1){
            System.out.printf("El número %d cumple la condicion", numero);
        }else if(cumpleCondicion == 0){
            System.out.printf("El número %d no cumple la condicion", numero);
        }else{
            System.out.println("Opcion no válida");
        }
    }

    static int verificarCondicion(char opcion, int numero){

        return switch (opcion){
            case 'A', 'a' -> numero % 2 == 0 && numero > 50 ? 1 : 0;
            case 'B', 'b' -> numero % 5 == 0 && numero < 30 ? 1 : 0;
            case 'C', 'c' -> numero % 10 == 0 && numero > 500 ? 1 : 0;
            default -> -1;
        };
    }
}
