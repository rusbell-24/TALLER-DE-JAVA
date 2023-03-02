package taller1;

import java.util.Scanner;
public class Ejercicio1 {

    // Realizar un programa el cual solicite su nombre y apellidos.

    private static String nombre;
    private static String primerApellido;
    private static String segundoApellido;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.next();

        System.out.println("Ingrese su primer apellido: ");
        primerApellido = input.next();

        System.out.println("Ingrese su segundo apellido: ");
        segundoApellido = input.next();

    }
}
