package com.aprenderjava.introducao;

import com.aprenderjava.orientacaoaobjetos.classesuteis.Operacoes;
import java.util.Scanner;

/**
 * verifica se um número é par ou impar
 */

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Insira um número: ");
        int numero = input.nextInt();
        
        input.close();
        
        if(Operacoes.ePar(numero)) {
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.printf("O número %d é impar.", numero);
        }
    }
}
