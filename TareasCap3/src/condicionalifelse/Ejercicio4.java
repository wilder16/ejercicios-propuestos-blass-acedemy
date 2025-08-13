package condicionalifelse;

import utilidades.RandomUtilities;
import utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        final var nota1 = ScannerManager.leerInt(capturador, "Ingrese su primera nota");
        final var nota2 = ScannerManager.leerInt(capturador, "Ingrese su segunda nota");

        capturador.close();

        imprimirMensaje(nota1, nota2, validarAprobacion(nota1, nota2));

    }

    static String validarAprobacion(int nota1, int nota2){
        if((nota1 > 10) && (nota2 > 15)){
            return "Aprobaste, felicitaciones";
        }else{
            return "Desaprobaste, sigue intentando";
        }
    }

    static void imprimirMensaje(int nota1, int nota2, String mensaje){
        System.out.printf("Tu primera nota es de %d%n", nota1);
        System.out.printf("Tu segunda nota es de %d%n", nota2);
        System.out.printf("%s%n", mensaje);
    }

}
