package sentenciaswitchenums;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        mostarMenu();
        final var mes = ScannerManager.leerString(capturador,
                "Ingrese el mes en el cual desea saber los dias que posee");
        capturador.close();
        mostrarCantifdadDias(Mes.valueOf(mes));

    }

    static void mostarMenu(){
        System.out.println("ENERO");
        System.out.println("FEBRERO");
        System.out.println("MARZO");
        System.out.println("ABRIL");
        System.out.println("MAYO");
        System.out.println("JUNIO");
        System.out.println("JULIO");
        System.out.println("AGOSTO");
        System.out.println("SEPTIEMBRE");
        System.out.println("OCTUBRE");
        System.out.println("NOVIEMBRE");
        System.out.println("DICIEMBRE");
    }

    enum Mes{
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }

    static void mostrarCantifdadDias(Mes mes){
        switch (mes){
            case FEBRERO -> System.out.printf("El mes de %s puede tener 28 dias o 29 dias si el año es bisiesto", mes);
            case ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE -> System.out.printf("El mes de %s tienes 30 dias", mes);
            case ENERO, MARZO, MAYO, JULIO,
                 AGOSTO, OCTUBRE, DICIEMBRE -> System.out.printf("El mes de %s tienes 31 dias", mes);
        }
    }
}
