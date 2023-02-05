package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        //Crie um programa que leia um array de 10 inteiros e imprima o número de valores positivos.
        int[] valores = new int[9];
        Scanner leitor = new Scanner(System.in);
        int numeroValores = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("diga valor");
            int valor = leitor.nextInt();
            if(valor < 0){
                numeroValores++;
        }
        System.out.println("valores = " + numeroValores);

    }
}
}
