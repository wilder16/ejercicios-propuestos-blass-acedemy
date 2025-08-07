package utilidades;

import java.util.Scanner;

public class ScannerManager {
    public static int leerInt(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextInt();
    }

    public static double leerDouble(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextDouble();
    }

    public static String leeString(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    public static boolean leeBoolean(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextBoolean();
    }

    public static char leeChar(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }
}
