package com.aprenderjava.introducao;

import java.util.Scanner;
/**
 * @author IsraelSoares
 * verifica se um número é multiplo de outro
 */
public class MultiploDe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        
        //entrada de dados para os dois números
        System.out.print("digite um número: ");
        primeiroNumero = input.nextInt();

        System.out.print("digite outro número: ");
        segundoNumero = input.nextInt();
        
        input.close();
        
        
        if(primeiroNumero / segundoNumero == 0) {
        	//exibe se primeiro número é multiplo do segundo
            System.out.printf("%d é multiplo de %d.", primeiroNumero, segundoNumero);
        } else {
        	//exibe se primeiro número não é multiplo do segundo
            System.out.printf("%d não é multiplo de %d.", primeiroNumero, segundoNumero);
        }
    }
}
