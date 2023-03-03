package taller1.ejercicio3;

import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    private String nombrePadre;
    private String primerApellidoPadre;
    private String segundoApellidoPadre;

    private String nombreMadre;
    private String primerApellidoMadre;
    private String segundoApellidoMadre;

    //Metodo para pedir los datos
    public void pedirDatos(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        primerApellido = input.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        segundoApellido = input.nextLine();

        System.out.println("Ingrese el nombre de su padre: ");
        nombrePadre = input.nextLine();
        System.out.println("Ingrese el primer apellido de su padre: ");
        primerApellidoPadre = input.nextLine();
        System.out.println("Ingrese el segundo apellido de su padre: ");
        segundoApellidoPadre = input.nextLine();

        System.out.println("Ingrese el nombre de su madre: ");
        nombreMadre = input.nextLine();
        System.out.println("Ingrese el primer apellido de su madre: ");
        primerApellidoMadre = input.nextLine();
        System.out.println("Ingrese el segundo apellido de su madre: ");
        segundoApellidoMadre = input.nextLine();

    }

    public void mostrarMensaje(){
        System.out.println("Yo " + nombre + " " + primerApellido + " " + segundoApellido + " soy hijo de " +
                nombreMadre + " " + primerApellidoMadre + " " + segundoApellidoMadre + " y " +
                nombrePadre + " " + primerApellidoPadre + " " + segundoApellidoPadre + ".");
    }


}
