package aplicacionesalgoritmicasbucles;

public class Ejercicio6 {

    public static void main(String[] args) {
        imprimirSerie();
    }

    static void imprimirSerie(){
        for (int i = 50; i <= 500; i++) {

            if (i % 5 == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
