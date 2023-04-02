package taller3.ejercicio5;

import java.util.Scanner;

public class Usuario {

    private String nombre;
    Scanner input =new Scanner(System.in);

    public void capturarNombre(){

        System.out.print("\nPor favor ingrese el nombre: ");
        nombre = input.next();
        System.out.println("\nEl nombre: " + nombre + " se ha guardado con exito.");
    }

    public void saludar(){
        if (nombre != null){
            System.out.println("\nHola " + nombre + ", ten un lindo dia");
        }else{
            System.out.println("\nAun no has ingresado un nombre para saludar.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
