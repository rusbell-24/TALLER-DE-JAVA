package taller3.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroUsuario;

        Scanner input = new Scanner(System.in);

        System.out.println("_______________TABLA DE MULTIPLICAR______________");
        System.out.print("\nIngrese el numero de tabla que desea crear: ");
        numeroUsuario = input.nextInt();
        System.out.println("");

        Multiplicacion nuevaMultiplicacion = new Multiplicacion(numeroUsuario);

        nuevaMultiplicacion.calcularTabla();
    }
}
