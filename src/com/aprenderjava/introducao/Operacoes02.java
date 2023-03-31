package com.aprenderjava.introducao;

import java.util.Scanner;

/**
 * realizandos operações matemáticas
 */

public class Operacoes02 {
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero;
        int soma, subtracao, produto;
        double divisao;
        Scanner input = new Scanner(System.in);
        
        //entrada de dados dos números
        System.out.print("Digite o primeiro número: ");
        primeiroNumero = input.nextInt();

        System.out.print("Digite o segundo número: ");
        segundoNumero = input.nextInt();
        
        input.close();
        
        //realiza as operações entreos números
        soma = primeiroNumero + segundoNumero;
        subtracao = primeiroNumero - segundoNumero;
        divisao = primeiroNumero / segundoNumero;
        produto = primeiroNumero * segundoNumero;
        
        //exibe os resultados
        System.out.println("soma: " + soma);
        System.out.println("subtraçaõ: " + subtracao);
        System.out.println("multiplicação: " + produto);
        System.out.println("divisão: " + divisao);
    }
}
