package taller2.ejercicio9;

import java.util.Scanner;

public class Main {

    public static void mostrarMenuPrincipal(){
        System.out.println("CALCULAR AREA PARA: ___________\n");
        System.out.println("     1. Rectangulo ");
        System.out.println("     2. Triangulo ");
        System.out.println("     3. Trapecio ");
        System.out.println("     4. Salir ");
        System.out.println("-------------------------------");
        System.out.print("Ingrese su opcion: ");
    }

    public static void main(String[] args) {
        int opcionFigura;
        double base;
        double baseMenor;
        double altura;
        int divisor;

        Scanner input= new Scanner(System.in);

        mostrarMenuPrincipal();
        opcionFigura =input.nextInt();

        switch (opcionFigura){
            case 1:
                System.out.println("Ingrese la base del rectangulo(en metros): ");
                base = input.nextDouble();
                System.out.println("Ingrese la altura del rectandulo(en metros): ");
                altura = input.nextDouble();
                baseMenor = 0;
                divisor = 1;
                if (base > 0 & altura > 0){
                    Figura figuraActual= new Figura(base, baseMenor, altura, divisor);
                    figuraActual.calcular();
                    System.out.println("Para un rectangulo con base "+ figuraActual.getBase() + " y altura " +
                            figuraActual.getAltura());
                    System.out.println("Su area es: " + figuraActual.getResultado() + " m^2");
                }else{
                    System.out.println("Error, Los datos ingresados no son correctos");
                }
                break;
            case 2:
                System.out.println("Ingrese la base del Triangulo(en metros): ");
                base = input.nextDouble();
                System.out.println("Ingrese la altura del Trinagulo(en metros): ");
                altura = input.nextDouble();
                baseMenor = 0;
                divisor = 2;
                if (base > 0 & altura > 0){
                    Figura figuraActual= new Figura(base, baseMenor, altura, divisor);
                    figuraActual.calcular();
                    System.out.println("Para un triandulo con base "+ figuraActual.getBase() + " y altura " +
                            figuraActual.getAltura());
                    System.out.println("Su area es: " + figuraActual.getResultado() + " m^2");
                }else{
                    System.out.println("Error, Los datos ingresados no son correctos");
                }
                break;
            case 3:
                System.out.println("Ingrese la base menor del trapecio(en metros): ");
                baseMenor = input.nextDouble();
                System.out.println("Ingrese la base mayor del trapecio(en metros): ");
                base = input.nextDouble();
                System.out.println("Ingrese la altura del trapecio(en metros): ");
                altura = input.nextDouble();
                divisor = 2;
                if (baseMenor > 0 & baseMenor > 0 & altura > 0){
                    Figura figuraActual= new Figura(base, baseMenor, altura, divisor);
                    figuraActual.calcular();
                    System.out.println("Para un trapecio con base menor "+ figuraActual.getBaseMenor() +
                            ", base mayor " + figuraActual.getBase() + "y altura " + figuraActual.getAltura());
                    System.out.println("Su area es: " + figuraActual.getResultado() + " m^2");
                }else{
                    System.out.println("Error, Los datos ingresados no son correctos");
                }
                break;
            default:
                System.out.println("Opcion incorrecta, Hasta pronto...");
        }
    }
}
