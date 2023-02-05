package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        //Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " <= " + nome);
            i++;
        }
    }
}
