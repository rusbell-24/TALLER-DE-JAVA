package taller3.ejercicio8;

/*
   La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus
   clientes en los cursos de enseñanza automovilística y establecer quienes lo han aprobado para
   continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir
   registrar su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la
   prueba del curso (si fueron aprobados o no). Recuerde que el sistema debe terminar cuando el
   usuario así lo indique. Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.

* */

import java.util.Scanner;

public class Escuela {

    public static void inicializarValores(Usuario usuario){
        usuario.setNombre("");
        usuario.setNumeroDocumento(0);
        usuario.setEstadoCurso(false);
        usuario.setNota(-1);
    }

    public static int menuPrincipal(){
        int opcion;

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("____________Escuela automovilistica EL MAESTRO_____________");
        System.out.println("");
        System.out.println("OPCIONES...................................................");
        System.out.println("");
        System.out.println("      1. Registrarme en el curso ");
        System.out.println("      2. Presentar prueba ");
        System.out.println("      3. Consultar usuarios que terminarón el curso");
        System.out.println("      4. Resultados de la prueba del curso");
        System.out.println("      5. Listar todos los usuarios");
        System.out.println("      6. Salir del sistema");
        System.out.println("-----------------------------------------------------------");
        System.out.print("	Ingrese su opcion: ");
        opcion =input.nextInt();
        return opcion;
    }

    public static void registro(Usuario usuario, String nombreRegistrar, long numeroDocumentoRegistrar){
        usuario.setNombre(nombreRegistrar);
        usuario.setNumeroDocumento(numeroDocumentoRegistrar);
        System.out.println("\n\nEl usuario " + usuario.getNombre() + " se registro de forma exitosa \n\n");
    }

    public static boolean presentarPrueba(Usuario usuario, long numeroDocumento){
        boolean examenPresentado = false;
        if (numeroDocumento == usuario.getNumeroDocumento()){
            if (usuario.getNota() == -1){
                usuario.setNota((int)(Math.random()*10+1));
                System.out.println("\n\nHola " + usuario.getNombre());
                System.out.println("Tu nota en la prueba es: " + usuario.getNota());
                if (usuario.getNota() >= 6) {
                    usuario.setEstadoCurso(true);
                }
                examenPresentado = true;
            }else {
                System.out.println("\nTu ya presentaste el examen anteriormente\n");
                examenPresentado = true;
            }
        }
        return examenPresentado;
    }

    public static void mostrarAprobados(Usuario usuario){
        System.out.println("-> Nombre: " + usuario.getNombre() + "   Cedula: " + usuario.getNumeroDocumento() + "   Nota: " + usuario.getNota() );
    }

    public static boolean consultarResultado(Usuario usuario, long numeroDocumento){
        boolean encontrado = false;

        if (numeroDocumento == usuario.getNumeroDocumento()){
            if (usuario.getNota() != -1){
                encontrado = true;
                System.out.println("RESULTADOS____________________________");
                System.out.println("");
                System.out.println("Nombre:    " + usuario.getNombre());
                System.out.println("Documento: " + usuario.getNumeroDocumento());
                System.out.println("Nota:      " + usuario.getNota());
                if(usuario.isEstadoCurso()){
                    System.out.println("Estado:    Aprobado");
                }else {
                    System.out.println("Estado:    Reprobado");
                }
            }else {
                System.out.println("\n\nAun no has presentado el examen\n\n");
            }
        }
        return encontrado;
    }

    public static void listarEstudiantes(int indice, Usuario usuario){
        System.out.println("");
        System.out.println("Usuario #" + indice + ":");
        System.out.println("-> Nombre:   " + usuario.getNombre());
        System.out.println("-> Documento:   " + usuario.getNumeroDocumento());
    }


