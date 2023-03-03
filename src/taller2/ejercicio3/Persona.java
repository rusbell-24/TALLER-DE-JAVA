package taller2.ejercicio3;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;

    // Metodo para solicitar y capturar los  datos
    public void leerDatos(){

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        primerApellido = input.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        segundoApellido = input.nextLine();
        System.out.println("Finalmente, ingrese su edad: ");
        edad = input.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public int getEdad() {
        return edad;
    }
}
