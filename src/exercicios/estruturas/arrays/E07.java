package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        // Crie um programa que leia um array de 25 números inteiros e imprima a soma dos valores pares.
        int[] valores = new int[6];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.print(i+"/Digite o numero");
            valores[i] = leitor.nextInt();
        }
        for(int valor: valores){
            if(valor % 2 == 0){
                System.out.println("VALOR = "+ valor);
            }

        }
    }
}
