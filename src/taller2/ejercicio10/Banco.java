package taller2.ejercicio10;

import java.util.Scanner;

public class Banco {

    public static void menuPrincipal(){
        System.out.println(".......BIENVENIDO A SU BANCO FIEL.......\n");
        System.out.println("OPCIONES DEL SYSTEMA____________________");
        System.out.println("    1. Consultar saldo ");
        System.out.println("    2. Consignar  ");
        System.out.println("    3. Retirar");
        System.out.println("    4. Salir");
        System.out.println("----------------------------------------");
        System.out.println("Ingrese su opcion: ");
    }

    public static void menuConsinaciones(Cuenta usuario){
        int cantidad;

        Scanner input =new Scanner(System.in);

        System.out.println("Titular: " + usuario.getTitular());
        System.out.println("Saldo actual: " + usuario.getCantidad());
        System.out.println("Ingrese valor a consignar: ");
        cantidad =input.nextInt();

        if (cantidad > 0) {
            usuario.movimiento(cantidad, "consignacion");
            System.out.println(usuario.getTitular());
            System.out.println("Su nuevo saldo es: $" + usuario.getCantidad());
            System.out.println("Hasta pronto.................");
        }else{
            System.out.println("Lo sentimos, no se aceptan valores negativos");
        }
    }
    public static void menuRetiros(Cuenta usuario){
        int cantidad;

        Scanner input =new Scanner(System.in);

        System.out.println("Titular: " + usuario.getTitular());
        System.out.println("Saldo actual: " + usuario.getCantidad());
        System.out.println("Ingrese valor a Retirar: ");
        cantidad =input.nextInt();

        if (cantidad > 0){
            if (cantidad <= usuario.getCantidad()) {
                usuario.movimiento(cantidad, "retiro");
                System.out.println(usuario.getTitular());
                System.out.println("Usted acaba de retirar: $" + cantidad);
                System.out.println("Su nuevo saldo es: $" + usuario.getCantidad());
                System.out.println("Hasta pronto.................");
            }else{
                System.out.println("Lo sentimos, no tiene fondos suficientes para el retiro");
            }
        }else{
            System.out.println("Lo sentimos, no se aceptan valores negativos");
        }
    }


    public static void main(String[] args) {
        int opcion;
        String titularIngresado;
        int cantidad;

        Cuenta usuario1 = new Cuenta("user1", 2000000);
        Cuenta usuario2 = new Cuenta("user2", 4500000);
        Cuenta usuario3 = new Cuenta("user3", 10005000);

        Scanner input =  new Scanner(System.in);

        menuPrincipal();
        opcion = input.nextInt();

        switch (opcion){
            case 1:
                System.out.print("Ingrese titular de la cuenta: ");
                titularIngresado = input.next();

                if (titularIngresado.toString().contains(usuario1.getTitular())){
                    System.out.println("Titular: " + usuario1.getTitular());
                    System.out.println("Su saldo es: $" + usuario1.getCantidad());
                }else if (titularIngresado.toString().contains(usuario2.getTitular())){
                    System.out.println("Titular: " + usuario2.getTitular());
                    System.out.println("Su saldo es: $" + usuario2.getCantidad());
                }else if (titularIngresado.toString().contains(usuario3.getTitular())){
                    System.out.println("Titular: " + usuario3.getTitular());
                    System.out.println("Su saldo es: $" + usuario3.getCantidad());
                }else {
                    System.out.println("El usuario ingresado no tiene productos nuestros");
                }
                break;

            case 2:
                System.out.print("Ingrese titular de la cuenta: ");
                titularIngresado = input.next();

                if (titularIngresado.toString().contains(usuario1.getTitular())){
                    menuConsinaciones(usuario1);

                }else if (titularIngresado.toString().contains(usuario2.getTitular())){
                    menuConsinaciones(usuario2);
                }else if (titularIngresado.toString().contains(usuario3.getTitular())){
                    menuConsinaciones(usuario3);
                }else{
                    System.out.println("El usuario ingresado no tiene productos nuestros");
                }
                break;

            case 3:
                System.out.print("Ingrese titular de la cuenta: ");
                titularIngresado = input.next();

                if (titularIngresado.toString().contains(usuario1.getTitular())){
                    menuRetiros(usuario1);

                }else if (titularIngresado.toString().contains(usuario2.getTitular())){
                    menuRetiros(usuario2);
                }else if (titularIngresado.toString().contains(usuario3.getTitular())){
                    menuRetiros(usuario3);
                }else{
                    System.out.println("El usuario ingresado no tiene productos nuestros");
                }
                break;

            case 4:
                System.out.println("HASTA PRONTO.........");
                break;

            default:
                System.out.println("La opcion ingresada no es correcta...");
                System.out.println("HASTA PRONTO.........");
                break;
        }



    }
}
