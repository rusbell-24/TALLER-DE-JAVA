package taller4.ejercicio1;

import java.util.Scanner;

public class Datos {
    private int[] vectorNumeros = new int[5];

    public Datos() {
    }

    public void llenarVector(){
        Scanner input = new Scanner(System.in);
        int numeroUsuario;

        for (int i = 0; i < 5; i++){
            System.out.println("por favor ingrese el " + (i + 1) + " numero entre 0 y 100: ");
            numeroUsuario = input.nextInt();

            if (numeroUsuario >= 0 & numeroUsuario <= 100){
                vectorNumeros[i] = numeroUsuario;
                System.out.println("\nEl numero "+ numeroUsuario + " se guardo de forma correcta\n");
            }else {
                System.out.println("\nEl dato ingresado no es correcto\n");
                i--;
            }
        }

    }

    public void imprimirVector(){
        System.out.println("\n\nLos numeros guardados son: \n\n");
        for (int i = 0; i < 5; i++){
            System.out.println("[" + i + "] = " + vectorNumeros[i]);
        }
    }

}
