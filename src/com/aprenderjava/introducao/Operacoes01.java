package com.aprenderjava.introducao;

import com.aprenderjava.orientacaoaobjetos.classesuteis.Operacoes;

import java.util.Scanner;

/**
 * multiplicação de três números inteiros
 */

public class Operacoes01 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        
        //entrada de dados para os números
        System.out.print("Digite o primeiro número: ");
        x = input.nextInt();

        System.out.print("Digite o segundo número: ");
        y = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        z = input.nextInt();
        
        input.close();
        
        //exibe o produto
        System.out.println("O produto entre os três números é: "
                + Operacoes.calculoProduto(x, z, y));
    }
}
