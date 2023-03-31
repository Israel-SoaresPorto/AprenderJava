package com.aprenderjava.introducao;

import java.util.Scanner;

/**
 * Separa um número de cincos digitos
 */
public class SepararDigitos {
    public static void main(String[] args) {
        int d1, d2, d3, d4, numero;
        Scanner input = new Scanner(System.in);
        
        //entradda de dados
        System.out.print("Digite um número de cinco digitos: ");
        numero = input.nextInt();
        
        input.close();
        
        //realiza a separação de digitos
        d1 = numero / 10000;
        numero %= 10000;
        d2 = numero / 1000;
        numero %= 1000;
        d3 = numero / 100;
        numero %= 100;
        d4 = numero / 10;
        numero %= 10;
        
        //exibe o número separado
        System.out.printf("%d\t%d\t%d\t%d\t%d", d1, d2, d3, d4, numero);
    }
}
