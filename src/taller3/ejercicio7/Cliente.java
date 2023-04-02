package taller3.ejercicio7;

public class Cliente {

    private String nombrePropietario;
    private long telefonoPropietario;
    private Vehiculo vehiculo;

    public Cliente(String nombrePropietario, long telefonoPropietario, Vehiculo vehiculo) {
        this.nombrePropietario = nombrePropietario;
        this.telefonoPropietario = telefonoPropietario;
        this.vehiculo = vehiculo;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public long getTelefonoPropietario() {
        return telefonoPropietario;
    }

    public void setTelefonoPropietario(long telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
