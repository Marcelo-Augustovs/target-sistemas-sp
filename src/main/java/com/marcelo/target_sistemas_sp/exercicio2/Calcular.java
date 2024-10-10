package exercicio2;

public class Calcular {

    public static String isFibonacci(int numeroEscolhido) {
        int valorInicial = 0;
        int segundoValor = 1;

        if (numeroEscolhido < 0) return String.format("O número %d pertence à sequência de Fibonacci.",numeroEscolhido);
        if (numeroEscolhido == valorInicial || numeroEscolhido == segundoValor ){
            return String.format("O número %d pertence à sequência de Fibonacci.",numeroEscolhido);
        }

        // Verificar se o NumeroEscolhido pertence a sequencia de Fibonacci
        int sequenciaFibonacci = valorInicial + segundoValor;
        while (sequenciaFibonacci <= numeroEscolhido) {
            if (sequenciaFibonacci == numeroEscolhido) {
                return String.format("O número %d pertence à sequência de Fibonacci.",numeroEscolhido);
            }
            valorInicial = segundoValor;
            segundoValor = sequenciaFibonacci;
            sequenciaFibonacci = valorInicial + segundoValor;
        }
       return String.format("O número %d não pertence à sequência de Fibonacci.",numeroEscolhido);
    }
}
