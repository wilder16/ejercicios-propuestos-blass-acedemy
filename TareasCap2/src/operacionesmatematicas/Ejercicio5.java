package operacionesmatematicas;

// Calculo del IMC (Inidece de masa corporal )
public class Ejercicio5 {
    public static void main(String[] args) {
        final var peso = 80.52;
        final var altura = 1.65;
        final var nombre = "Jorge";

        final var imc = peso / Math.pow(altura, 2);
        System.out.printf("%s tiene un peso de %.3fkg y una altura de %.3fm entonces su IMC es de %.3f",
                nombre, peso, altura, imc);
    }
}
