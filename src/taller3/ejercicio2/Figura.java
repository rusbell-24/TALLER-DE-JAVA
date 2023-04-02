package taller3.ejercicio2;

public class Figura {

    private int contador = 1;
    private int limite = 10;
    private int contador2;

    public Figura() {
    }

    public void imprimirFigura(){

        while (contador <= limite){
            contador2 = 1;
            while (contador2 <= (limite - contador)){
                System.out.print(" ");
                contador2++;
            }
            while (contador2 <= limite){
                System.out.print("*");
                contador2++;
            }
            System.out.println("");
            contador++;
        }
    }
}
