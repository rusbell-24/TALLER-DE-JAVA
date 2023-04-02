package taller3.ejercicio3;

public class Figura {

    private int limite;
    private int limite2;
    private int contador;
    private int contador2;
    private int vuelta;

    public Figura() {
    }

    public void imprimirFigura(){

        limite = 11;
        limite2 = limite;
        contador = 1;
        vuelta = 1;


        do {
            contador2 = 0;
            do {
                if (contador2 > 0) {
                    System.out.print(" ");
                }
                contador2++;
            }while (contador2 <= (limite - contador));

            do {
                System.out.print("*");
                contador2++;
            }while (contador2 <= limite);

            if(contador > 1){
                contador2 = 1;
                do {
                    System.out.print("*");
                    contador2++;
                }while (contador2 < contador);

            }

            if (vuelta == 1 & contador == limite2){
                contador = 1;
                limite2 = 2;
                vuelta++;
            }
            if (vuelta == 2 & contador == limite2){
                contador = 1;
                limite2 = 4;
                vuelta++;
            }
            System.out.println("");
            contador++;

        }while (contador <= limite2);
    }
}
