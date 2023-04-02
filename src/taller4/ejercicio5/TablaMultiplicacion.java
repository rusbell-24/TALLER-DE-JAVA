package taller4.ejercicio5;

public class TablaMultiplicacion {

    private String matrizReferencia[][] = new String[10][10];
    private int matrizResultado[][] = new int[10][10];

    public TablaMultiplicacion() {
    }

    public void llenarMatrizReferencia(){
        int fila, columna;

        for (fila = 0; fila < 10; fila ++){
            for (columna = 0; columna < 10; columna++){
                matrizReferencia[fila][columna] = (columna + 1) + " x " + (fila +1);
            }
        }
    }

    public void llenarMatrizResultados(){
        int fila, columna;
        for (fila = 0; fila  < 10; fila++ ){
            for (columna = 0; columna < 10; columna++){
                matrizResultado[fila][columna] = ((columna + 1) * (fila + 1));
            }
        }
    }

    public void imprimirMatrizReferencia(){
        int fila, columna;

        for (fila = 0; fila < 10; fila++){
            System.out.print("-> Fila " + fila + ":    ");
            for (columna = 0; columna < 10; columna++){
                if (fila > 8){
                    System.out.print( matrizReferencia[fila][columna] + "   ");
                }else {
                    System.out.print( matrizReferencia[fila][columna] + "    ");
                }
            }
            System.out.println("");
        }
    }

    public int[][] getMatrizResultado() {
        return matrizResultado;
    }
}