    public static void main(String[] args) {

        String nombreRegistrar;
        long numeroDocumentoRegistrar, numeroDocumento;

        int opcion, numeroUsuariosExistentes = 0;
        boolean usuarioUno = false, usuarioDos = false, usuarioTres = false, usuarioCuatro = false, usuarioCinco = false, usuarioSeix = false,  usuarioSiete = false, usuarioOcho = false;
        boolean registrado, usuariosExistentes = false, examenPresentado = false, encontrado= false;

        Usuario usuario1 = new Usuario("", 0, -1, false );
        Usuario usuario2 = new Usuario("", 0, -1, false );
        Usuario usuario3 = new Usuario("", 0, -1, false );
        Usuario usuario4 = new Usuario("", 0, -1, false );
        Usuario usuario5 = new Usuario("", 0, -1, false );
        Usuario usuario6 = new Usuario("", 0, -1, false );
        Usuario usuario7 = new Usuario("", 0, -1, false );
        Usuario usuario8 = new Usuario("", 0, -1, false );

        Scanner input = new Scanner(System.in);

        do {
            usuariosExistentes = false;
            examenPresentado = false;
            registrado = false;
            numeroUsuariosExistentes = 0;

            opcion = menuPrincipal();

            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5){
                if (!usuario1.getNombre().equals("") & usuario1.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioUno = true;
                }
                if (!usuario2.getNombre().equals("") & usuario2.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioDos = true;
                }
                if (!usuario3.getNombre().equals("") & usuario3.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioTres = true;
                }
                if (!usuario4.getNombre().equals("") & usuario4.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioCuatro = true;
                }
                if (!usuario5.getNombre().equals("") & usuario5.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioCinco = true;
                }
                if (!usuario6.getNombre().equals("") & usuario6.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioSeix = true;
                }
                if (!usuario7.getNombre().equals("") & usuario7.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioSiete = true;
                }
                if (!usuario8.getNombre().equals("") & usuario8.getNumeroDocumento() > 0 ){
                    numeroUsuariosExistentes++;
                    usuariosExistentes = true;
                    usuarioOcho = true;
                }
            }

            switch (opcion){
                case 1:

                    if (numeroUsuariosExistentes < 8){
                        System.out.print("Por favor ingrese su nombre: ");
                        nombreRegistrar = input.next();
                        System.out.print("Por favor ingrese su numero de documento: ");
                        numeroDocumentoRegistrar = input.nextInt();

                        if (!registrado & !usuarioUno){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario1,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }
                        if (!registrado & !usuarioDos){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario2,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }
                        if (!registrado & !usuarioTres){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario3,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }
                        if (!registrado & !usuarioCuatro){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario4,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }

                        if (!registrado & !usuarioCinco){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario5,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }
                        if (!registrado & !usuarioSeix){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario6,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }
                        if (!registrado & !usuarioSiete){
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0){
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario8.getNumeroDocumento()
                                ){
                                    registro(usuario7,nombreRegistrar,numeroDocumentoRegistrar);
                                    registrado = true;
                                }else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            }else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }

                        if (!registrado & !usuarioOcho) {
                            if (nombreRegistrar != "" & numeroDocumentoRegistrar > 0) {
                                if (numeroDocumentoRegistrar != usuario1.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario2.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario3.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario4.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario5.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario6.getNumeroDocumento() &
                                        numeroDocumentoRegistrar != usuario7.getNumeroDocumento()
                                ) {
                                    registro(usuario8, nombreRegistrar, numeroDocumentoRegistrar);
                                    registrado = true;
                                } else {
                                    System.out.println("Ya existe un usuario regsitrado con este numero de documento ");
                                    registrado = true;
                                }
                            } else {
                                System.out.println("\n\nError, Faltaron campos por llenar\n\n");
                            }
                        }

                    }else {
                        System.out.println("\n\nLa academia ya no cuenta con cupos disponibles. \n\n");
                    }

                    break;
                case 2:

