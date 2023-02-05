package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        // Guarde em um array 5 nomes. Em seguida solicite ao
        //usuário para consultar um nome. Procure tal nome no array,
        //caso exista, exiba esse nome e em qual bloco ele se encontra.
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite os nomes: ");
            nomes[i] = leitor.nextLine();
        }
        System.out.print("Procurar o nome: ");
        String nome = leitor.next();
        for (int j = 0; j < nomes.length; j++) {
            if(nomes[j].equals(nome)){
                System.out.println("ENCONTRADO posicao "+j);
            }
        }
    }
}
