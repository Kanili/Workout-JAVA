package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
        //A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
        Scanner leitor = new Scanner(System.in);
        System.out.print("numero:");
        int numero = leitor.nextInt();
        int na = numero;
        for (int i = numero; i >= 1; --i) {
            if(i == numero){
                continue;
            }else{
                na *= i;
            }


        }
        System.out.println(na);
    }
}
