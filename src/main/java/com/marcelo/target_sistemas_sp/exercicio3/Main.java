package com.marcelo.target_sistemas_sp.exercicio3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Ler o JSON e mapear para uma lista de objetos Faturamento
            List<Faturamento> faturamentos = mapper.readValue(new File("C:\\Users\\T-GAMER\\Documents\\estudos\\Cursos em Andamento\\JAVA\\SpringBoot\\Desenvolvendo\\target-sistemas-sp\\src\\main\\java\\com\\marcelo\\target_sistemas_sp\\exercicio3\\dados.json"), new TypeReference<List<Faturamento>>() {});

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            // Calculando o menor, maior e a soma
            for (Faturamento f : faturamentos) {
                if (f.getValor() > 0) {  // Ignorar dias com faturamento zero
                    if (f.getValor() < menorFaturamento) {
                        menorFaturamento = f.getValor();
                    }
                    if (f.getValor() > maiorFaturamento) {
                        maiorFaturamento = f.getValor();
                    }
                    somaFaturamento += f.getValor();
                    diasComFaturamento++;
                }
            }

            // Calcular a média
            double mediaFaturamento = somaFaturamento / diasComFaturamento;

            // Contar os dias com faturamento acima da média
            int diasAcimaDaMedia = 0;
            for (Faturamento f : faturamentos) {
                if (f.getValor() > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibir os resultados
            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



