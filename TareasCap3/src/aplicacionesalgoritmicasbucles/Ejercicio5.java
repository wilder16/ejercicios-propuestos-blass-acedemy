package aplicacionesalgoritmicasbucles;

public class Ejercicio5 {

    public static void main(String[] args) {
        imprimirSerie();
    }

    static void imprimirSerie(){
        for (int i = 300; i > 100; i--) {

            if (i % 2 != 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
