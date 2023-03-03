package taller2.ejercicio2;

import java.util.Scanner;

public class Persona {

    private int edad;

    // Metodo que pide y captura la edad
    public void pedirEdad(){
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su edad: ");
        edad = input.nextInt();
    }

    // Metodo que determina e imprime si la persona es menor de edad.
    public void determinarEsMenor(){
        if (edad < 18 ){
            System.out.println("Usted aún es un niño(a).");
        }
    }
}
