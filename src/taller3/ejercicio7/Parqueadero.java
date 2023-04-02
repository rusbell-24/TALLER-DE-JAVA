package taller3.ejercicio7;

/*
    El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y requiere
    una aplicación que permita registrar los vehículos que se cuidan en estas instalaciones. Se sugiere que el
    parqueadero tenga los atributos del vehículo como son, placa y marca, y los datos del cliente como son
    nombre completo y número de teléfono. Para cada vehículo se debe permitir la opción de ingresar al parqueadero,
    retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. Recuerde que el sistema debe
    terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.

* */

import java.util.Scanner;

public class Parqueadero {


    public static void limpiarEspacioParqueo(Cliente cliente){
        cliente.setNombrePropietario("");
        cliente.setTelefonoPropietario(0);
        cliente.getVehiculo().setMarca("");
        cliente.getVehiculo().setPlaca("");
    }

    public static int menuPrincipal(){
        int opcion;

        Scanner input = new Scanner(System.in);

        System.out.println("____________PARQUEADERO  EL GUARDIAN_________");
        System.out.println("");
        System.out.println("Opciones del parqueadero:");
        System.out.println("");
        System.out.println("1. Ingresar al parqueadero");
        System.out.println("2. Retirar del parqueadero");
        System.out.println("3. Consultar vehiculo");
        System.out.println("4. Listar todo los vehiculos");
        System.out.println("5. Salir");
        System.out.println("--------------------------------------------");
        System.out.println(" Ingrese su opcion: ");
        opcion = input.nextInt();
        return opcion;
    }

    public static void solicitarDatosUsuario(Cliente cliente){

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese nombre completo del propietario: ");
        cliente.setNombrePropietario(input.next());
        System.out.print("Ingrese telefono del propieatario: ");
        cliente.setTelefonoPropietario(input.nextInt());
        System.out.print("Ingrese la marca del vehiculo: ");
        cliente.getVehiculo().setMarca(input.next());
        System.out.print("Ingrese la placa del vehiculo: ");
        cliente.getVehiculo().setPlaca(input.next());
    }

    public static boolean consultarVehiculo(Cliente cliente){

        System.out.println("El vehiculo marca " + cliente.getVehiculo().getMarca() + " y placa " + cliente.getVehiculo().getPlaca() + " se encuentra en el parqueadero " +
                "A nombre de: " + cliente.getNombrePropietario());

        return true;
    }

    public static void confirmacionIngreso(Cliente cliente){

        System.out.println("\n\n-> El vehiculo de marca " + cliente.getVehiculo().getMarca() + " y placa "
                + cliente.getVehiculo().getPlaca() + " se guardo exitosamente");
        System.out.println("-> A nombre de: " + cliente.getNombrePropietario());
        System.out.println("-< Con numero de contacto: " + cliente.getTelefonoPropietario() + "\n\n");
    }

    public static void mostrarVehiculos(int numeroVehiculo, Cliente cliente){

        System.out.println("");
        System.out.println("vehiculo #" + numeroVehiculo + ":");
        System.out.println("-> Nombre:   " + cliente.getNombrePropietario());
        System.out.println("-> Telefono: " + cliente.getTelefonoPropietario());
        System.out.println("-> Marca:    " + cliente.getVehiculo().getMarca());
        System.out.println("-> Placa:    " + cliente.getVehiculo().getPlaca());
        System.out.println("\n\n");

    }


