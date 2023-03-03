// Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y
// apellidos de su padre y madre. Al finalizar debe imprimir en pantalla el siguiente mensaje
// "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].

package taller1.ejercicio3;

public class Main {
    public static void main(String[] args){

        Usuario usuario = new Usuario();

        usuario.pedirDatos();
        usuario.mostrarMensaje();

    }
}
