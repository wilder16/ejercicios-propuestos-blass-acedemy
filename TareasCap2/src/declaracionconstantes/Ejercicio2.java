package declaracionconstantes;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var banda = "Black Sabbath";
        final var guitarrista = "Tony Lommi";
        final var vocalista = "Ozzy";
        final var sonAmericanos = false;
        final var cantidadAlbumes = 19;
        final var rating = 4.85;

        System.out.printf("Mi banda favorita es %s con %d albums%n", banda, cantidadAlbumes);
        System.out.printf("Sus integrantes conocidos son el cantente llamado %s y el guitarrista " +
                "con el nombre %s%n", vocalista, guitarrista);
        System.out.printf("Son de nacionalidad estadounidense? %b, pero igual tiene un rating de %.2f",
                sonAmericanos, rating);
    }
}
