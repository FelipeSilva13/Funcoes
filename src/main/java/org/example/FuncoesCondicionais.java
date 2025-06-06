package org.example;

import java.util.Scanner;

public class FuncoesCondicionais {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Funções com Condicionais
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Possui Carteira de Motorista? (true/false: )");
        boolean temCarteia = teclado.nextBoolean();

        System.out.println("Possui historico negativo? (true/false: )");
        boolean temHistoricoNegativo = teclado.nextBoolean();
        String resultado = verificarAcesso(idade, temCarteia, temHistoricoNegativo);
        System.out.println(resultado);

    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){
     if (idade >= 18 && temCarteira && !temHistoricoNegativo){
         return  "Acesso permitido: todos os critérios atendidos!";
     } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
         return "Acesso negado: Histórico negativo Detectado!";
     }else {
         return "Acesso negado: Critérios não atendidos!";
     }

    }

}
