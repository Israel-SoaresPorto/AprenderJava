package com.aprenderjava.orientacaoaobjetos.classesuteis;

/**
 * Classe para realizar operacões com números e arrays int
 * Classe com métodos estáticos(não precisa criar um objeto da classe)
 */

public class Operacoes {

    private static int soma;
    private static int produto = 1;
    private static int maior;
    private static int menor;

    //metódo para somar valores de números/arrays
    public static int calculoSoma(int... array) {
        for (int j : array) {
            soma += j;
        }
        return soma;
    }

    //método para multiplicar valores de números/array
    public static int calculoProduto(int... array){
        for (int j : array) {
            produto *= j;
        }
        return produto;
    }

    //método para calcular a média dos valores de números/array
    public static double calculoMedia(int... array) {
        for (int j : array) {
            soma += j;
        }
        return soma / array.length;
    }

    //método para verificar maior valor de números/array
    public static int maiorValor(int... array) {
        maior = array[0];
        for (int i : array) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    //método para verificar maior valor entre dois números(retorna true ou false)
    public static boolean verificarMaior(int x, int y) {
        return x > y;
    }

    //método para verificar menor valor de números/array
    public static int menorValor(int... array) {
        menor = array[0];
        for (int i : array) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    //método para verificar menor valor entre dois números(retorna true ou false)
    public static boolean verificarMenor(int x, int y) {
        return x < y;
    }

    //método para verificar igualdade entre dois números
    public static boolean verificarIgualdade(int x, int y) {
        return x == y;
    }

    //método para verificar se um número é par
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    //método para verificar se um número é impar
    public static boolean eImpar(int numero) {
        return numero % 2 == 1;
    }
}
