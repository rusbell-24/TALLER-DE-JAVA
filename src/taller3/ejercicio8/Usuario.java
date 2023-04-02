package taller3.ejercicio8;

public class Usuario {
    private String nombre;
    private long numeroDocumento;
    private float nota;
    private boolean estadoCurso;

    public Usuario(String nombre, long numeroDocumento, float nota, boolean estadoCurso) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.nota = nota;
        this.estadoCurso = estadoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(boolean estadoCurso) {
        this.estadoCurso = estadoCurso;
    }
}
