package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia uma sequência de números do usuário e realize a
        //soma desses números. Encerre a execução quando um número negativo for digitado.
        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o numero");
            int numero = leitor.nextInt();
            if (numero < 0) {
                System.out.println("numero negativo dectado, encerrando aplicação");
                break;
            } else {
                continue;
            }
        }

    }
}
