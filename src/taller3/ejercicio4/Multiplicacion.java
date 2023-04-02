package taller3.ejercicio4;

public class Multiplicacion {
    private int iterador;
    private int numeroUsuario;
    private int resultado;

    public Multiplicacion(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public void calcularTabla(){
        for (iterador = 1 ; iterador < 11 ; iterador++){
            resultado = iterador * numeroUsuario;
            System.out.println(iterador + " x " + numeroUsuario + " = " + resultado);
        }
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public int getIterador() {
        return iterador;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public int getResultado() {
        return resultado;
    }
}
