package taller1.ejercicio4;

import java.util.Scanner;

public class Capital {

    private String nombreCiudad;
    private String nombrePais;

    // Metodo para pedir datos
    public void pedirDatos(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de una ciudad capital: ");
        nombreCiudad = input.nextLine();

        System.out.println("Ingrese el nombre del pais al que pertenece dicha ciudad");
        nombrePais =  input.nextLine();
    }

    // Metodo para mostrar el mensaje
    public void mostrarMensaje(){

        System.out.println("La ciudad " + nombreCiudad + ", es la capital del país " + nombrePais);

    }

}
