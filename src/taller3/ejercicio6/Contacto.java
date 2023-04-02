package taller3.ejercicio6;

import java.util.Scanner;

public class Contacto {
    private String nombre;
    private int telefono;
    private String organizacion;

    public Contacto(String nombre, int telefono, String organizacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.organizacion = organizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
}
