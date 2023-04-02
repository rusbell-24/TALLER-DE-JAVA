package taller4.ejercicio4;

public class Matriz {

    private int matrizNumeros[][] = new int[4][5];

    public Matriz() {
    }

    public void llenarMatriz(){
        int fila, columna, contador=1;

        for (fila = 0; fila < 4; fila++){
            for (columna = 0; columna < 5; columna++){
                matrizNumeros[fila][columna] = contador;
                contador++;
            }
        }
    }

    public void imprimirMatriz(){
        int fila, columna;
        for (fila = 0; fila < 4; fila++){
            for (columna = 0; columna < 5; columna++){
                if (matrizNumeros[fila][columna] < 10){
                    System.out.print("0" + matrizNumeros[fila][columna] + " ");
                }else {
                    System.out.print(matrizNumeros[fila][columna] + " ");
                }
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizIntercalada(){
        int fila, columna;

        for (fila = 0; fila < 4; fila++){

            if ((fila % 2) == 0){
                for (columna = 0; columna <= 4; columna++){
                    if (matrizNumeros[fila][columna] < 10){
                        System.out.print("0" + matrizNumeros[fila][columna] + " ");
                    }else {
                        System.out.print(matrizNumeros[fila][columna] + " ");
                    }
                }
            }else {
                for (columna = 4; columna >= 0; columna--){
                    if (matrizNumeros[fila][columna] < 10){
                        System.out.print("0" + matrizNumeros[fila][columna] + " ");
                    }else {
                        System.out.print(matrizNumeros[fila][columna] + " ");
                    }
                }
            }


            System.out.println("");

        }

    }
}

