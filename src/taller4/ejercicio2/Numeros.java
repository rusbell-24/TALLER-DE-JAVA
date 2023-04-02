package taller4.ejercicio2;

public class Numeros {

    private int[] vectorNumeros = new int[20];

    public Numeros() {
    }

    public void llenarVector(){
        for (int i = 0; i < 20; i++){
            vectorNumeros[i] = ((int)(Math.random()*100+1));
        }
    }

    public void imprimirVector(){
        System.out.println("\nLos numeros generados son: ");
        for (int i = 0; i < 20; i++){
            System.out.print(vectorNumeros[i]);
            if (i < 19){
                System.out.print(", ");
            }
        }
    }

    public void imprimirPares(){
        int indice=0, pares=0;

        while (indice < 20){
            if ((vectorNumeros[indice] % 2) == 0){
                pares++;
                if (indice > 0 & pares > 1){
                    System.out.print(", ");
                }
                System.out.print(vectorNumeros[indice]);
            }
            indice++;
        }
        System.out.println("\nTotal numeros pares: " + pares + "\n");
    }

    public void imprimirImpares(){
        int indice=0, impares=0;

        while (indice < 20){
            if ((vectorNumeros[indice] % 2) != 0){
                impares++;
                if (indice > 0 & impares > 1){
                    System.out.print(", ");
                }
                System.out.print(vectorNumeros[indice]);
            }
            indice++;
        }
        System.out.println("\nTotal numeros impares: " + impares + "\n");
    }

}
