package taller2.ejercicio4;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private long cedula;
    private long telefono;

    public Usuario() {
    }

    // Metodo para pedir y capturar datos
    public void pedirDatos(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        nombre = input.nextLine();

        System.out.println("Ingrese su cedula: ");
        cedula = input.nextLong();

        System.out.println("Ingrese su telefono: ");
        telefono = input.nextLong();

    }

    public String getNombre() {
        return nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public long getTelefono() {
        return telefono;
    }
}
