// Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y
// su nombre completo. Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje:
// [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y
// [Nombre Completo] es actualmente su dueño(a).

package taller1.ejercicio5;

public class Main {
    public static void main(String[] args){

        Mascota mascota = new Mascota();

        mascota.pedirDatos();
        mascota.mostrarMensaje();
    }
}
