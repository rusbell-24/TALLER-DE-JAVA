package taller2.ejercicio5;

import java.util.Scanner;

public class Drogueria {

    private Producto productoComprado;
    private Producto productoDevuelto;

    //Metodo para comprar un producto
    public void comprarProducto(Producto producto){
        productoComprado = producto;
    }

    //Metodo para devolver un producto
    public void devolverProducto(Producto producto){
        productoDevuelto = producto;
    }

    public static void menuPrincipal(){
        System.out.println("...........DROGUERIA MI SALUD............");
        System.out.println("|                                       |");
        System.out.println("| *** Catalogo de productos***:         |");
        System.out.println("|                                       |");
        System.out.println("|        1. Analgesicos                 |");
        System.out.println("|        2. Vitaminas                   |");
        System.out.println("|        3. Laxantes                    |");
        System.out.println("|---------------------------------------|");
        System.out.print("|  	Ingrese su opcion:   ");
    }


    public static void main(String[] args) {

        int opcionCategoria;
        int opcionProducto;
        int opcionFinal;
        Producto productoActual = null;
        int cantidad;

        Producto productoA1 = new Producto("analgesicos","Acetaminofen", 2000, "Caja x 10 unidades");
        Producto productoA2 = new Producto("analgesicos","Dolex", 5000, "Caja x 4 unidades");
        Producto productoA3 = new Producto("analgesicos","Advil", 4500, "Caja x 6 unidades");

        Producto productoV1 = new Producto("vitaminas","Vitacerebrina",15000,"Tarro x 1/2 litro");
        Producto productoV2 = new Producto("vitaminas","Vitamina",6000,"Caja x 30 unidades");
        Producto productoV3 = new Producto("vitaminas","Tarrito rojo",14000,"Tarro x 500 gramos");

        Producto productoL1 = new Producto("laxantes","Dulcolax",30000,"Caja x 6 unidades");
        Producto productoL2 = new Producto("laxantes","Pedia-Lax",25000,"Caja x 8 unidades");
        Producto productoL3 = new Producto("laxantes","MiraLax",20000,"Caja x 4 unidades");

        Scanner input = new Scanner(System.in);

        Drogueria drogueria = new Drogueria();

        Drogueria.menuPrincipal();
        opcionCategoria = input.nextInt();
        switch (opcionCategoria){
            case 1:
                System.out.println(" \n\n-----------ANALGESICOS-----------");
                System.out.println("                                 ");
                System.out.println("    1. " + productoA1.getNombre());
                System.out.println("    2. " + productoA2.getNombre());
                System.out.println("    3. " + productoA3.getNombre());
                System.out.println("-----------------------------------");
                System.out.print("   Ingrese su opcion: ");
                opcionProducto = input.nextInt();

                switch (opcionProducto){
                    case 1:
                        productoActual = productoA1;
                        break;
                    case 2:
                        productoActual = productoA2;
                        break;
                    case 3:
                        productoActual = productoA3;
                        break;
                    default:
                        System.out.println("El producto seleccionado no existe en nuestro catalogo");
                        break;

                }
                break;
            case 2:
                System.out.println(" \n\n-----------VITAMINAS-----------");
                System.out.println("                                 ");
                System.out.println("    1. " + productoV1.getNombre());
                System.out.println("    2. " + productoV2.getNombre());
                System.out.println("    3. " + productoV3.getNombre());
                System.out.println("-----------------------------------");
                System.out.print("   Ingrese su opcion: ");
                opcionProducto = input.nextInt();

                switch (opcionProducto){
                    case 1:
                        productoActual = productoV1;
                        break;
                    case 2:
                        productoActual = productoV2;
                        break;
                    case 3:
                        productoActual = productoV3;
                        break;
                    default:
                        System.out.println("El producto seleccionado no existe en nuestro catalogo");
                        break;

                }
                break;
            case 3:
                System.out.println(" \n\n-----------LAXANTES-----------");
                System.out.println("                                 ");
                System.out.println("    1. " + productoL1.getNombre());
                System.out.println("    2. " + productoL2.getNombre());
                System.out.println("    3. " + productoL3.getNombre());
                System.out.println("-----------------------------------");
                System.out.print("   Ingrese su opcion: ");
                opcionProducto = input.nextInt();

                switch (opcionProducto){
                    case 1:
                        productoActual = productoL1;
                        break;
                    case 2:
                        productoActual = productoL2;
                        break;
                    case 3:
                        productoActual = productoL3;
                        break;
                    default:
                        System.out.println("El producto seleccionado no existe en nuestro catalogo");
                        break;

                }
                break;
            default:
                System.out.println("\n\nEl producto seleccionado no existe en nuestro catalogo\n");
                break;
        }

        if (productoActual != null){
            System.out.println("\n\n" + productoActual.getNombre());
            System.out.println("-------------------------------------------------------");
            System.out.println(productoActual.getDescripcion());
            System.out.println("-------------------------------------------------------");
            System.out.println("OPCIONES DE PRODUCTO-----------------------------------");
            System.out.println("  1. Ver precio");
            System.out.println("  2. Comprar");
            System.out.println("  3. Devolución");
            System.out.println("  4. Salir");
            System.out.println("-------------------------------------------------------");
            System.out.print("   Ingrese su opcion: ");
            opcionFinal = input.nextInt();

            switch (opcionFinal){
                case 1:
                    System.out.println("El precio del "+ productoActual.getNombre() + " es "+ productoActual.getPrecio());
                    break;
                case 2:
                    drogueria.productoComprado = productoActual;
                    break;
                case 3:
                    drogueria.productoDevuelto = productoActual;
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;

            }
        }

        if (drogueria.productoComprado != null){
            System.out.println("\n\nIndique la cantidad que desea llevar(en unidades): ");
            cantidad = input.nextInt();

            Usuario usuario1 = new Usuario();

            usuario1.pedirDatos();

            if (usuario1.getNombre() != "" & usuario1.getCedula() > 0 & usuario1.getTelefono() > 0 & cantidad > 0 ){
                drogueria.productoComprado.setPrecio(drogueria.productoComprado.getPrecio() * cantidad);

                System.out.println("--------COMPRA EXITOSA--------");
                System.out.println("Datos de compra\n");
                System.out.println("Nombre de producto:   " +  drogueria.productoComprado.getNombre());
                System.out.println("Cantidad de producto: " + cantidad + " unds");
                System.out.println("Total a pagar:        " + drogueria.productoComprado.getPrecio());
                System.out.println("Nombre del cliente:   " + usuario1.getNombre());
                System.out.println("Cedula del cliente:   " + usuario1.getCedula());
                System.out.println("Telefono del cliente: " + usuario1.getTelefono());
            }else {
                System.out.println("\nError, Faltaron campos por llenar");
            }
        }

        if (drogueria.productoDevuelto != null){
            System.out.println("PROCESO DE DEVOLUCION DE PRODUCTO--------");
            Usuario usuario = new Usuario();

            usuario.pedirDatos();
            System.out.println("Describa el por que devuelve el producto: ");
            drogueria.productoDevuelto.setAnotacion(input.nextLine());
            System.out.println("Indique la cantidad que desea llevar(en unidades)");
            cantidad = input.nextInt();


            if (usuario.getNombre() != "" & usuario.getCedula() > 0 & usuario.getTelefono() > 0 & drogueria.productoDevuelto.getAnotacion() != "" & cantidad > 0 ){

                System.out.println("--------DEVOLUCION EN PROCESO--------");
                System.out.println("Datos de devolucion\n");
                System.out.println("Nombre de producto devuelto:   " +  drogueria.productoDevuelto.getNombre());
                System.out.println("Nombre del cliente:   " + usuario.getNombre());
                System.out.println("Cedula del cliente:   " + usuario.getCedula());
                System.out.println("Telefono del cliente: " + usuario.getTelefono());
                System.out.println("Descripción de devolucion: " + drogueria.productoDevuelto.getAnotacion());
                System.out.println("Cantidad de producto: " + cantidad + " unds");
            }else {
                System.out.println("\nError, Faltaron campos por llenar");
            }
        }
    }
}
