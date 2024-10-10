package com.marcelo.target_sistemas_sp.exercicio4;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        double totalFaturamento = 0;
        for (double valor : faturamento.values()) {
            totalFaturamento += valor;
        }

        System.out.println("Estado     Faturamento      Percentual");
        for (String estado : faturamento.keySet()) {
            double valor = faturamento.get(estado);
            double percentual = (valor / totalFaturamento) * 100;


            System.out.printf("%-10s R$%-14.2f %.2f%%%n", estado, valor, percentual);
        }
    }
}


