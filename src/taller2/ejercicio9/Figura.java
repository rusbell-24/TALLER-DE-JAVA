package taller2.ejercicio9;

public class Figura {

    private double base;
    private double baseMenor;
    private double altura;
    private int divisor;
    private double resultado;

    public Figura(double base, double baseMenor, double altura, int divisor) {
        this.base = base;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.divisor = divisor;
    }

    public void calcular() {
        resultado = ((base + baseMenor) * altura)/divisor;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public double getResultado() {
        return resultado;
    }
}
