package exercicios.estruturas.arrays;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        // Guarde em um array 5 idades. Exiba quantas pessoas são
        //maior de idade (18 anos) e quantas são menores
        int[] valores = new int[5];
        Scanner leitor = new Scanner(System.in);
        int maiores = 0, menores = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite as idades");
            valores[i] = leitor.nextInt();
        }

        for(int lista: valores){
            if(lista >= 18){
                maiores++;
            }else {
                menores++;
            }

        }
        System.out.println("Maiores: "+maiores);
        System.out.println("Menores: "+menores);

    }
}
