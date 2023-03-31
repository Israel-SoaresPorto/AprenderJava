package com.aprenderjava.introducao;

import com.aprenderjava.orientacaoaobjetos.classesuteis.Operacoes;
import java.util.Scanner;

/**
 * verifica se um número é maior ou igual ao outro
 */

public class MaiorOuIgual {
    public static void main(String[] args) {
        int primeiroNumero;
        int segundoNumero;
        Scanner input = new Scanner(System.in);
        
        //entrada de dados para os números
        System.out.print("Digite o primeiro número: ");
        primeiroNumero = input.nextInt();

        System.out.print("Digite o segundo número: ");
        segundoNumero = input.nextInt();
        
        input.close();
        
        
        if(Operacoes.verificarMaior(primeiroNumero, segundoNumero)) {
        	//exibe se primeiro número é maior
            System.out.printf("%d é maior que %d.", primeiroNumero, segundoNumero);
        } else if (Operacoes.verificarIgualdade(primeiroNumero, segundoNumero)) {
        	//exibe se números são iguais
            System.out.println("esses números são iguais.");
        } else {
        	//exibe se segundo número é menor
            System.out.printf("%d é maior que %d.", segundoNumero, primeiroNumero);
        }
    }
}
