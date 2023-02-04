package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
        //P.G. contendo 10 valores.
        Scanner leitor = new Scanner(System.in);
        System.out.println("termo:");
        int termo = leitor.nextInt();
        System.out.println("razao");
        int razao = leitor.nextInt();
        int valor = termo;
        for(int i = 0; i < 10;i++){
            valor *= razao;
            if(i == 0){
                System.out.println("["+i+"] = "+ termo);
            } else {
                System.out.println("["+i+"] = "+valor);
            }

        }
    }
}
