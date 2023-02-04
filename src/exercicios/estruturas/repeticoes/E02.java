package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        // Leia 20 valores reais e calcule seu somatório utilizando a instrução while
        int total = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o total de numeros da sua somatoria");
        int totalNumeros = leitor.nextInt();
        for (int valores = 1; valores <= totalNumeros; valores++) {
            System.out.println("Number " + valores);
            int valor = leitor.nextInt();
            total += valor;
        }
        System.out.println("Valor total das somatoria " + total);

    }
}
