package buclewhiledowhile;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);
        final var numero = ScannerManager.leerInt(capturador, "Ingrese un número");
        char opcion;

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(capturador, "Ingrese la opción que desea realizar");
            if (opcion !='D' && opcion != 'd'){
                ejecutarOpcion(opcion, numero);
            }
            System.out.println();
        }while (opcion !='D' && opcion != 'd');

        capturador.close();

    }

    static void mostrarMenu(){
        System.out.println("A/a: Verificar si el número es par y mayor que 50");
        System.out.println("B/b: Verificar si el número es múltiplo de 5 y es menor que 30");
        System.out.println("C/c: Verificar si el número termina en 0 y es mayor que 500");
        System.out.println("D/d: Salir del programa");
    }

    static void ejecutarOpcion(char opcion, int numero){
        switch (opcion){
            case 'A', 'a' -> {
                if (numero % 2 == 0 && numero > 50){
                    System.out.printf("El número %d cumple la condicion", numero);
                }else{
                    System.out.printf("El número %d no cumple la condicion", numero);
                }
            }
            case 'B', 'b' -> {
                if(numero % 5 == 0 && numero < 30){
                    System.out.printf("El número %d cumple la condicion", numero);
                }else{
                    System.out.printf("El número %d no cumple la condicion", numero);
                }
            }
            case 'C', 'c' -> {
                if (numero % 10 == 0 && numero > 500){
                    System.out.printf("El número %d cumple la condicion", numero);
                }else{
                    System.out.printf("El número %d no cumple la condicion", numero);
                }
            }
            default -> System.out.println("Opcion no válida");
        };
    }
}

