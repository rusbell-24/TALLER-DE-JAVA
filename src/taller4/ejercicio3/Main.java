package taller4.ejercicio3;

public class Main {

    public static void main(String[] args) {

        System.out.println("SISTEMA QUE IMPRIME LOS NUMEROS PRIMOS DEL 1 AL 1000.\n\n");
        Primos primos =new Primos();

        primos.guardarPrimos();

        System.out.println("La cantidad de numeros primos del 1 al 1000 es: " + primos.getPrimos());
        System.out.println("");
        System.out.println("Y son los siguientes: ");
        System.out.println("");
        System.out.print("Números primos: ");
        primos.imprimirPrimos();
    }
}
