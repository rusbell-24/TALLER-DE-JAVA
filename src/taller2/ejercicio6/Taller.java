/*
    El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones y
    requiere una aplicación que le permita registrar los servicios generados a sus clientes. Para cada motocicleta se
    debe tener registro del ingreso al taller y las observaciones por parte del cliente. También debe existir
    registro de salida del taller con las novedades y otra de arreglos hechos por el mecánico en caso de que se
    requiera inventariar cambios repuestos en la motocicleta al entregarla.

* */


package taller2.ejercicio6;

import java.util.Scanner;

public class Taller {

    //Metodo para registrar ingreso
    public static boolean registrarIngreso(Moto nuevaMoto){
        Scanner input = new Scanner(System.in);

        System.out.println("\n-----Sistema de registro de ingreso------");
        nuevaMoto.leerDatos();
        System.out.print("Ingrese sus observaciones respecto a la moto: ");
        nuevaMoto.setObservaciones(input.nextLine());
        System.out.print("Digite fecha de ingreso (dd/mm/aaaa): ");
        nuevaMoto.setFechaIngreso(input.nextLine());

        if (nuevaMoto.getMarca() != "" & nuevaMoto.getModelo() != "" &
            nuevaMoto.getPlaca() != "" & nuevaMoto.getObservaciones() != "" &
            nuevaMoto.getFechaIngreso() != ""){
            return true;
        }else {
            return false;
        }

    }


    //Metodopara registrar salida
    public static boolean registrarSalida(Moto motoSalir) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n-----Sistema de registro de salida------");
        motoSalir.leerDatos();
        System.out.print("Ingrese las novedades de salida de la moto: ");
        motoSalir.setNovedades(input.nextLine());
        System.out.print("Decsriba los arreglos realizados a la moto: ");
        motoSalir.setArreglos(input.nextLine());
        System.out.print("Digite fecha de salida (dd/mm/aaaa): ");
        motoSalir.setFevhaSalida(input.nextLine());

        if (motoSalir.getMarca() != "" & motoSalir.getModelo() != "" &
                motoSalir.getPlaca() != "" & motoSalir.getNovedades() != "" &
                motoSalir.getArreglos() != "" & motoSalir.getFechaSalida() != "") {
            return true;
        } else {
            return false;
        }

    }

    public static void verMenu(){
        System.out.println("\n-------TALLER DE MOTOS ***EL MAQUINISTA***-------");
        System.out.println("---------------------------------------------------");
        System.out.println("			1. Registros de Ingreso"                );
        System.out.println("			2. Registro de salida"                  );
        System.out.println("			3. salir"                               );
        System.out.println("---------------------------------------------------");
        System.out.print(" Ingrese su opcion:   ");
    }

    public static void main(String[] args) {

        int opcion1;
        boolean estadoIngreso;
        boolean estadoSalida;

        Scanner input = new Scanner(System.in);

        Taller.verMenu();
        opcion1 = input.nextInt();

        switch (opcion1){
            case 1:
                Moto nuevaMoto = new Moto();
                estadoIngreso = Taller.registrarIngreso(nuevaMoto);

                if (estadoIngreso){
                    System.out.println("\n\n-----------REGISTRO DE INGRESO EXITOSO--------------");
                    System.out.println("* La moto de marca " + nuevaMoto.getMarca() +  " modelo " +
                            nuevaMoto.getModelo() + " con placas " + nuevaMoto.getPlaca() +
                            " Ingresa con las siguientes observaciones: " + nuevaMoto.getObservaciones());
                    System.out.println("* Fecha De Ingreso: " + nuevaMoto.getFechaIngreso());
                }else {
                    System.out.println("Error, Formulario de Ingreso Incompleto");
                }

                break;

            case 2:
                Moto motoSalir = new Moto();
                estadoSalida = Taller.registrarSalida(motoSalir);

                if (estadoSalida){
                    System.out.println("\n\n.........REGISTRO DE SALIDA EXITOSO..........");
                    System.out.println("Ficha de salida__________\n");
                    System.out.println("Marca: " + motoSalir.getMarca());
                    System.out.println("Modelo: " + motoSalir.getModelo());
                    System.out.println("Placa: " + motoSalir.getPlaca());
                    System.out.println("Novedades de salida: " + motoSalir.getNovedades());
                    System.out.println("Arreglos realizados: " + motoSalir.getArreglos());
                    System.out.println("Fecha de salida: " + motoSalir.getFechaSalida());
                }else{
                    System.out.println("\nError, Formulario de Salida Incompleto");
                }
                break;

            case  3:
                System.out.println("\n\nHasta pronto......");
                break;

            default:
                System.out.println("\n\nError, Opcion incorrecta");
                break;
        }

    }
}
