package declaracionconstantes;

public class Ejercicio1 {
    public static void main(String[] args) {

        final var nombre = "Jorge";
        final var apellido = "Sifuentes";
        final var segundoApellido = "Caceres";
        final var edad = 52;
        final var peso = 25.12;
        final var esTitulado = false;
        final var aula = "A";

        System.out.printf("Mi nombre es %s y mi apellido es %s%n", nombre, apellido);
        System.out.printf("Tengo %d años de edad y peso %.2fkg%n", edad, peso);
        System.out.printf("Soy titulado? %b, aun estudio en el aula con sección %s", esTitulado, aula);

    }

}
