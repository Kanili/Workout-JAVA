package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E14 {
    public static void main(String[] args) {
        // Escreva um programa para ler o ano de nascimento de uma pessoa e
        //escrever uma mensagem que diga se ela poderá ou não votar este ano
        //(não é necessário considerar o mês em que ela nasceu).

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a data: ");
        int data = leitor.nextInt();
        int idade = 2023 - data;
        System.out.println(idade);
        if(idade >= 18){
            System.out.println("Permitido votar");
        }else {
            System.out.println("Nao autorizado");
        }

    }
}
