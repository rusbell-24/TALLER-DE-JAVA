package taller4.ejercicio4;

public class Main {
    public static void main(String[] args) {

        Matriz matriz = new Matriz();

        matriz.llenarMatriz();

        System.out.println("Matriz normal:\n");
        matriz.imprimirMatriz();
        System.out.println("");
        System.out.println("Matriz intercalada: \n");
        matriz.imprimirMatrizIntercalada();

    }
}
