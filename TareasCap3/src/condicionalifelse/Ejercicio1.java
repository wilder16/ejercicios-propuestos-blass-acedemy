package condicionalifelse;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var capturador =  new Scanner(System.in);

        final var edad = ScannerManager.leerInt(capturador, "Ingrese la edad del consumidor");
        capturador.close();

        imprimirMensaje(validarDescuento(edad));

    }

    static String validarDescuento(int edad){
        if((edad > 20) && (edad < 50)){
            return "Cumples la condición para el descuento!";
        }
        return "No cumples la condición debido a tu edad";
    }

    static void imprimirMensaje(String mensaje){
        System.out.printf("%s%n", mensaje);
    }
}
