package com.aprenderjava.introducao;

import java.util.Scanner;

/**
 * Calcula a área, diâmetro e circunferência de um círculo.
 */

public class CalculoDeCirculo {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        //entrada de dados para o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();
        
        input.close();
        
        //exibe a área, diâmetro e circunferencia do círculo 
        System.out.printf("Diâmetro do círculo: %.2f%n", 2 * raio);
        System.out.printf("Área do círculo: %.2f%n", 2 * Math.PI * raio);
        System.out.printf("Circunferência do círculo: %.2f%n", Math.PI * Math.pow(raio, 2));
    }
}
