package taller2.ejercicio5;

public class Producto {

    private String Categoria;
    private String Nombre;
    private int precio;
    private String descripcion;
    private String anotacion;

    public Producto(String categoria, String nombre, int precio, String descripcion) {
        this.Categoria = categoria;
        this.Nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
