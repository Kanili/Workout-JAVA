package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        // Crie um programa que leia um array de 10 números reais e imprima o maior valor.
        int[] valores = new int[9];
        Scanner leitor = new Scanner(System.in);
        int maior = 0, menor = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("diga valor");
            int valor = leitor.nextInt();
            valores[i] = valor;
            if(i == 1){
                maior = valor;
                menor = valor;
            }
            if(valor > maior){
                maior = valor;
            }else if(valor < menor){
                menor = valor;
            }
        }
        System.out.println("menor = "+menor);
        System.out.println("maior = "+maior);
        }

    }

