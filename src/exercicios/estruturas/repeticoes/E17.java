package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        //  Leia o nome um número do usuário um número N e escreva o nome dele na tela N
        //vezes.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome desejado");
        String nome = leitor.nextLine();
        System.out.println("Numero de vezes a ser repetido");
        int vezes = leitor.nextInt();

        for (int i = 1; i <= vezes; i++) {
            System.out.println(nome);
        }
    }
}
