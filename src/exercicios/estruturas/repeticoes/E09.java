package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        //Faça um programa que leia as tecla digitadas pelo usuário uma a uma e as mostre na tela. O
        //programa somente deve ser encerrado quando a tecla “#” for pressionada.
        Scanner leitor = new Scanner(System.in);
        int caractere = 0;

        while(caractere != 1){
            System.out.print("Digite o caractere requerido: ");
            caractere = leitor.nextInt();
            System.out.println(caractere);
        }
    }
}
