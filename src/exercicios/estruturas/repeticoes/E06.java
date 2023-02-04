package exercicios.estruturas.repeticoes;
import java.util.Scanner;
public class E06 {
    public static void main(String[] args) {
        // Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
        //P.A. contendo 10 valores
        Scanner leitor = new Scanner(System.in);
        System.out.println("valor inicial:");
        int valorIncial = leitor.nextInt();
        System.out.println("valor da razao");
        int razao = leitor.nextInt();
        int valor = valorIncial;
        for(int i = 1; i <= 10; i++){
            valor += razao;
            System.out.println(i+", "+valor);
        }

    }
}
