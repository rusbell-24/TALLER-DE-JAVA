package taller1.ejercicio1;

import java.util.Scanner;
public class Usuario {

    // Atributos
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    // Metodo para pedir datos

    public void pedirDatos(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Ingrese su primer apellido: ");
        primerApellido = input.nextLine();

        System.out.println("Ingrese su segundo apellido: ");
        segundoApellido = input.nextLine();
    }

}
