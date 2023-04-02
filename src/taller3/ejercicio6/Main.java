package taller3.ejercicio6;

/*
*   Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo.
	Para ello cada contacto debe contener nombre completo, teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos verificando
	que el número no esté almacenado, buscar contactos almacenados y eliminar contactos si el usuario lo requiere.
	Recuerde que el sistema debe terminar cuando el usuario así lo indique
* */

import java.util.Scanner;

public class Main {

    private static String nombre, organizacion;
    private static int telefono;

    public static void menuPrincipal(){
        System.out.println("______DIRECTORIO TELEFONICO__________");
        System.out.println("OPCIONES del directorio______________");
        System.out.println("");
        System.out.println("       1. Buscar contactos");
        System.out.println("       2. Añadir contacto");
        System.out.println("       3. Eliminar contacto");
        System.out.println("       4. Salir del sistema");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese su opcion: ");
    }

    public static void mostrarContacto(int posicion, Contacto contacto){
        System.out.println("");
        System.out.println("CONTACTO #" + posicion);
        System.out.println("-> Nombre:       " + contacto.getNombre());
        System.out.println("-> Telefono:     " + contacto.getTelefono());
        System.out.println("-> Organizacion: " + contacto.getOrganizacion() + "\n\n");
    }

    public static void pedirDatos(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese nombre completo del contacto: ");
        nombre = input.next();
        System.out.print("Ingrese telefono del contacto: ");
        telefono = input.nextInt();
        System.out.print("Ingrese organizacion del contacto: ");
        organizacion = input.next();

    }


