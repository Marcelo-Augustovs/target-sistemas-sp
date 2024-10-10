package com.marcelo.target_sistemas_sp.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a mensagem a ser invertida: ");
        String mensagem = scanner.nextLine();
        System.out.println("Mensagem invertida = " + ManipulacaoDeString.inverterString(mensagem));
        scanner.close();
    }
}