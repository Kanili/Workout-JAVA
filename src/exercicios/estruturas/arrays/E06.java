package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        //Crie um programa que leia um array de 15 inteiros e imprima a média dos valores.
        int[] valores = new int[14];
        Scanner leitor = new Scanner(System.in);
        float media = 0;
        for (int i = 0; i <= valores.length; i++) {
            System.out.print(i+" | Digite o numeros: ");
            int numeros = leitor.nextInt();
            media += numeros;
        }
        System.out.println(media);
         media /= 15;

        System.out.println("a média é de: "+media);

    }
}
