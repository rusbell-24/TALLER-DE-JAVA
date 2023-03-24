package taller2.ejercicio10;

public class Cuenta {
    private String titular;
    private int cantidad;

    public Cuenta(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void movimiento(int valor, String tipoMovimiento){
        if (tipoMovimiento == "consignacion"){
            cantidad += valor;
        }else if (tipoMovimiento == "retiro"){
            cantidad -= valor;
        }
    }

    public String getTitular() {
        return titular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
