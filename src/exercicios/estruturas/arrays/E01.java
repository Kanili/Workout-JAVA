package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        // Crie um programa que leia um array de 10 inteiros e imprima a soma dos valores.
        int[] valores = new int[9];
        Scanner leitor = new Scanner(System.in);
        int valorTotal = 0;
        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o numero: ");
            valores[i] = leitor.nextInt();
        }
        for(int teste: valores){
            valorTotal += teste;
        }
        System.out.println(valorTotal);

    }

}