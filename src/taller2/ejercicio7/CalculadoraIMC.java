/*
    La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal)
    y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos
    suministrados, debe mostrar el resultado para cada uno y establecer	en qué rango se encuentra
    (bajo peso, normal, sobrepeso y obeso).

* */


package taller2.ejercicio7;

import java.util.Scanner;

public class CalculadoraIMC {

    private float imc;

    public Double calcularIMC(Double peso, Double estatura){
        return peso / Math.pow(estatura, 2);
    }



    public static void main(String[] args) {

        Double peso;
        Double  estatura;

        Scanner input = new Scanner(System.in);

        System.out.println("\n........Calculador de IMC (índice de masa corporal)..........\n");
        System.out.print("Ingrese su peso en kilogramos:  ");
        peso = input.nextDouble();
        System.out.print("Ingrese su estatura en metros: ");
        estatura = input.nextDouble();

        if (peso != null & estatura != null){
            Persona persona1 = new Persona(peso, estatura);
            CalculadoraIMC nuevoCalculo = new CalculadoraIMC();

            persona1.setImc(nuevoCalculo.calcularIMC(persona1.getPeso(), persona1.getEstatura()));

            System.out.println("------------------------------------");
            System.out.println("Su peso es: "+ persona1.getPeso() + " Kg");
            System.out.println("Su estatura es: " + persona1.getEstatura() + " Mts");
            System.out.println("Por ende, su IMC es: " + persona1.getImc());

            if(persona1.getImc() < 18.5) {
                System.out.println("Rango de peso: BAJO DE PESO");
            }

            if(persona1.getImc() >= 18.5 & persona1.getImc() < 25.0) {
                System.out.println("Rango de peso: PESO NORMAL");
            }

            if(persona1.getImc() >= 25.0 & persona1.getImc() < 30.0) {
                System.out.println("Rango de peso: SOBREPESO");
            }

            if(persona1.getImc() >= 30.0) {
                System.out.println("Rango de peso: OBESO");
            }


        }else {
            System.out.println("Error, los campos no fueron llenados de forma  correcta");
        }

    }
}
