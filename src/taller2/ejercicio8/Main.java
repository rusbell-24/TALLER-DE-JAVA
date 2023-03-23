/*  El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que le permita registrar los
    pedidos de los clientes en cuanto a las tortas que realiza. Cada torta tiene unas características propias como
    sabor, cantidad (porciones) y decoraciones). Se requiere que la aplicación permita registrar los pedidos,
     las tortas disponibles y las ventas que se registren diariamente.
*/
package taller2.ejercicio8;

import java.util.Scanner;

public class Main {

    public static void mostrarMenuPrincipal(){
        System.out.println(".......PASTELERIA DON CARLOS.........");
        System.out.println("       1. Tortas disponibles ");
        System.out.println("       2. Registrar venta ");
        System.out.println("       3. Salir");
        System.out.println("........................................");
        System.out.print("Ingrese su opcion:  ");
    }

    public static void mostrarTortas(Torta torta1, Torta torta2, Torta torta3, Torta torta4, Torta torta5, String palabra){
        System.out.println("\n" + palabra + "_______________");
        System.out.println("   1. " + torta1.getSabor() );
        System.out.println("   2. " + torta2.getSabor() );
        System.out.println("   3. " + torta3.getSabor() );
        System.out.println("   4. " + torta4.getSabor() );
        System.out.println("   5. " + torta5.getSabor() );
        System.out.println("   6. Salir");
        System.out.println("---------------------------------");
        System.out.print(" Ingrese su opcion: ");
    }

    public static void verOpcionesTorta(Torta torta){
        System.out.println("\n" + torta.getSabor());
        System.out.println("Numero de porciones: " + torta.getPorcion());
        System.out.println("Decoraciones: ");
        System.out.println(" * " + torta.getDecoracion1());
        System.out.println(" * " + torta.getDecoracion2());
        System.out.println("---------------------------------");
        System.out.println("OPCIONES:........................");
        System.out.println("    1. Realizar pedido ");
        System.out.println("    2. Salir");
        System.out.println("---------------------------------");
        System.out.print("Ingrese su opcion:");
    }

    public static void mostrarMenuPedido(Torta tortaActual){
        System.out.println("\nSeleccione la decoracion: ");
        System.out.println("   1. " + tortaActual.getDecoracion1());
        System.out.println("   2. " + tortaActual.getDecoracion2());
        System.out.print("Ingrese su opcion: ");
    }

    public static void mostrarConfirmacionPedido(Usuario comprador){
        System.out.println("\n-------PEDIDO EXITOSO");
        System.out.println("Ficha de pedido_______________________");
        System.out.println("   Cliente: " + comprador.getNombre());
        System.out.println("   Direccion: " + comprador.getDireccion());
        System.out.println("   Numero de tortas pedidas: " + comprador.getNumeroTortasComprada());
        System.out.println("   Porciones por torta: " + comprador.getTortaComprada().getPorcion());
        System.out.println("   Decoracion: " + comprador.getTortaComprada().getDecoracion());
    }

    public static Torta registrarTorta(Torta torta){
        int opcion;
        Scanner input = new Scanner(System.in);

        System.out.println("\nseleccione la decoracion escogida");
        System.out.println("   1. " + torta.getDecoracion1());
        System.out.println("   2. " + torta.getDecoracion2());
        System.out.println("--------------------------------");
        System.out.print("Ingrese opcion: ");
        opcion = input.nextInt();
        switch (opcion){
            case 1:
                torta.setDecoracion(torta.getDecoracion1());
                return torta;

            case 2:
                torta.setDecoracion(torta.getDecoracion2());
                return torta;
            default:
                System.out.println("Opcion incorrecta......");
                return null;
        }
    }

    public static void registrarCompra(Usuario comprador){
        System.out.println("\n........REGISTRO DE VENTA EXITOSO........");
        System.out.println("Ficha de registros de venta________\n");
        System.out.println("   Nombre de cliente: " + comprador.getNombre());
        System.out.println("   Direcion del cliente: " + comprador.getDireccion());
        System.out.println("   Torta vendida: " + comprador.tortaComprada.getSabor());
        System.out.println("   Decoracion: " + comprador.tortaComprada.getDecoracion());
        System.out.println("   Numero de tortas vendidas: " + comprador.getNumeroTortasComprada());
    }


