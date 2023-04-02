package taller3.ejercicio1;

public class Figura {

    public Figura() {
    }

    public void imprimirFigura(){

        for (int filas=1; filas <= 10; filas++){
            for(int columnas = 1; columnas <= filas; columnas++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
