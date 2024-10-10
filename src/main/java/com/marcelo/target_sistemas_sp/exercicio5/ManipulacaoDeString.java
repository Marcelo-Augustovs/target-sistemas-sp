package com.marcelo.target_sistemas_sp.exercicio5;

public class ManipulacaoDeString {
    public static String inverterString(String str) {
        String resultado = ""; // String para armazenar o resultado

        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i); // Adicionar o caractere ao resultado
        }

        return resultado; // Retornar a string invertida
    }
}
