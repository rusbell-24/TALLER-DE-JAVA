//Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años,
// deberá mostrar en pantalla: Usted aún es un niño(a).

package taller2.ejercicio2;

public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona();

        persona1.pedirEdad();
        persona1.determinarEsMenor();

    }
}
