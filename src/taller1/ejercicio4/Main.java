// Realizar un programa el cual solicite el nombre de una ciudad capital y el país.
// Al finalizar debe imprimir en pantalla el siguiente mensaje
// "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]

package taller1.ejercicio4;

public class Main {
    public static void main(String[] args){

        Capital ciudadCapital = new Capital();

        ciudadCapital.pedirDatos();
        ciudadCapital.mostrarMensaje();

    }
}
