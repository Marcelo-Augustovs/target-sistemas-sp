package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

import static exercicio2.Calcular.isFibonacci;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean desejaContinuar = true;
        String escolhaDoUsuario;

        try {
            while (desejaContinuar) {
                System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
                int numeroEscolhido = scanner.nextInt();
                System.out.println(isFibonacci(numeroEscolhido));

                System.out.print("deseja continuar ? [s/n]: ");
                escolhaDoUsuario = scanner.next();
                if(escolhaDoUsuario.equals("n")) desejaContinuar = false;
            }
        } catch (InputMismatchException ex){
            System.out.println("Digite um valor valido! Caso deseja utilizar nossa aplicação e tente novamente");
        }
        System.out.println("Obrigado por usar nosso serviço! Fechando...");
        scanner.close();
    }
}