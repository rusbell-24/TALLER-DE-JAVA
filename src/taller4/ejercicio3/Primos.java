package taller4.ejercicio3;

public class Primos {

    private int[] vectorPrimos = new int[168];
    private  int primos = 0;

    public Primos() {
    }

    public void guardarPrimos(){
        int indice = 0, contador = 0;

        for (int i = 2; i <= 1000; i++){
            for (int j = 1; j <= i; j++){
                if ((i % j) == 0){
                    contador++;
                }
                if (contador > 2){
                    j = 1000;
                }
            }
            if (contador <= 2){
                primos++;
                vectorPrimos[indice] = i;
                indice++;
            }
            contador = 0;
        }
    }

    public void imprimirPrimos(){
        for (int i = 0; i < primos; i++){
            System.out.print(vectorPrimos[i]);
            if (i < (primos - 1)){
                System.out.print(", ");
            }
        }
    }

    public int getPrimos() {
        return primos;
    }
}
