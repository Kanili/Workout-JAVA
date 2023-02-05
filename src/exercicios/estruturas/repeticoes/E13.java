package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        //Sem utilizar a operação de multiplicação, escreva um programa que multiplique dois
        //números inteiros. Por exemplo: 3 * 2 = 2 + 2 + 2.
        Scanner leitor = new Scanner(System.in);
        System.out.println("N1");
        int n1 = leitor.nextInt();
        System.out.println("N2");
        int n2 = leitor.nextInt();
        int resultado = 0;
        for(int i = 1; i <= n2; i++){
            resultado+=n1;
        }
        System.out.println(resultado);
    }
}