    public static void main(String[] args) {
        int opcion1, seleccionTorta, opcionFinal, opDecoracion;
        boolean pedido = false;
        int numeroTortas;
        Torta tortaActual = null;
        int porcionesActual;

        Torta torta1 = new Torta("Tres leches", 20, "Para cumpleaños", "Para graduación");
        Torta torta2 = new Torta("Jenovesa", 30, "Para matrimonios", "Para graduación");
        Torta torta3 = new Torta("Tiramisu", 30, "Para eventos familiares", "Para cumpleaños");
        Torta torta4 = new Torta("Alfajores", 35, "Para eventos empresariales", "Para graduación");
        Torta torta5 = new Torta("Pavlova", 40, "Para eventos empresariales", "Para aniversarios");

        Scanner input =new Scanner(System.in);

        mostrarMenuPrincipal();
        opcion1 = input.nextInt();

        switch (opcion1){
            case 1:
                mostrarTortas(torta1, torta2, torta3, torta4, torta5, "Tortas disponibles");
                seleccionTorta = input.nextInt();

                switch (seleccionTorta){
                    case 1:
                        verOpcionesTorta(torta1);
                        opcionFinal = input.nextInt();

                        switch (opcionFinal){
                            case 1:
                                pedido = true;
                                tortaActual = torta1;
                                break;
                            case 2:
                                System.out.println("Hasta pronto");
                                break;
                            default:
                                System.out.println("La opcion ingresada no es correcta.....");
                                break;
                        }
                        break;
                    case 2:
                        verOpcionesTorta(torta2);
                        opcionFinal = input.nextInt();

                        switch (opcionFinal){
                            case 1:
                                pedido = true;
                                tortaActual = torta2;
                                break;
                            case 2:
                                System.out.println("Hasta pronto");
                                break;
                            default:
                                System.out.println("La opcion ingresada no es correcta");
                                break;
                        }
                        break;
                    case 3:
                        verOpcionesTorta(torta3);
                        opcionFinal = input.nextInt();

                        switch (opcionFinal){
                            case 1:
                                pedido = true;
                                tortaActual = torta3;
                                break;
                            case 2:
                                System.out.println("Hasta pronto");
                                break;
                            default:
                                System.out.println("La opcion ingresada no es correcta");
                                break;
                        }
                        break;
                    case 4:
                        verOpcionesTorta(torta4);
                        opcionFinal = input.nextInt();

                        switch (opcionFinal){
                            case 1:
                                pedido = true;
                                tortaActual = torta4;
                                break;
                            case 2:
                                System.out.println("Hasta pronto");
                                break;
                            default:
                                System.out.println("La opcion ingresada no es correcta");
                                break;
                        }
                        break;
                    case 5:
                        verOpcionesTorta(torta5);
                        opcionFinal = input.nextInt();

                        switch (opcionFinal){
                            case 1:
                                pedido = true;
                                tortaActual = torta5;
                                break;
                            case 2:
                                System.out.println("Hasta pronto");
                                break;
                            default:
                                System.out.println("La opcion ingresada no es correcta");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("La opcion ingresada no es correcta.......");
                        break;
                }

                if (pedido == true){
                    mostrarMenuPedido(tortaActual);
                    opDecoracion =input.nextInt();
                    switch (opDecoracion){
                        case 1:
                            tortaActual.setDecoracion(tortaActual.getDecoracion1());
                            break;
                        case 2:
                            tortaActual.setDecoracion(tortaActual.getDecoracion2());
                            break;
                        default:
                            System.out.println("La opcion ingresada no es correcta");
                            break;
                    }

                    if(opDecoracion == 1 || opDecoracion == 2){
                        Usuario comprador = new Usuario();

                        comprador.pedirDatos();
                        comprador.setTortaComprada(tortaActual);
                        System.out.println("Ingrese el numero de tortas: ");
                        comprador.setNumeroTortasComprada(input.nextInt());

                        if (comprador.getNombre() != "" & comprador.getNumeroTortasComprada() > 0 & comprador.getDireccion() != "" ){
                            mostrarConfirmacionPedido(comprador);
                        }else{
                            System.out.println("Error, campos sin llenar");
                        }
                    }


                }
                break;

            case 2:
                Usuario comprador = new Usuario();
                comprador.pedirDatos();
                mostrarTortas(torta1, torta2, torta3, torta4, torta5, "Seleccion la torta vendida");
                seleccionTorta= input.nextInt();
                switch (seleccionTorta){
                    case 1:
                        tortaActual = registrarTorta(torta1);
                        break;
                    case 2:
                        tortaActual = registrarTorta(torta2);
                        break;
                    case 3:
                        tortaActual = registrarTorta(torta3);
                        break;
                    case 4:
                        tortaActual = registrarTorta(torta4);
                        break;
                    case 5:
                        tortaActual = registrarTorta(torta5);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        tortaActual = null;
                }

                if(tortaActual != null){
                    System.out.println("Ingrese la cantidad de tortas vendidas");
                    numeroTortas = input.nextInt();

                    if (comprador.getNombre() != "" & comprador.getDireccion() != "" & numeroTortas > 0){
                        comprador.setTortaComprada(tortaActual);
                        comprador.setNumeroTortasComprada(numeroTortas);
                        registrarCompra(comprador);
                    }else {
                        System.out.println("Error, Campos sin llenar");
                    }
                    break;
                }

            case 3:
                System.out.println("HASTA PRONTO...");

        }


    }
}
