package sentenciaswitchenums;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var capturador = new Scanner(System.in);

        mostrarMenu();

        final var superheroe = ScannerManager.leerString(capturador, "Ingrese su superheroe");
        capturador.close();

        mostrarNemesis(Superheroe.valueOf(superheroe));
    }

    static void mostrarMenu(){
        System.out.println("BATMAN");
        System.out.println("SUPERMAN");
        System.out.println("SPIDERMAN");
    }

    enum Superheroe{
        BATMAN,
        SUPERMAN,
        SPIDERMAN
    }

    static void mostrarNemesis(Superheroe superheroe){
        switch (superheroe){
            case BATMAN     -> System.out.printf("El nemesis de %s es: JOKER", superheroe);
            case SUPERMAN   -> System.out.printf("El nemesis de %s es: LUTHOR", superheroe);
            case SPIDERMAN  -> System.out.printf("El nemesis de %s es: GREEN GOBLIN", superheroe);
        }
    }
}
