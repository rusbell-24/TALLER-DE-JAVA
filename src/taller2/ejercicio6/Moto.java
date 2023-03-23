package taller2.ejercicio6;

import java.util.Scanner;

public class Moto {
    private String marca;
    private String modelo;
    private String placa;

    private String observaciones;
    private String novedades;
    private String arreglos;
    private String fechaIngreso;
    private String fechaSalida;

    public Moto() {
    }

    // Metodo para pedir datos de la moto
    public void leerDatos(){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la marca de la moto: ");
        marca = input.nextLine();
        System.out.print("Ingrese el modelo de la moto: ");
        modelo = input.nextLine();
        System.out.print("Ingrese la placa de la moto: ");
        placa = input.nextLine();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }

    public String getArreglos() {
        return arreglos;
    }

    public void setArreglos(String arreglos) {
        this.arreglos = arreglos;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFevhaSalida(String fevhaSalida) {
        this.fechaSalida = fevhaSalida;
    }
}
