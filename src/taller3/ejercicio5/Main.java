package taller3.ejercicio5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void menuPrincipal(){
        System.out.println("");
        System.out.println("_________MENÚ DE USUARIO_______");
        System.out.println("");
        System.out.println("      1. Capturar nombre");
        System.out.println("      2. Saludar persona");
        System.out.println("      3. Salir del sistema");
        System.out.println("------------------------------");
        System.out.print(" Ingrese su opcion: ");
    }

    public static void main(String[] args) {
        int opcion;

        Scanner input = new Scanner(System.in);
        Usuario usuario =new Usuario();

        do {
            menuPrincipal();
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    usuario.capturarNombre();
                    break;
                case 2:
                    usuario.saludar();
                    break;
            }

        }while(opcion != 3);

        System.out.println("\nHASTA PRONTO...");
    }
}
