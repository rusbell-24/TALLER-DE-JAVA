package taller1.ejercicio5;

import java.util.Scanner;

public class Mascota {

    private String nombreMascota;
    private String tipoMascota;
    private int edadMascota;
    private String nombrePropietario;

    //Metodo para pedir la información
    public void pedirDatos(){

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre completo: ");
        nombrePropietario = input.nextLine();
        System.out.println("Ingrese el nombre de su mascota: ");
        nombreMascota = input.nextLine();
        System.out.println("Ingrese la edad de " + nombreMascota);
        edadMascota = input.nextInt();
        input.nextLine();  //consume el caracter de salto de linea que no cosumio el nextInt()
        System.out.println("Que tipo de mascota es " + nombreMascota);
        tipoMascota = input.nextLine();
    }

    // Metodo para mostrar el mensaje con la información
    public void mostrarMensaje(){
        System.out.println(nombreMascota + " es un(a) " + tipoMascota + " el cual, tiene " + edadMascota +
                " años de edad y " + nombrePropietario + " es actualmente su dueño(a).");
    }
}
