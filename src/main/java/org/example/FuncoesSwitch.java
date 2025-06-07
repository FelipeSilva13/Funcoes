package org.example;

import java.util.Scanner;

public class FuncoesSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um dai da Semana: ");
        int dia = teclado.nextInt();
        String resultado = obterDiaSemana(dia);
        System.out.println(resultado);

    }
    public static String obterDiaSemana(int dia){
        switch (dia){
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Não é dia da semana";

        }
    }
}
