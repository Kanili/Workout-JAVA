package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
        //números
        Scanner leitor = new Scanner(System.in);
        int valorTotal = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o "+i+" numero");
            int valorNumero = leitor.nextInt();
            valorTotal += valorNumero;
        }
        System.out.println(valorTotal);
    }
}