    public static void main(String[] args) {

        int opcion, numeroContactosExistentes, numeroEliminar;
        boolean contactosExistentes = false, agregado =false, contactoUno=false, contactoDos=false, contactoTres=false, encontrado = false;
        String nombreBuscar;

        Scanner input =new Scanner(System.in);

        Contacto contacto1 = new Contacto("", 0, "");
        Contacto contacto2 = new Contacto("", 0, "");
        Contacto contacto3 = new Contacto("", 0, "");

        do {
            contactosExistentes = false;
            numeroContactosExistentes = 0;

            menuPrincipal();
            opcion = input.nextInt();

            if (opcion == 1 || opcion ==2 || opcion == 3){
                if (contacto1.getNombre() != "" & contacto1.getTelefono() > 0 & contacto1.getOrganizacion() != ""){
                    contactosExistentes = true;
                    contactoUno=true;
                    numeroContactosExistentes++;
                }
                if (contacto2.getNombre() != "" & contacto2.getTelefono() > 0 & contacto2.getOrganizacion() != ""){
                    contactosExistentes = true;
                    contactoDos=true;
                    numeroContactosExistentes++;
                }
                if (contacto3.getNombre() != "" & contacto3.getTelefono() > 0 & contacto3.getOrganizacion() != ""){
                    contactosExistentes = true;
                    contactoTres=true;
                    numeroContactosExistentes++;
                }
            }

            switch (opcion){
                case 1:
                    encontrado =false;
                    if(contactosExistentes){
                        System.out.print("Ingrese el nombre a buscar: ");
                        nombreBuscar= input.next();

                        if (nombreBuscar != ""){
                            if (contactoUno & !encontrado){
                                if (nombreBuscar.equals(contacto1.getNombre())){
                                    mostrarContacto(1, contacto1);
                                    encontrado = true;
                                }
                            }
                            if (contactoDos & !encontrado){
                                if (nombreBuscar.equals(contacto2.getNombre())){
                                    mostrarContacto(2, contacto2);
                                    encontrado = true;
                                }
                            }
                            if (contactoTres & !encontrado){
                                if (nombreBuscar.equals(contacto3.getNombre())){
                                    mostrarContacto(3, contacto3);
                                    encontrado = true;
                                }
                            }

                            if (!encontrado){
                                System.out.println("\n\nEl nombre de contacto no fue encontrado en el directorio...\n\n");
                            }

                        }else{
                            System.out.println("\n\nNo ingresaste ningun nombre");
                        }

                    }else {
                        System.out.println("\n\nEL DIRECTORIO SE ENCUENTRA VACIO\n\n");
                    }
                    break;

                case 2:
                    if (numeroContactosExistentes < 3){
                        agregado = false;

                        if (!contactoUno & !agregado){
                            pedirDatos();
                            if (nombre != "" & telefono > 0 & organizacion != ""){
                                if (telefono != contacto2.getTelefono() & telefono != contacto3.getTelefono()){
                                    contacto1.setNombre(nombre);
                                    contacto1.setTelefono(telefono);
                                    contacto1.setOrganizacion(organizacion);
                                    System.out.println("\n\nEl contacto " + contacto1.getNombre() + " Se guardo exitosamente\n\n");
                                    agregado = true;
                                }else{
                                    nombre = "";
                                    telefono = 0;
                                    organizacion = "";
                                    System.out.println("\n\nEl numero decontacto ya existe en el directorio...\n\n");
                                    break;
                                }
                            }else {
                                nombre = "";
                                telefono = 0;
                                organizacion = "";
                                System.out.println("\n\nError, Faltaron campos por llenar..\n\n");
                                break;
                            }
                        }
                        if (!contactoDos & !agregado){
                            pedirDatos();
                            if (nombre != "" & telefono > 0 & organizacion != ""){
                                if (telefono != contacto1.getTelefono() & telefono != contacto3.getTelefono()){
                                    contacto2.setNombre(nombre);
                                    contacto2.setTelefono(telefono);
                                    contacto2.setOrganizacion(organizacion);
                                    System.out.println("\n\nEl contacto " + contacto2.getNombre() + " Se guardo exitosamente\n\n");
                                    agregado = true;
                                }else{
                                    nombre = "";
                                    telefono = 0;
                                    organizacion = "";
                                    System.out.println("\n\nEl numero decontacto ya existe en el directorio...\n\n");
                                    break;
                                }
                            }else {
                                nombre = "";
                                telefono = 0;
                                organizacion = "";
                                System.out.println("\n\nError, Faltaron campos por llenar..\n\n");
                                break;
                            }
                        }
                        if (!contactoTres & !agregado){
                            pedirDatos();
                            if (nombre != "" & telefono > 0 & organizacion != ""){
                                if (telefono != contacto1.getTelefono() & telefono != contacto2.getTelefono()){
                                    contacto3.setNombre(nombre);
                                    contacto3.setTelefono(telefono);
                                    contacto3.setOrganizacion(organizacion);
                                    System.out.println("\n\nEl contacto " + contacto3.getNombre() + " Se guardo exitosamente\n\n");
                                    agregado = true;
                                }else{
                                    nombre = "";
                                    telefono = 0;
                                    organizacion = "";
                                    System.out.println("\n\nEl numero decontacto ya existe en el directorio...\n\n");
                                    break;
                                }
                            }else {
                                nombre = "";
                                telefono = 0;
                                organizacion = "";
                                System.out.println("\n\nError, Faltaron campos por llenar..\n\n");
                                break;
                            }
                        }
                    }else{
                        System.out.println("\n\nEL DIRECTORIO SE ENCUENTRA LLENO.....\n\n");
                    }
                    break;

                case 3:
                    if (contactosExistentes){
                        if (contactoUno){
                            mostrarContacto(1, contacto1);
                        }
                        if (contactoDos){
                            mostrarContacto(2, contacto2);
                        }
                        if (contactoTres){
                            mostrarContacto(3, contacto3);
                        }

                        System.out.print("\n\nIngrese el numero (#) del contacto a eliminar: ");
                        numeroEliminar = input.nextInt();

                        switch (numeroEliminar){
                            case 1:
                                contacto1.setNombre("");
                                contacto1.setTelefono(0);
                                contacto1.setOrganizacion("");
                                contactoUno = false;
                                System.out.println("\n\nEliminacion de contacto exitosa\n\n");
                                break;
                            case 2:
                                contacto2.setNombre("");
                                contacto2.setTelefono(0);
                                contacto2.setOrganizacion("");
                                contactoDos = false;
                                System.out.println("\n\nEliminnacion de contacto exitosa\n\n");
                                break;
                            case 3:
                                contacto3.setNombre("");
                                contacto3.setTelefono(0);
                                contacto3.setOrganizacion("");
                                contactoTres = false;
                                System.out.println("\n\nEliminnacion de contacto exitosa\n\n");
                                break;
                            default:
                                System.out.println("\n\nEl contacto seleccionado no existe en el directorio\n\n");
                                break;
                        }
                    }else {
                        System.out.println("\n\nEL DIRECTORIO YA SE ENCUENTRA VACIO\n\n");
                    }
                    break;
            }


        }while (opcion != 4);

        System.out.println("\n\nHASTA PRONTO......");

    }

}
