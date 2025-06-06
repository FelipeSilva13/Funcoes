package org.example;

public class Funcoes {
    public static void main(String[] args) {

        //Criando a primeiora função
        saudacao();

        //Passando parâmetros
        soma(2, 4);
        soma(5, 6);

        saudar("Felipe");

    }

    public static void saudacao() {

        System.out.println("Olá, esta é minha primeira função!");
    }

    public static void soma(int a, int b){

        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);

    }

    public static void saudar(String nome){

        System.out.println("Olá, " +  nome +", tudo bem?");

    }

}
