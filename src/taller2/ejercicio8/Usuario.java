package taller2.ejercicio8;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String direccion;
    Torta tortaComprada;
    int numeroTortasComprada;

    public Usuario() {
    }

    // Solicitar datos usuario
    public void pedirDatos(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese nombre Cliente: ");
        nombre = input.nextLine();

        System.out.println("Ingrese direccion Cliente: ");
        direccion = input.nextLine();


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Torta getTortaComprada() {
        return tortaComprada;
    }

    public void setTortaComprada(Torta tortaComprada) {
        this.tortaComprada = tortaComprada;
    }

    public int getNumeroTortasComprada() {
        return numeroTortasComprada;
    }

    public void setNumeroTortasComprada(int numeroTortasComprada) {
        this.numeroTortasComprada = numeroTortasComprada;
    }
}