    public static void main(String[] args) {

        int opcion, numeroVehiculosExistentes;
        String placa, nombreCompleto;
        boolean vehiculosExistentes = false,
                clienteUno = false,
                clienteDos = false,
                clienteTres = false,
                clienteCuatro = false,
                clienteCinco = false,
                ingresado = false,
                retirado =false,
                encontrado = false;


        Cliente cliente1 = new Cliente("",0, new Vehiculo("", ""));
        Cliente cliente2 = new Cliente("",0, new Vehiculo("", ""));
        Cliente cliente3 = new Cliente("",0, new Vehiculo("", ""));
        Cliente cliente4 = new Cliente("",0, new Vehiculo("", ""));
        Cliente cliente5 = new Cliente("",0, new Vehiculo("", ""));


        Scanner input =new Scanner(System.in);

        do {

            vehiculosExistentes = false;
            ingresado = false;
            encontrado= false;
            retirado = false;
            numeroVehiculosExistentes = 0;

            opcion = menuPrincipal();

            if (opcion ==1 || opcion == 2 || opcion == 3 || opcion == 4){
                if (cliente1.getVehiculo().getMarca() != "" & cliente1.getVehiculo().getPlaca() != "" &
                cliente1.getNombrePropietario() != "" & cliente1.getTelefonoPropietario() > 0){
                    vehiculosExistentes=true;
                    clienteUno = true;
                    numeroVehiculosExistentes++;
                }
                if (cliente2.getVehiculo().getMarca() != "" & cliente2.getVehiculo().getPlaca() != "" &
                        cliente2.getNombrePropietario() != "" & cliente2.getTelefonoPropietario() > 0){
                    vehiculosExistentes=true;
                    clienteDos = true;
                    numeroVehiculosExistentes++;
                }
                if (cliente3.getVehiculo().getMarca() != "" & cliente3.getVehiculo().getPlaca() != "" &
                        cliente3.getNombrePropietario() != "" & cliente3.getTelefonoPropietario() > 0){
                    vehiculosExistentes=true;
                    clienteTres = true;
                    numeroVehiculosExistentes++;
                }
                if (cliente4.getVehiculo().getMarca() != "" & cliente4.getVehiculo().getPlaca() != "" &
                        cliente4.getNombrePropietario() != "" & cliente4.getTelefonoPropietario() > 0){
                    vehiculosExistentes=true;
                    clienteCuatro = true;
                    numeroVehiculosExistentes++;
                }
                if (cliente5.getVehiculo().getMarca() != "" & cliente5.getVehiculo().getPlaca() != "" &
                        cliente5.getNombrePropietario() != "" & cliente5.getTelefonoPropietario() > 0){
                    vehiculosExistentes=true;
                    clienteCinco = true;
                    numeroVehiculosExistentes++;
                }
            }

            switch (opcion){
                case 1:

                    if (numeroVehiculosExistentes < 5){
                        ingresado = false;

                        if (!clienteUno & !ingresado){
                            solicitarDatosUsuario(cliente1);

                            if (cliente1.getNombrePropietario()!= "" & cliente1.getTelefonoPropietario() >0 & cliente1.getVehiculo().getMarca() !="" & cliente1.getVehiculo().getPlaca() != ""){
                               if (cliente1.getVehiculo().getPlaca().equals(cliente2.getVehiculo().getPlaca()) ||
                                       cliente1.getVehiculo().getPlaca().equals(cliente3.getVehiculo().getPlaca()) ||
                                       cliente1.getVehiculo().getPlaca().equals(cliente4.getVehiculo().getPlaca()) ||
                                       cliente1.getVehiculo().getPlaca().equals(cliente5.getVehiculo().getPlaca())
                                       ){
                                   limpiarEspacioParqueo(cliente1);
                                   ingresado = true;
                                   System.out.println("\n\nYa se ha ingresado un vehiculo  con las mismas placas...\n\n");
                               }else {
                                   confirmacionIngreso(cliente1);
                                   ingresado = true;
                               }
                            }else{
                                limpiarEspacioParqueo(cliente1);
                                System.out.println("\n\nError, faltaron campos por llenar\n\n");
                            }

                        }
                        if (!clienteDos & !ingresado){
                            solicitarDatosUsuario(cliente2);
                            if (cliente2.getNombrePropietario()!= "" & cliente2.getTelefonoPropietario() > 0 & cliente2.getVehiculo().getMarca() !="" & cliente2.getVehiculo().getPlaca() != ""){
                                if (cliente2.getVehiculo().getPlaca().equals(cliente1.getVehiculo().getPlaca()) ||
                                        cliente2.getVehiculo().getPlaca().equals(cliente3.getVehiculo().getPlaca()) ||
                                        cliente2.getVehiculo().getPlaca().equals(cliente4.getVehiculo().getPlaca()) ||
                                        cliente2.getVehiculo().getPlaca().equals(cliente5.getVehiculo().getPlaca())
                                ){
                                    limpiarEspacioParqueo(cliente2);
                                    ingresado = true;
                                    System.out.println("\n\nYa se ha ingresado un vehiculo  con las mismas placas...\n\n");
                                }else {
                                    confirmacionIngreso(cliente1);
                                    ingresado = true;
                                }
                            }else{
                                limpiarEspacioParqueo(cliente2);
                                System.out.println("\n\nError, faltaron campos por llenar\n\n");
                            }

                        }

                        if (!clienteTres & !ingresado){
                            solicitarDatosUsuario(cliente3);
                            if (cliente3.getNombrePropietario()!= "" & cliente3.getTelefonoPropietario() >0 & cliente3.getVehiculo().getMarca() !="" & cliente3.getVehiculo().getPlaca() != ""){
                                if (cliente3.getVehiculo().getPlaca().equals(cliente1.getVehiculo().getPlaca()) ||
                                        cliente3.getVehiculo().getPlaca().equals(cliente2.getVehiculo().getPlaca()) ||
                                        cliente3.getVehiculo().getPlaca().equals(cliente4.getVehiculo().getPlaca()) ||
                                        cliente3.getVehiculo().getPlaca().equals(cliente5.getVehiculo().getPlaca())
                                ){
                                    limpiarEspacioParqueo(cliente3);
                                    ingresado = true;
                                    System.out.println("\n\nYa se ha ingresado un vehiculo  con las mismas placas...\n\n");
                                }else {
                                    confirmacionIngreso(cliente3);
                                    ingresado = true;
                                }
                            }else{
                                limpiarEspacioParqueo(cliente3);
                                System.out.println("\n\nError, faltaron campos por llenar\n\n");
                            }
                        }

                        if (!clienteCuatro & !ingresado){
                            solicitarDatosUsuario(cliente4);
                            if (cliente4.getNombrePropietario()!= "" & cliente4.getTelefonoPropietario() >0 & cliente4.getVehiculo().getMarca() !="" & cliente4.getVehiculo().getPlaca() != ""){
                                if (cliente4.getVehiculo().getPlaca().equals(cliente1.getVehiculo().getPlaca()) ||
                                        cliente4.getVehiculo().getPlaca().equals(cliente2.getVehiculo().getPlaca()) ||
                                        cliente4.getVehiculo().getPlaca().equals(cliente3.getVehiculo().getPlaca()) ||
                                        cliente4.getVehiculo().getPlaca().equals(cliente5.getVehiculo().getPlaca())
                                ){
                                    limpiarEspacioParqueo(cliente4);
                                    ingresado = true;
                                    System.out.println("\n\nYa se ha ingresado un vehiculo  con las mismas placas...\n\n");
                                }else {
                                    confirmacionIngreso(cliente4);
                                    ingresado = true;
                                }
                            }else{
                                limpiarEspacioParqueo(cliente4);
                                System.out.println("\n\nError, faltaron campos por llenar\n\n");
                            }
                        }

                        if (!clienteCinco & !ingresado){
                            solicitarDatosUsuario(cliente5);
                            if (cliente5.getNombrePropietario()!= "" & cliente5.getTelefonoPropietario() >0 & cliente5.getVehiculo().getMarca() !="" & cliente5.getVehiculo().getPlaca() != ""){
                                if (cliente5.getVehiculo().getPlaca().equals(cliente1.getVehiculo().getPlaca()) ||
                                        cliente5.getVehiculo().getPlaca().equals(cliente2.getVehiculo().getPlaca()) ||
                                        cliente5.getVehiculo().getPlaca().equals(cliente3.getVehiculo().getPlaca()) ||
                                        cliente5.getVehiculo().getPlaca().equals(cliente4.getVehiculo().getPlaca())
                                ){
                                    limpiarEspacioParqueo(cliente5);
                                    ingresado = true;
                                    System.out.println("\n\nYa se ha ingresado un vehiculo  con las mismas placas...\n\n");
                                }else {
                                    confirmacionIngreso(cliente5);
                                    ingresado = true;
                                }
                            }else{
                                limpiarEspacioParqueo(cliente5);
                                System.out.println("\n\nError, faltaron campos por llenar\n\n");
                            }
                        }
                    }else {
                        System.out.println("\n\nEL PARQUEADERO SE ENCUENTRA LLENO\n\n");
                    }

                    break;
                case 2:
                    if (vehiculosExistentes){
                        System.out.println("ingrese la placa delvehiculo a retirar: ");
                        placa = input.next();
                        System.out.println("Ingrese su nombre: ");
                        nombreCompleto = input.next();

                        if (!retirado & placa.equals(cliente1.getVehiculo().getPlaca()) & nombreCompleto.equals(cliente1.getNombrePropietario())){
                            limpiarEspacioParqueo(cliente1);
                            clienteUno = false;
                            retirado = true;
                        }

                        if (!retirado & placa.equals(cliente2.getVehiculo().getPlaca()) & nombreCompleto.equals(cliente2.getNombrePropietario())){
                            limpiarEspacioParqueo(cliente2);
                            clienteDos = false;
                            retirado = true;
                        }

                        if (!retirado & placa.equals(cliente3.getVehiculo().getPlaca()) & nombreCompleto.equals(cliente3.getNombrePropietario())){
                            limpiarEspacioParqueo(cliente3);
                            clienteTres = false;
                            retirado = true;
                        }

                        if (!retirado & placa.equals(cliente4.getVehiculo().getPlaca()) & nombreCompleto.equals(cliente4.getNombrePropietario())){
                            limpiarEspacioParqueo(cliente4);
                            clienteCuatro = false;
                            retirado = true;
                        }

                        if (!retirado & placa.equals(cliente5.getVehiculo().getPlaca()) & nombreCompleto.equals(cliente5.getNombrePropietario())){
                            limpiarEspacioParqueo(cliente5);
                            clienteCinco = false;
                            retirado = true;
                        }

                        if (retirado){
                            System.out.println("\n\nRETIRO EXITOSO\n\n");
                        }else{
                            System.out.println("\n\nRETIRO RECHAZADO, los datos ingresados no coinciden\n\n");
                        }

                    }else{
                        System.out.println("\n\nNo hay vehiculos en el parqueadero por retirar\n\n");
                    }
                    break;

                case 3:
                    if (vehiculosExistentes){

                        System.out.println("Ingrese la placa del vehiculo a consultar: ");
                        placa = input.next();

                        if (placa.equals(cliente1.getVehiculo().getPlaca())){
                            consultarVehiculo(cliente1);
                        }
                        if (placa.equals(cliente2.getVehiculo().getPlaca())){
                            consultarVehiculo(cliente2);
                        }
                        if (placa.equals(cliente3.getVehiculo().getPlaca())){
                            consultarVehiculo(cliente3);
                        }
                        if (placa.equals(cliente4.getVehiculo().getPlaca())){
                            consultarVehiculo(cliente4);
                        }
                        if (placa.equals(cliente5.getVehiculo().getPlaca())){
                            consultarVehiculo(cliente5);
                        }

                        if (!encontrado){
                            System.out.println("\n\nEl vehiculo que busca no se encuentra en este parqueadero\n\n");
                        }

                    }else{
                        System.out.println("\n\nNo hay vehiculos en el parqueadero por Consultar\n\n");
                    }
                    break;
                case 4:
                    if (vehiculosExistentes){
                        if (clienteUno){
                            mostrarVehiculos(1, cliente1);
                        }
                        if (clienteDos){
                            mostrarVehiculos(2, cliente2);
                        }
                        if (clienteTres){
                            mostrarVehiculos(3, cliente3);
                        }
                        if (clienteCuatro){
                            mostrarVehiculos(4, cliente4);
                        }
                        if (clienteCinco){
                            mostrarVehiculos(5, cliente5);
                        }
                    }else {
                        System.out.println("\n\nEL PARQUEADERO SE ENCUENTRA VACIO \n\n");
                    }
                    break;

            }

        }while(opcion != 5);

        System.out.println("\n\nHASTA PRONTO\n\n");

    }

}
