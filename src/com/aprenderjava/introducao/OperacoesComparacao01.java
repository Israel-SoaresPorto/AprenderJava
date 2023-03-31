package com.aprenderjava.introducao;

import com.aprenderjava.orientacaoaobjetos.classesuteis.Operacoes;
import java.util.Scanner;

/**
 * realiza a soma, multiplicação e média de três números inteiros;
 * exibe qual é o maior ou menor.
 */

public class OperacoesComparacao01 {
    public static void main(String[] args) {
        int[] numeros = new int[3];//array dos números
        Scanner input = new Scanner(System.in);
        
        //entrada de dados dos números 
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = input.nextInt();
        }
        
        input.close();
        
        //exibe os resultados
        System.out.println("soma: " + Operacoes.calculoSoma(numeros));
        System.out.println("produto: " + Operacoes.calculoProduto(numeros));
        System.out.println("média: " + Operacoes.calculoMedia(numeros));
        System.out.println("maior número: " + Operacoes.maiorValor(numeros));
        System.out.println("menor número: " + Operacoes.menorValor(numeros));
    }
}
