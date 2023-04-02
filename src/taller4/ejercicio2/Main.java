package taller4.ejercicio2;

public class Main {

    public static void main(String[] args) {

        Numeros numeros = new Numeros();

        numeros.llenarVector();
        numeros.imprimirVector();
        System.out.print("\n\nNumeros pares: ");
        numeros.imprimirPares();
        System.out.print("\nNumeros impares: ");
        numeros.imprimirImpares();
    }

}
