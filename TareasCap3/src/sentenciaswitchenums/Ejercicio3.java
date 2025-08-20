package sentenciaswitchenums;

import utilidades.ScannerManager;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        mostarMenu();

        final var capturador = new Scanner(System.in);
        final var generoJuego = ScannerManager.leerString(capturador, "Ingrese el genero del juego");

        capturador.close();


        mostrarListaJuegos(GeneroJuego.valueOf(generoJuego));
    }

    static void mostarMenu(){
        System.out.println("ACCION");
        System.out.println("LUCHAS");
        System.out.println("RPG");
    }

    static void mostrarListaJuegos(GeneroJuego generoJuego){
        switch (generoJuego){
            case ACCION -> {
                System.out.println("GOD OF WAR");
                System.out.println("BATMAN ARKHAM");
                System.out.println("SPIDERMAN");
            }
            case LUCHAS -> {
                System.out.println("TEKKEN");
                System.out.println("STREET FIGHTER");
                System.out.println("SMASH BROTHERS");

            }
            case RPG -> {
                System.out.println("MARIO RPG");
                System.out.println("PAPER MARIO");
                System.out.println("MONSTER SANCTUARY");

            }
        }
    }

    enum GeneroJuego {
        ACCION,
        LUCHAS,
        RPG
    }
}
