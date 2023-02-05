package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba a média das idades.
        Scanner leitor = new Scanner(System.in);
        int mediaIdade = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Numero "+i);
            int idade = leitor.nextInt();
            mediaIdade += idade;
            if(i<=20){
                continue;
            }else{
                mediaIdade /= 20;
                break;
            }
        }
    }
}