                    if (usuariosExistentes){

                        System.out.println("por favor ingrese su numero de documento: ");
                        numeroDocumento = input.nextInt();

                        if (usuarioUno & !examenPresentado){
                            presentarPrueba(usuario1,numeroDocumento);
                        }

                        if (usuarioDos & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario2,numeroDocumento);
                        }
                        if (usuarioTres & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario3,numeroDocumento);
                        }
                        if (usuarioCuatro & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario4,numeroDocumento);
                        }
                        if (usuarioCinco & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario5,numeroDocumento);
                        }
                        if (usuarioSeix & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario6,numeroDocumento);
                        }
                        if (usuarioSiete & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario7,numeroDocumento);
                        }
                        if (usuarioOcho & !examenPresentado){
                            examenPresentado = presentarPrueba(usuario8,numeroDocumento);
                        }

                    }else {
                        System.out.println("\n\nNo existen usuarios para presentar prueba\n\n");
                    }

                    break;
                case 3:
                    if (usuariosExistentes){
                        if (usuario1.isEstadoCurso() || usuario2.isEstadoCurso() || usuario3.isEstadoCurso() ||
                            usuario4.isEstadoCurso() || usuario5.isEstadoCurso() || usuario6.isEstadoCurso() ||
                            usuario7.isEstadoCurso() || usuario8.isEstadoCurso()
                        ){
                            System.out.println("______LISTADO DE USUARIOS QUE APROBARON EL CURSO__________");
                            System.out.println("");

                            if (usuario1.isEstadoCurso()){
                                mostrarAprobados(usuario1);
                            }
                            if (usuario2.isEstadoCurso()){
                                mostrarAprobados(usuario2);
                            }
                            if (usuario3.isEstadoCurso()){
                                mostrarAprobados(usuario3);
                            }
                            if (usuario4.isEstadoCurso()){
                                mostrarAprobados(usuario4);
                            }
                            if (usuario5.isEstadoCurso()){
                                mostrarAprobados(usuario5);
                            }
                            if (usuario6.isEstadoCurso()){
                                mostrarAprobados(usuario6);
                            }
                            if (usuario7.isEstadoCurso()){
                                mostrarAprobados(usuario7);
                            }
                            if (usuario8.isEstadoCurso()){
                                mostrarAprobados(usuario8);
                            }

                        }else {
                            System.out.println("\n\nNingun estudiante a terminado el curso hasta el momento...\n\n");
                        }
                    }else {
                        System.out.println("\n\nNo se han ragistrado usuarios aun\n\n");
                    }

                    break;
                case 4:
                    if (usuariosExistentes){
                        System.out.print("por favor ingrese su numero de documento: ");
                        numeroDocumento = input.nextInt();

                        if (usuarioUno){
                            consultarResultado(usuario1, numeroDocumento);
                        }
                        if (usuarioDos){
                            consultarResultado(usuario2, numeroDocumento);
                        }
                        if (usuarioTres){
                            consultarResultado(usuario3, numeroDocumento);
                        }
                        if (usuarioCuatro){
                            consultarResultado(usuario4, numeroDocumento);
                        }
                        if (usuarioCinco){
                            consultarResultado(usuario5, numeroDocumento);
                        }
                        if (usuarioSeix){
                            consultarResultado(usuario6, numeroDocumento);
                        }
                        if (usuarioSiete){
                            consultarResultado(usuario7, numeroDocumento);
                        }
                        if (usuarioOcho){
                            consultarResultado(usuario8, numeroDocumento);
                        }
                    }else {
                        System.out.println("\n\nNo existen usuarios para consultar\n\n");
                    }

                    break;
                case 5:
                    if (usuariosExistentes){
                        if (usuarioUno){
                            listarEstudiantes(1, usuario1);
                        }
                        if (usuarioDos){
                            listarEstudiantes(2, usuario2);
                        }
                        if (usuarioTres){
                            listarEstudiantes(3, usuario3);
                        }
                        if (usuarioCuatro){
                            listarEstudiantes(4, usuario4);
                        }
                        if (usuarioCinco){
                            listarEstudiantes(5, usuario5);
                        }
                        if (usuarioSeix){
                            listarEstudiantes(6, usuario6);
                        }
                        if (usuarioSiete){
                            listarEstudiantes(7, usuario7);
                        }
                        if (usuarioOcho){
                            listarEstudiantes(8, usuario8);
                        }
                    }else {
                        System.out.println("\n\nNo se han ragistrado usuarios\n\n");
                    }

                    break;

            }

        }while (opcion != 6);

        System.out.println("\n\nHASTA PRONTO......\n\n");

    }
}
