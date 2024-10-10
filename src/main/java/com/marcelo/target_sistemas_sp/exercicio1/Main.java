package exercicio1;

public class Main {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1; // igual a K++
            SOMA = SOMA + K; // igual a SOMA += K
        }
        System.out.println(SOMA); // igual a 91
    }
}
