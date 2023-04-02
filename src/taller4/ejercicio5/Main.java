package taller4.ejercicio5;

import java.util.Scanner;

public class Main {

    public static int menuPrincipal(){
        int opcion;
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("_____________TABLA DE MULTIPLICAR__________");
        System.out.println("OPCIONES:..................................");
        System.out.println("");
        System.out.println("      1. Calcular multiplicacion");
        System.out.println("      2. Salir multiplicacion");
        System.out.println("------------------------------------------");
        System.out.print(" Ingrese su opcion: ");
        opcion= input.nextInt();
        return opcion;
    }

    public static void main(String[] args) {
        int opcion, filaUsuario, columnaUsuario;

        Scanner input = new Scanner(System.in);

        TablaMultiplicacion tabla= new TablaMultiplicacion();
        tabla.llenarMatrizReferencia();
        tabla.llenarMatrizResultados();

        do {
            System.out.println("MATRIZ DE REFERENCIA:_____________________________________________________________________________________");
            System.out.println("");
            System.out.println("              Col 0:   Col 1:   Col 2:   Col 3:   Col 4:   Col 5:   Col 6:   Col 7:   Col 8:   Col 9:    ");
            System.out.println("");
            tabla.imprimirMatrizReferencia();
            System.out.println("___________________________________________________________________________________________________________");
            System.out.println("");

            opcion = menuPrincipal();

            if (opcion == 1){
                System.out.print("Ingrese el valor de la fila: ");
                filaUsuario = input.nextInt();
                if (filaUsuario >= 0 & filaUsuario <= 9){
                    System.out.print("Ingrese el valor de la columna: ");
                    columnaUsuario = input.nextInt();
                    if (columnaUsuario >= 0 & columnaUsuario  <= 9) {
                        System.out.println("");
                        System.out.println("Resultado de:  " + (columnaUsuario + 1) + " x " + (filaUsuario + 1) + " = " + tabla.getMatrizResultado()[filaUsuario][columnaUsuario] + "\n\n");
                        ;
                    }else {
                        System.out.println("\n\nEl valor ingresado esta fuera de rango\n\n");
                    }
                }else {
                    System.out.println("\n\nEl valor ingresado esta fuera de rango\n\n");
                }
            }


        }while (opcion != 2);

        System.out.println("HASTA PRONTO....");

    }
}
