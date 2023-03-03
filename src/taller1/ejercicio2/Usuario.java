// Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.

package taller1.ejercicio2;

import java.util.Scanner;
public class Usuario {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private float estatura;

    // Metodo para pedir los datos
    public void pedirDatos(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Ingrese su primer apellido: ");
        primerApellido = input.nextLine();

        System.out.println("Ingrese su segundo apellido: ");
        segundoApellido = input.nextLine();

        System.out.println("Ingrese su edad (en años): ");
        edad = input.nextInt();

        System.out.println("Ingrese su estatura (en metros): ");
        estatura = input.nextFloat();

    }
}
