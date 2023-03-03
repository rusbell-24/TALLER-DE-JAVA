// Realizar un programa en el cual se solicite la edad de una persona. Si la persona es mayor
// o igual a 18 años, deberá mostrar en pantalla: Usted es mayor de edad.

package taller2.ejercicio1;

public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona();
        persona1.pedirEdad();
        persona1.determinarEsMayor();

    }
}
