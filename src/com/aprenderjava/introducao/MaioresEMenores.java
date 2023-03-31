package com.aprenderjava.introducao;

import com.aprenderjava.orientacaoaobjetos.classesuteis.Operacoes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * verivica os maiores e menores valores de um grupo de números
 */

public class MaioresEMenores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];//array de números
        
        //entrada de dados para os números do array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("digite um número: ");
            numeros[i] = input.nextInt();
        }
        
        input.close();
        
        //exibe os números e o maior e menor valor
        System.out.println("Números: " + Arrays.toString(numeros));
        System.out.println("Maior número: " + Operacoes.maiorValor(numeros));
        System.out.println("Menor número: " + Operacoes.menorValor(numeros));
    }
}
