/*  La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir,
    requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios.
    Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles y
    recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan a presentar
    daños u otra novedad sobre la película.
 */

package taller2.ejercicio4;

import java.util.Scanner;

public class VideoTienda {

    private Pelicula peliculaAlquilada;
    private Pelicula peliculadevolucion;


    public static void main(String[] args) {

        int opcion;
        int opcionCategoria;
        int opcionAlquilar;
        int opcionDevolucion;


        Pelicula peliculaA1 = new Pelicula("El Asesino Perfecto","Accion");
        Pelicula peliculaA2 = new Pelicula("La Toma del Poder","Accion");
        Pelicula peliculaA3 = new Pelicula("El Transportador","Accion");

        Pelicula peliculaCF1 = new Pelicula("Pantera Negra: Wakanda","Ciencia Ficcion");
        Pelicula peliculaCF2 = new Pelicula("Guardianes de la Galaxia","Ciencia Ficcion");
        Pelicula peliculaCF3 = new Pelicula("Black Adam","Ciencia Ficcion");

        Pelicula peliculaT1 = new Pelicula("Llaman a la Puerta","Terror");
        Pelicula peliculaT2 = new Pelicula("La Huérfana","Terror");
        Pelicula peliculaT3 = new Pelicula("La Huésped Maldita","Terror");

        VideoTienda videoTienda = new VideoTienda();

        Scanner input = new Scanner(System.in);

        VideoTienda.showMainMenu();
        opcion = input.nextInt();

        switch (opcion){
            case 1:
                VideoTienda.showConsultationMenu();
                opcionCategoria = input.nextInt();
                switch (opcionCategoria){
                    case 1:
                        System.out.println("1. "+ peliculaA1.getNombre());
                        System.out.println("2. "+ peliculaA2.getNombre());
                        System.out.println("3. "+ peliculaA3.getNombre());
                        break;
                    case 2:
                        System.out.println("1. "+ peliculaCF1.getNombre());
                        System.out.println("2. "+ peliculaCF2.getNombre());
                        System.out.println("3. "+ peliculaCF3.getNombre());
                        break;
                    case 3:
                        System.out.println("1. "+ peliculaT1.getNombre());
                        System.out.println("2. "+ peliculaT2.getNombre());
                        System.out.println("3. "+ peliculaT3.getNombre());
                        break;
                }
                break;
            case 2:
                VideoTienda.showRentalMenu();
                opcionCategoria = input.nextInt();
                switch (opcionCategoria){
                    case 1:
                        System.out.println("-------PELICULAS DE ACCION-----\n");
                        System.out.println("    1. " + peliculaA1.getNombre());
                        System.out.println("    2. " + peliculaA2.getNombre());
                        System.out.println("    3. " + peliculaA3.getNombre());
                        System.out.println("--------------------------------");
                        System.out.println(" Ingrese su opcion: ");
                        opcionAlquilar = input.nextInt();

                        switch (opcionAlquilar) {
                            case 1:
                                videoTienda.peliculaAlquilada = peliculaA1;
                                break;
                            case 2:
                                videoTienda.peliculaAlquilada = peliculaA2;
                                break;
                            case 3:
                                videoTienda.peliculaAlquilada = peliculaA3;
                                break;
                            default:
                                System.out.println("La pelicula seleccionada no esta en nuestra biblioteca");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("-------PELICULAS CIENCIA FICCIÓN-----\n");
                        System.out.println("    1. " + peliculaCF1.getNombre());
                        System.out.println("    2. " + peliculaCF2.getNombre());
                        System.out.println("    3. " + peliculaCF3.getNombre());
                        System.out.println("--------------------------------");
                        System.out.println(" Ingrese su opcion: ");
                        opcionAlquilar = input.nextInt();

                        switch (opcionAlquilar){
                            case 1:
                                videoTienda.peliculaAlquilada = peliculaCF1;
                                break;
                            case 2:
                                videoTienda.peliculaAlquilada = peliculaCF2;
                                break;
                            case 3:
                                videoTienda.peliculaAlquilada = peliculaCF3;
                                break;
                            default:
                                System.out.println("La pelicula seleccionada no esta en nuestra biblioteca");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("-------PELICULAS DE TERROR-----\n");
                        System.out.println("    1. " + peliculaT1.getNombre());
                        System.out.println("    2. " + peliculaT2.getNombre());
                        System.out.println("    3. " + peliculaT3.getNombre());
                        System.out.println("--------------------------------");
                        System.out.println(" Ingrese su opcion: ");
                        opcionAlquilar = input.nextInt();

                        switch (opcionAlquilar) {
                            case 1:
                                videoTienda.peliculaAlquilada = peliculaT1;
                                break;
                            case 2:
                                videoTienda.peliculaAlquilada = peliculaT2;
                                break;
                            case 3:
                                videoTienda.peliculaAlquilada = peliculaT3;
                                break;
                            default:
                                System.out.println("La pelicula seleccionada no esta en nuestra biblioteca");
                                break;
                        }
                        break;
                }

                if (videoTienda.peliculaAlquilada != null) {
                    Usuario usuario = new Usuario();

                    usuario.pedirDatos();

                    System.out.println("--------ALQUILER EXITOSO---------");
                    System.out.println("Datos del alquiler               ");
                    System.out.println("Nombre de pelicula:    " + videoTienda.peliculaAlquilada.getNombre());
                    System.out.println("Categoria de pelicula: " + videoTienda.peliculaAlquilada.getCategoria());
                    System.out.println("Nombre del cliente:    " + usuario.getNombre());
                    System.out.println("Cedula del cliente:    " + usuario.getCedula());
                    System.out.println("Telefono del cliente:  " + usuario.getTelefono());

                }
                break;

            case 3:
                showConsultationMenu();
                opcionCategoria = input.nextInt();

                switch (opcionCategoria) {
                    case 1:
                        System.out.println("1. " + peliculaA1.getNombre());
                        System.out.println("2. " + peliculaA2.getNombre());
                        System.out.println("3. " + peliculaA3.getNombre());
                        System.out.println("\n Digite el numero de la pelicula");
                        opcionDevolucion = input.nextInt();
                        switch (opcionDevolucion) {
                            case 1:
                                videoTienda.peliculadevolucion = peliculaA1;
                                break;
                            case 2:
                                videoTienda.peliculadevolucion = peliculaA2;
                                break;
                            case 3:
                                videoTienda.peliculadevolucion = peliculaA3;
                                break;
                            default:
                                System.out.println("La seleccion no fue correcta....");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1. " + peliculaCF1.getNombre());
                        System.out.println("2. " + peliculaCF2.getNombre());
                        System.out.println("3. " + peliculaCF3.getNombre());
                        opcionDevolucion = input.nextInt();
                        switch (opcionDevolucion) {
                            case 1:
                                videoTienda.peliculadevolucion = peliculaCF1;
                                break;
                            case 2:
                                videoTienda.peliculadevolucion = peliculaCF2;
                                break;
                            case 3:
                                videoTienda.peliculadevolucion = peliculaCF3;
                                break;
                            default:
                                System.out.println("La seleccion no fue correcta....");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("1. " + peliculaT1.getNombre());
                        System.out.println("2. " + peliculaT2.getNombre());
                        System.out.println("3. " + peliculaT3.getNombre());
                        opcionDevolucion = input.nextInt();
                        switch (opcionDevolucion) {
                            case 1:
                                videoTienda.peliculadevolucion = peliculaT1;
                                break;
                            case 2:
                                videoTienda.peliculadevolucion = peliculaT2;
                                break;
                            case 3:
                                videoTienda.peliculadevolucion = peliculaT3;
                                break;
                            default:
                                System.out.println("La seleccion no fue correcta....");
                                break;
                        }
                        break;
                }

                if (videoTienda.peliculadevolucion != null) {
                    Usuario usuario2 = new Usuario();

                    usuario2.pedirDatos();

                    System.out.println("Deje su anotacion: ");
                    input.nextLine();
                    videoTienda.peliculadevolucion.setAnotacion(input.nextLine());

                    System.out.println(" El usuario " + usuario2.getNombre() + " con cedula de ciudadania " +
                            usuario2.getCedula() +" y telefono " + usuario2.getTelefono() + " describe que: " +
                            videoTienda.peliculadevolucion.getAnotacion());

                }

            break;
        }

    }


    public static void showMainMenu(){
        System.out.println("\n--------Menu: TIENDA DE PELICULAS---------");
        System.out.println("|                                           |");
        System.out.println("|         1. Consultar peliculas            |");
        System.out.println("|         2. Alquilar pelicula              |");
        System.out.println("|         3. Devolucion                |");
        System.out.println("|___________________________________________|");
        System.out.println("|  Ingrese su opcion:                       |");
        System.out.println(" -------------------------------------------");
    }

    public static void showConsultationMenu(){
        System.out.println("\n----SECCION DE CONSULTAS O DEVOLUCIONES----");
        System.out.println("|                                           |");
        System.out.println("|         1. Acción                         |");
        System.out.println("|         2. Ciencia Ficción                |");
        System.out.println("|         3. Terror                         |");
        System.out.println("|___________________________________________|");
        System.out.println("|  Ingrese su opcion:                       |");
        System.out.println(" -------------------------------------------");
    }

    public static void showRentalMenu(){
        System.out.println("\n-----------SECCION DE ALQUILER-----------");
        System.out.println("|                                           |");
        System.out.println("|         1. Acción                         |");
        System.out.println("|         2. Ciencia Ficción                |");
        System.out.println("|         3. Terror                         |");
        System.out.println("|___________________________________________|");
        System.out.println("|  Ingrese su opcion:                       |");
        System.out.println(" -------------------------------------------");
    }



}
