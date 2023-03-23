package taller2.ejercicio7;

public class Persona {
    private final Double peso;
    private final Double estatura;
    private Double imc;

    public Persona(Double peso, Double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

}
