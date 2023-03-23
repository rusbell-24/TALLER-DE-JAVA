package taller2.ejercicio8;

public class Torta {

    private String sabor;
    private int porcion;
    private String decoracion;
    private String decoracion1;
    private String decoracion2;

    public Torta(String sabor, int porcion, String decoracion1, String decoracion2) {
        this.sabor = sabor;
        this.porcion = porcion;
        this.decoracion1 = decoracion1;
        this.decoracion2 = decoracion2;
    }

    public String getSabor() {
        return sabor;
    }

    public int getPorcion() {
        return porcion;
    }

    public String getDecoracion1() {
        return decoracion1;
    }

    public String getDecoracion2() {
        return decoracion2;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }
}
