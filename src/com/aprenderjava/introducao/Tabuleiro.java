package com.aprenderjava.introducao;

/**
 * imprime um tabuleiro
 */

public class Tabuleiro {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for(int j = 1; j <= 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
